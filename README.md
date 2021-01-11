# docker-demo
springboot微服务打包Docker镜像

## docker安装与测试
1. 卸载旧版本<br>
sudo yum remove docker                   docker-client                   docker-client-latest                   docker-common                   docker-latest                   docker-latest-logrotate                   docker-logrotate                   docker-engine
2. 设置存储库<br>
sudo yum install -y yum-utils<br>
sudo yum-config-manager     --add-repo     https://download.docker.com/linux/centos/docker-ce.repo
4. 安装引擎<br>
sudo yum install docker-ce docker-ce-cli containerd.io
5. 启动docker<br>
sudo systemctl start docker
6. 测试 查看版本<br>
docker version
7. 获取并运行镜像<br>
sudo docker run hello-world

## 微服务项目构建镜像
    [root@localhost docker]# ll
    总用量 16608
    -rw-r--r--. 1 root root 16999280 1月  11 15:23 docker-0.0.1-SNAPSHOT.jar
    -rw-r--r--. 1 root root      120 1月  11 15:23 Dockerfile
上传这两个文件<br>
1. 构建镜像<br>
docker build -t hong-2000 .
2. 查看镜像<br>
docker images
3. 运行镜像<br>
docker run -d -P --name docker-springboot-test hong-2000
4. 查看地址<br>
docker ps
5. 访问端口<br>
curl localhost:49153/hello

## 设置阿里云镜像地址
1. 新建或修改文件<br>
sudo vim /etc/docker/daemon.json
2. 编辑内容<br>
        {
         "registry-mirrors":["https://6kx4zyno.mirror.aliyuncs.com"]
        }
3. 重启服务<br>
systemctl daemon-reload <br>
systemctl restart docker