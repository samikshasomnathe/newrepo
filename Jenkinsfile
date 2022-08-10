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
                echo "sonar.pullrequest.key=5"
                echo "sonar.pullrequest.brancch=feature/my-new-feature"
                echo "sonar.pullrequest.base=master"
                echo "Result ......Passed"
                echo "see full result on https://localhost.sonarqube.com/my_project"
            }
        }

        stage('Build') { 
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') { 
            steps {
                withSonarQubeEnv(credentialsId: 'sonar-pr') {
                    sh 'mvn sonar:sonar'
            }
        }
        }
        stage('Deploy') { 
            steps {
                echo "deployed"
            }
        }
    }
}