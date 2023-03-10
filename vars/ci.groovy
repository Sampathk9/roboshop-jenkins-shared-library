def call() {
    pipeline {

        agent {
            label 'ansible'
        }


        stages {

            stage('Compile/Build') {
                steps {
                    script{
                        common.compile

                    }
                }

            }

            stage('Unit Tests') {
                steps {
                    echo "Test"
                }

            }

            stage('Quality Control') {
                steps {
                    echo "QA"
                }
            }

            stage('Upload code to Centralized Place') {
                steps {
                    echo "Upload"
                }

            }


        }


    }

}