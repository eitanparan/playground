pipeline {
    agent any
    
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World Eitan'
                scrips {
                    def rootDir = pwd()
                    def greet = load "${rootDir}@script/g_script.groovy"
                    greet.greet()
                }
            }
        }
    }
}
