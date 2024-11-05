
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

This highly scalable, reusable API automation framework with Rest Assured and Java.

### Prerequisites

- Java JDK 8 or higher
- Maven 
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:
   ```bash
   git clone <https://github.com/Nagapraveen-Automationtesting/RestAssuredFrameWork.git>
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
Folder PATH listing for volume New Volume
Volume serial number is 14DC-CECB
D:.
|
+---src
|   +---main
|   |   +---java
|   |   |   \---com
|   |   |       \---api
|   |   |           +---base
|   |   |           |       APIConfig.java
|   |   |           |       Config.java
|   |   |           |       
|   |   |           +---reports
|   |   |           +---testdata
|   |   |           |       Constants.java
|   |   |           |       
|   |   |           \---utils
|   |   |                   APIutils.java
|   |   |                   HttpStatus.java
|   |   |                   JSONutils.java
|   |   |                   
|   |   \---resources
|   |       |   config.properties
|   |       |   
|   |       +---payloads
|   |       \---schemas
|   \---test
|       \---java
|           \---com
|               \---api
|                   \---testcases
|                           TestCases.java
|                           
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

### Writing Tests

1. Create a new test class under `src/test/java/tests/`.
2. Use REST Assured to define API requests and assertions. For example:


### Built With

- [REST Assured](https://rest-assured.io/) - Java DSL for API testing
- [JUnit](https://junit.org/) - Testing framework
- [Maven](https://maven.apache.org/) - Dependency management


## Contributing

Feel free to submit issues and pull requests if you find bugs or have suggestions for improvements!

---

**Author**: [Your Name]  
**License**: MIT
