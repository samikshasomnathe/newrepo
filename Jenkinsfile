pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git 'https://github.com/samikshasomnathe/studentapp-ui'
            }
        }
        stage('PR') {
            steps{
                echo "msg send success"
            }
        }

        stage('Build') { 
            steps {
                echo 'build'
            }
        }
        stage('Test') { 
            steps {
                echo "tested"
            }
        }
        stage('Deploy') { 
            steps {
                echo "deployed"
            }
        }
    }
}