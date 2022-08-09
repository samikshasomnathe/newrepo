pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git 'https://github.com/samikshasomnathe/studentapp-ui'
            }
        }
        stage('Build') { 
            steps {
                sh 'build'
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