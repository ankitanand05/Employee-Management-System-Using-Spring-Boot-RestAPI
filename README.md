# Spring Boot CRUD

## About

Spring Boot is a popular framework for building Java applications, and it provides many convenient features for creating CRUD (Create, Read, Update, Delete) operations.
When you want to implement CRUD functionality with Spring Boot, you can use the JpaRepository interface, which is part of the Spring Data JPA module. JpaRepository simplifies database operations by providing predefined methods for common database operations without requiring you to write the SQL queries manually.

## How It Works
First, you need to create a `Spring Boot` project.
1. Configure it to use `Spring Data JPA` and the `database` of your choice (e.g., `MySQL`, `PostgreSQL`, `H2`, etc.).
2. You'll need to add the necessary dependencies in your `pom.xml` file.
3. Configure `Database Connection`:
   Open `application.properties` or `application.yml` file in the `src/main/resources` directory of your Spring Boot project and configure the database connection properties. `Here we are using MySQL`:
   ```spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   ```

## Prerequisites

Before you begin, ensure you have the following:
- Your preferred Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code).
- You can also run this project using terminal.


## Usage
To use the project, follow these steps:

1. Ensure you have `Java JDK 8` installed.
2. Maven3
3. Set up a `Spring Boot 2.6.4 version`.

## How To Run the Project

Follow these steps to run the Online-Executor project:

1. Open a `terminal` or `command prompt`.
2. Navigate to the `root` directory of the project.
3.  Run the following `Maven command` to compile the project and package it as a JAR file in the `target` directory:
     ```
    mvn package
    ```
4. Run the application using the following command:
    ```
   java -jar target/crudDEMO-0.0.1-SNAPSHOT.jar
   ```
5. The server will start on port 8080, and the application will be accessible locally.

6. If `Port=8080` is busy:

    - Step 1: Open `application.properties`
      Navigate to the `src/main/resources` directory of your Spring Boot project, and locate the `application.properties` file. If it doesn't exist, you can create it.

    - Step 2: Configure the Custom Port
      In the `application.properties` file, add the following line to configure a custom port. Replace `8081` with the port number you want to use:

       ```
       server.port=8081
        ```

## How To Use `endPoints`
# Making GET Requests To Find All the Employee
```
    http://localhost:8081/api/employees
```
# Making GET Requests To Find Employee By ID
```
    http://localhost:8081/api/employees/{ID}
```
# Making POST Requests To Save The New Employee
```
  curl --location 'http://localhost:8081/api/employees' \
--header 'Content-Type: application/json' \
--data-raw '{
        "id": 7,
        "firstName": "Ankit",
        "lastName": "Kumar",
        "email": "ankitkumar@gmail.com"
    }'
```
# Making PUT Requests To Edit the Employee
```
  curl --location --request PUT 'http://localhost:8081/api/employees' \
--header 'Content-Type: application/json' \
--data-raw '{
        "id": 7,
        "firstName": "Ankit",
        "lastName": "Anand",
        "email": "ankitanand@gmail.com"
}
```

# Making DELETE Requests To Delete the Employee By ID
```
http://localhost:8081/api/employees/10
```



   
    
  
    

  

    
