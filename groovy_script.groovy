pipeline {
    agent any
    
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World Eitan'
                script {
                    def rootDir = pwd()
                    
                    def greet = load "/var/jenkins_home/workspace/pipeline/Eitan.groovy"
                    def a = new greet()
                    a.greet()
                }
            }
        }
    }
}
