FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/*.jar appserver.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/appserver.jar"]
EXPOSE 10001