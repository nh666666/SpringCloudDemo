//gitlab的凭证
def git_auth = "c696df5c-fbe7-4ec4-9274-80dfb58a3de3"

def git_url = "https://github.com/nh666666/SpringCloudDemo.git"
//构建版本的名称
def tag = "latest"
def imageName = "${project_name}:cv1"

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
                bat "mvn -f ${project_name} clean package docker:build"
            }
        }
        stage('启动镜像') {
            steps {
                bat "docker run -di -p ${port}:${port} ${project_name}"
            }
        }
    }
}
