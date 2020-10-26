//gitlab的凭证
def git_auth = "c696df5c-fbe7-4ec4-9274-80dfb58a3de3"

def git_url = "https://github.com/nh666666/SpringCloudDemo.git"
//构建版本的名称
def tag = "latest"

pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: "${git_auth}", url: "${git_url}"]]])
            }
        }
        stage('生成镜像') {
            steps {
                def imageName = "${project_name}:${tag}"
                bat "mvn -f ${project_name} clean package docker:build"
                bat "docker tag ${imageName} ${imageName}:cv1"
            }
        }
    }
}
