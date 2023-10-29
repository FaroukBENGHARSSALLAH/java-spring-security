FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/*.jar /jar.jar
RUN java -jar ./app.jar
EXPOSE 8080
