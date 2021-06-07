

pipeline{
    agent any
    stages{
        stage("build"){
           steps{
               echo 'THis is a build'
           }
        }
        stage("test"){
            steps{
               echo 'THis is a test'
           }
        }
        stage("deploy"){
            steps{
               echo 'This is a deploy'
           }
        }
    }
	post{
		always{
			echo 'Not sure about Build'
		}
		success{
			echo 'Build is Successful'
		}
	}
}