# spring-frontend
A spring boot frontend with Java 8 and thymeleaf templating.

## Packaging application with Maven
``` mvn clean package```

## Start local host server
Note: Execute packaged snapshot from applications target dir.

### Dev
``` java -Dspring.profiles.active=dev -jar spring-frontend-0.0.1-SNAPSHOT.jar ```

### QA
``` java -Dspring.profiles.active=qa -jar spring-frontend-0.0.1-SNAPSHOT.jar ```

### Staging
``` java -Dspring.profiles.active=staging -jar spring-frontend-0.0.1-SNAPSHOT.jar ```

### Prod
``` java -Dspring.profiles.active=prod -jar spring-frontend-0.0.1-SNAPSHOT.jar ```

## Authenticate user
Access login end-point in browser ```http://localhost:8080/login``` to see demonstration of
form validation with error handling.