pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                gradle build
            }
        }
        stage('Test'){
            steps {
                gradle test
            }
        }
        stage('Deploy') {
            steps {
                echo 'deployed'
            }
        }
    }
}