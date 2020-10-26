#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ADD ./target/*.jar app.jar
##RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#EXPOSE 10002

FROM java:8
FROM openjdk:8-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} appclient.jar
ENTRYPOINT ["java","-jar","/appclient.jar"]
EXPOSE 10002