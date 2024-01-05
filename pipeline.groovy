pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This step checks out the source code from your version control system (e.g., Git)
                // You need to configure your Jenkins job to use a specific SCM and repository.
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // This step compiles the Java code
                sh 'javac HelloWorld.java'
            }
        }

        stage('Run') {
            steps {
                // This step runs the compiled Java program
                sh 'java HelloWorld'
            }
        }
    }
}
