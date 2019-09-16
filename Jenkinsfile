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
                            sh 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=78337fa39cc4e2b58c7009dfb070050ca67331ae'
                        }
            }
            stage('Deliver') {
                        steps {
                            echo 'here just delivery'
                        }
            }
    }
}
