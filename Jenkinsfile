pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Run coverage and CLEAN UP Before'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
             steps {
                echo 'Run Unit Tests'
                sh 'mvn test'
             }
        }
    }
}