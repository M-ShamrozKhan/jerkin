pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''#!/bin/bash

# Compile the Java program
javac Hello.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    # Run the compiled Java program
    java Hello
else
    echo "Compilation failed. Please check your code."
fi
'''
      }
    }

  }
}