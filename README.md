# Refactoring me Project

Project to have some fun and to help some DevDojo Padawans ;)

### Technology

[quarkus.io](https://quarkus.io)

### Prerequisite

1. JDK 11
1. Docker

### Running

1. Clone the project
1. Run `docker-compose up` to have an instance of MariaDB
1. Connect to MariaDB server and create a schema called `refactoringme` (check datasource inside application.properties for credentials)
2. Execute `./mvnw compile quarkus:dev` to run the project
1. Open Swagger documentation: [localhost:8080/swagger-ui/](localhost:8080/swagger-ui/) to see available endpoints


