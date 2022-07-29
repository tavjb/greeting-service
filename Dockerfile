FROM openjdk:17-alpine

COPY /target/dockerized-spring-example-0.0.1-SNAPSHOT.jar /
WORKDIR /app
ENTRYPOINT  java -jar /dockerized-spring-example-0.0.1-SNAPSHOT.jar