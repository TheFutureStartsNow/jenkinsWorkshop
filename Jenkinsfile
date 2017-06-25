pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/TheFutureStartsNow/jenkinsWorkshop']]])
                sh './gradlew build'
            }
        }
        stage('Test'){
            steps {
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deployed'
            }
        }
    }
    post {
        success {
            echo "Wow, it worked"
        }
        fai
    }
}
