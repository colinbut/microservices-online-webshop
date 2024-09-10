#FROM openjdk:11.0.13-jdk-oraclelinux8
FROM gcr.io/distroless/java11-debian11:debug
VOLUME /tmp
ADD target/registration-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
