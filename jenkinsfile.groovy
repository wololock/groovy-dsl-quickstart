import static com.github.wololock.groovy.Dsl.pipeline

println '''
   ___                                ___ _            _ _            
  / _ \\_ __ ___   _____   ___   _    / _ (_)_ __   ___| (_)_ __   ___ 
 / /_\\/ '__/ _ \\ / _ \\ \\ / / | | |  / /_)/ | '_ \\ / _ \\ | | '_ \\ / _ \\
/ /_\\\\| | | (_) | (_) \\ V /| |_| | / ___/| | |_) |  __/ | | | | |  __/
\\____/|_|  \\___/ \\___/ \\_/  \\__, | \\/    |_| .__/ \\___|_|_|_| |_|\\___|
                            |___/          |_|                        
'''

pipeline {
    agent any

    environment {
        SOME_NUMBER = 123
        SOME_STRING = "foobar"
    }

    stages {
        stage("Build") {
            steps { env ->
                sh "ls -la"
                sh(script: 'date +%Y-%m-%d', returnStdout: false)
                echo "Groovy rocks!"
                echo "env.SOME_STRING = ${env.SOME_STRING}"
            }
        }
        stage("Test") {
            steps {
                sh "mvn -version"
            }
        }
    }
}
