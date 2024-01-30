pipeline {
    agent any
    
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World Eitan'
                script {
                    def rootDir = pwd()
                    echo "${rootDir}"
                    /*def greet = load "g_script.groovy"
                    greet.greet()*/
                }
            }
        }
    }
}
