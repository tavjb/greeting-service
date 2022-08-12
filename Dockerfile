FROM openjdk:17-alpine

COPY /target/greeting-service-0.0.1-SNAPSHOT.jar /
ENTRYPOINT  java -jar /greeting-service-0.0.1-SNAPSHOT.jar