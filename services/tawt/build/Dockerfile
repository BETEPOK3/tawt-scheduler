FROM maven:3.8.3-openjdk-17 as builder
ARG path=services/tawt

WORKDIR /build
ADD $path/tawt-scheduler/. .
ADD schema/gen/java/. src/main/java/.
RUN mvn clean dependency:copy-dependencies compile jar:jar

FROM openjdk:23-slim-bullseye

COPY --from=builder ["/build/target", "/target/."]
CMD ["java", "-jar", "target/tawt-scheduler-0.1.jar"]