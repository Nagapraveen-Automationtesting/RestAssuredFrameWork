
# REST Assured API Testing Project

This project is a Java-based API testing framework using [REST Assured](https://rest-assured.io/), designed to automate API testing for RESTful services.

## Table of Contents
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Running Tests](#running-tests)
- [Writing Tests](#writing-tests)
- [Reporting](#reporting)
- [Built With](#built-with)

## Getting Started

These instructions will help you set up and run the project on your local machine.

### Prerequisites

- Java JDK 8 or higher
- Maven (or Gradle if preferred)
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate into the project directory:
   ```bash
   cd <project_directory>
   ```
3. Install dependencies:
   ```bash
   mvn clean install
   ```

### Project Structure

```
.
├── src
│   ├── main
│   │   └── java                # Contains main application code (if any)
│   └── test
│       ├── java                # Contains all test cases
│       │   ├── config          # Configuration classes and helpers
│       │   ├── models          # POJOs for request/response payloads
│       │   ├── tests           # Test classes organized by API endpoint
│       │   └── utils           # Utility functions
│       └── resources           # Test resources and configuration files
├── pom.xml                     # Maven configuration file with dependencies
└── README.md
```

### Running Tests

You can run tests with Maven:
```bash
mvn test
```

#### Running Specific Tests
You can also run specific test classes or methods by specifying their names:
```bash
mvn -Dtest=<TestClassName> test
```

#### Running Tests with Allure Reporting (if configured)
If you are using Allure for reporting:
1. Run tests to generate results:
   ```bash
   mvn test
   ```
2. Generate Allure reports:
   ```bash
   allure serve
   ```

### Writing Tests

1. Create a new test class under `src/test/java/tests/`.
2. Use REST Assured to define API requests and assertions. For example:

   ```java
   import static io.restassured.RestAssured.*;
   import static org.hamcrest.Matchers.*;

   import org.junit.jupiter.api.Test;

   public class ExampleTest {

       @Test
       public void testGetEndpoint() {
           given()
               .baseUri("https://jsonplaceholder.typicode.com")
               .when()
               .get("/posts/1")
               .then()
               .statusCode(200)
               .body("userId", equalTo(1));
       }
   }
   ```

### Reporting

This project can integrate with Allure or other reporting frameworks. If configured, Allure reports will be generated after each test run and can be viewed by running:
```bash
allure serve
```

### Built With

- [REST Assured](https://rest-assured.io/) - Java DSL for API testing
- [JUnit](https://junit.org/) - Testing framework
- [Maven](https://maven.apache.org/) - Dependency management
- [Allure](https://docs.qameta.io/allure/) - Reporting framework (optional)

## Contributing

Feel free to submit issues and pull requests if you find bugs or have suggestions for improvements!

---

**Author**: [Your Name]  
**License**: MIT
