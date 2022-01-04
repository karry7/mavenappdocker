FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD ./target/my-app-1.0-SNAPSHOT.jar my-app-1.0-SNAPSHOT.jar
ENTRYPOINT ["java',"-jar","/my-app-1.0-SNAPSHOT.jar"]


