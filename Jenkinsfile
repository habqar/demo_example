pipeline {
    agent any
    
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
                steps{
                    app = docker.build("demo")
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
