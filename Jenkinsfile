pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Check') {
                steps {
                    sh 'mvn -v'
                }
            }
        
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
            stage('Unitary Test') {
                        steps {
                            echo 'to fix after'
                        }
            }
            stage('Quality Code') {
                        steps {
                            sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.135:9000 -Dsonar.login=1112eb90cf7270a077cb474fcc13ee80f1dc4352'
                        }
            }
            stage("Quality Gate") {
                steps {
                  echo 'execution of Quality Gate to implement'
                }
              }
            stage("Image build") {
                    steps {
                      echo 'image build to implement'
                    }
                  }
        
            stage("Push to Repository") {
                    steps {
                      echo 'push to repo to implement'
                    }
                  }
            stage("Run") {
                        steps {
                          echo 'run to implement'
                        }
                      }
            stage('Deliver') {
                        steps {
                            echo 'here just delivery'
                        }
            }
    }
}
