FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=./target/*.jar
RUN apk update && apk add git && apk add net-tools procps openssh-client openssh-server
RUN mkdir -p $HOME/weatherapp/ && cd $HOME/weatherapp/
RUN git clone https://ylakshmi5382:5382Yours@github.com/Distansakademin/spring-weather-api-ylakshmi5382.git
RUN mvn --version
RUN mvn clean install -e
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]

