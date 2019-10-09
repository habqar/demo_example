pipeline {
    environment {
        registry = "https://192.168.1.135:5050"
        registryCredential = 'private-docker-hub-credentiels' 
        APP_NAME = "demo"
        APP_CONTEXT_ROOT = "/"
        APP_LISTENING_PORT = "1010"
        TEST_CONTAINER_NAME = "ci-${APP_NAME}-${BUILD_NUMBER}"    
    }
    
    agent any
    
    stages {
        stage('Check') {
                steps {
                    sh 'mvn -v'
                }
            }
        
        stage('Compile') {
                steps {
                    sh 'mvn clean compile'
                }
            }
            stage('Package') {
                steps {
                    sh 'mvn -B -DskipTests package'
                }
            }
            stage('Unit Test') {
                        steps {
                            echo 'to fix after'
                        }
            }
            stage('Mutation Test') {
                        steps {
                            echo "-=- execute mutation tests -=-"
                            sh "./mvnw org.pitest:pitest-maven:mutationCoverage"
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
                  echo "-=- build Docker image -=-"
                  sh 'mvn docker:build'
                }
            }
            stage('Push docker image') {
                steps {
                    echo "-=- push Docker image -=-"
                    sh "mvn docker:push"
            }   
            }
            stage("Push to Repository") {
                    steps {
                      sh 'mvn -B -DskipTests deploy'
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
