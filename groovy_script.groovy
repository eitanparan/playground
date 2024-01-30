pipeline {
    agent any
    
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World Eitan'
                script {
                    
                    def greet = load "/var/jenkins_home/workspace/pipeline/g_script.groovy"
                    greet.greet()
                    greet.sayHello()
                }
            }
        }
    }
}
