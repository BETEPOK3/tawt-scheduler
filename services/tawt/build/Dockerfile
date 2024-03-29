FROM maven:3.5.0-jdk-8-alpine as builder

WORKDIR /build
ADD tawt-scheduler/. .
RUN mvn clean install

FROM openjdk:8-jre-alpine

COPY --from=builder ["/build/target/tawt-scheduler-0.1.jar", "/"]
CMD ["java", "-jar", "tawt-scheduler-0.1.jar"]