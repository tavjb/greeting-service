FROM openjdk:17-alpine

COPY /target/greeting-service-0.0.1.jar /
ENTRYPOINT  java -jar /greeting-service-0.0.1.jar