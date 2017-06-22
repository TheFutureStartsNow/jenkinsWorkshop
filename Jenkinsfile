pipeline {
    agent any
    checkout([$class: 'GitSCM', branches: [[name: '*/jenkinsfile']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/TheFutureStartsNow/jenkinsWorkshop']]])
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