FROM maven:3.5.0-jdk-8-alpine as builder

WORKDIR /build
ADD tawt-rest-api/. .
RUN mvn clean package

FROM openjdk:8-jre-alpine
# Надо как-то автоматически находить .jar файл.
COPY --from=builder ["/build/tawt-rest-server/target/tawt-rest-server-ab0e5398db.jar", "/"]
CMD ["java", "-jar", "tawt-rest-server-ab0e5398db.jar"]