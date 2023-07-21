FROM openjdk:11-jdk

WORKDIR usr/src/app

ARG JAR_FILE=build/libs/docker-actions-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

#COPY src/main/resources/application.yml application.yml

ENTRYPOINT ["java", "-jar", "app.jar"]