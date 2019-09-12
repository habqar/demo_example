pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Compile') {
                steps {
                    sh 'mvn compile'
                }
            }
            stage('Build') {
                steps {
                    sh 'mvn -B -DskipTests clean package'
                }
            }
            stage('Test') {
                        steps {
                            sh 'mvn test'
                        }
            }
            stage('Quality') {
                        steps {
                            sh 'mvn sonar:sonar'
                        }
            }
            stage('Deliver') {
                        steps {
                            echo 'here just delivery'
                        }
            }
    }
}