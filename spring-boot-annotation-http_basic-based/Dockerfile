FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/kontu*.war /app.war
CMD["java","-jar", "/app.war", "--spring.profiles.active=prod"]
EXPOSE 8080
