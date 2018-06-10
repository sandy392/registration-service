FROM openjdk:8
ADD target/registration-service.jar registration-service.jar
EXPOSE 9092
ENTRYPOINT ["java", "-jar", "registration-service.jar"]
