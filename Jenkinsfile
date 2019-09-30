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
                            echo 'to fix after'
                        }
            }
            stage('Quality') {
                        steps {
                            sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.135:9000 -Dsonar.login= 1112eb90cf7270a077cb474fcc13ee80f1dc4352'
                        }
            }
            stage('Deliver') {
                        steps {
                            echo 'here just delivery'
                        }
            }
    }
}
