def call() {
    stage('Build') {
        sh 'mvn clean package'
    }
    stage('Test') {
        sh 'mvn test'
    }
}
