FROM openjdk:11.0.13-jdk-oraclelinux8
VOLUME /tmp
ADD target/registration-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
