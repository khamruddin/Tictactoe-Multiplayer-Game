pipeline {
    agent {label 'Slave'}

    stages {
        stage('Code pull') {
           // when {
              //  expression {
                  //  String s = "NOT MERGED"
                   // if(params.merged) {
                      // s = "MERGED"
                  //  }
                  //  echo "PR CURRENT STATUS: ${params.current_status}"
                   // echo "PR MERGED STATUS: $s"
                   // return params.current_status == "closed" && params.merged == true
                //}
            //}
            steps {
                git 'https://github.com/khamruddin/Tictactoe-Multiplayer-Game.git'
            }
        }
        stage('Build') {
            //when {
                //expression { return params.current_status == "closed" && params.merged == true }
            //}
            steps {
                
                  sh '''
                
              #!/bin/bash
              //flutter build apk --no-sound-null-safety
              flutter build apk --debug --ignore-deprecation
              //flutter build apk --no-sound-null-safety
              '''
            
            }
        }
        //stage('Test') {
            //when {
                //expression { return params.current_status == "closed" && params.merged == true }
           // }
          //  steps {
            //   sh 'flutter test'
            //}
        //}
        //stage('Publish') {
            //when {
                //expression { return params.current_status == "closed" && params.merged == true }
            //}
            //steps {
              //  appCenter apiToken: 'f51cf29ba6b2234a84c999bc37348db84624c615',
                //        ownerName: 'ranaranvijaysingh9-gmail.com',
                  //      appName: 'Flutter-Crystal-Cruise',
                    //    pathToApp: 'build/app/outputs/apk/debug/app-debug.apk',
                      //  distributionGroups: 'flutter-crystal-cruise'
       //     }
      //  }
    }
}
