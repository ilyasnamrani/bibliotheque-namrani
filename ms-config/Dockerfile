FROM eclipse-temurin:17
LABEL mentainer = "namraniilyas@gmail.com"
WORKDIR /app
COPY target/ms-config-0.0.1-SNAPSHOT.jar /app/ms-config.jar
ENTRYPOINT ["java" , "-jar" , "ms-config.jar"]