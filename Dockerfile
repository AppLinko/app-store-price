# 使用 Dragonwell JDK 8 作为基础镜像
FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:8-centos

# 设置语言包为中文
ENV LANG=C.UTF-8

# 指定容器时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 创建工作目录
RUN mkdir -p /root/apps/work

# 设置工作目录
WORKDIR /root/apps/work

# 暴露端口 8080
EXPOSE 8080

# 复制 jar 文件到容器中
COPY ./*.jar ./app.jar

# 设置容器启动时执行的命令
ENTRYPOINT ["java", "-jar", "app.jar"]