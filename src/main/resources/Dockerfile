FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY /home/alexander/Documents/spring_test/balancerTest/balancertest/target/balancertest-0.0.1-SNAPSHOT.jar /app


WORKDIR /app
ENTRYPOINT java -jar balancertest-0.0.1-SNAPSHOT.jar
