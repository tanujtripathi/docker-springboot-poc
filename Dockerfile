FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/*.jar dockerapps.jar
ENTRYPOINT ["sh","-c","java -jar /dockerapps.jar"]