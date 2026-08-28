FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar kafkaproducerconsumer.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "kafkaproducerconsumer.jar"]