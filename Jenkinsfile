pipeline {
    agent any

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
