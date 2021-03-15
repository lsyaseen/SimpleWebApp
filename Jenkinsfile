node {
   stage('Preparation') {
      git 'https://github.com/lsyaseen/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}