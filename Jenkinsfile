node {
 stage('Preparation') {
  git 'https://github.com/lsyaseen/SimpleWebApp.git'
 }
 stage('Build') {
  sh "./gradlew clean test"
 }
 stage('Deploy') {
  sh "git push https://git.heroku.com/enigmatic-atoll-53775.git master"
 }
}
