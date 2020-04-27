FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} spring-billing-liquidation-task-service.jar
ENTRYPOINT ["java","-jar","/spring-billing-liquidation-task-service.jar"]