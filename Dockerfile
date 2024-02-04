FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=./target/*.jar
CMD mvn clean install
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]

