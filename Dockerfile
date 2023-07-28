FROM adoptopenjdk/openjdk8
ARG JAR_FILE_PATH=build/libs/spring-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE_PATH} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]