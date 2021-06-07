

pipeline{
    agent any
    stages{
        stage("build"){
            echo 'This is a build stage'
        }
        stage("test"){
            echo 'This is a test stage'
        }
        stage("deploy"){
            echo 'THis is a deploy Stage'
        }
    }
}