FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/java-pipeline-demo-1.0.0.jar app.jar

USER 8080:8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
