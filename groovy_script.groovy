pipeline {
    agent any
    
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World Eitan'
                script {
                    def rootDir = pwd()
                    
                    def greet = load rootDir + "/g_script.groovy"
                    greet.greet()
                }
            }
        }
    }
}
