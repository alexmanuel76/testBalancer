FROM openjdk:17-slim-buster
#working dir
WORKDIR /app

#Copy data
COPY balancer.jar app.jar

#used port
EXPOSE 8080

#Run APP
ENTRYPOINT ["java","-jar","app.jar"]