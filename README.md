# Microservices Online Webshop

This is an example microservices application in Java that is used for demo purposes.

## Customer Service

Spring Boot Application

- Java 11

## User Service

Spring Application

- Java 8
- Spring 4.16 (XML Configuration)
- H2 Embedded Database
- Spring JDBC's `JdbcTemplate`
- Custom DAOs


## Registration Service

Spring Boot Application

- Java 11

Sends tomcat access logs as JSON to stdout. Also ships app logs to stdout as JSON.

## Spring Boot Admin

Login UI

Since it uses the spring security module the default username & password is the spring security default username & password which is:

username: user
password: <printed on console during application startup>

The username & password can be configured via the `spring.security.user.name` and the `spring.security.user.password` properties respectively.

![spring-boot-admin](etc/spring-boot-admin-server.png)

![spring-boot-admin-dashboard](etc/spring-boot-admin-server-dashboard.png)

Can inspect the details:

![spring-boot-admin-details](etc/spring-boot-admin-server-details.png)

## Author

Colin But.
