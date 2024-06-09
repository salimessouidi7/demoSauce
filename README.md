# SauceDemo Automation Project

This project is a basic automation framework for testing the login functionality of the SauceDemo website using Selenium WebDriver and TestNG.

## Files

- **LoginPage.java**: This class contains the methods to interact with the login page of the SauceDemo website.
- **LoginPageTest.java**: This class contains the TestNG test case for the login functionality.
- **BaseTest.java**: This class contains the setup and teardown methods for initializing and quitting the WebDriver.
- **testng.xml**: This is the TestNG configuration file for running the tests.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven

## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/salimessouidi7/demoSauce.git
    ```

2. **Install the necessary dependencies using pom.xml:**

    ```sh
    mvn clean install
    ```

---

## Running the Tests

To run the tests, execute the following command:

```sh
mvn test
```
This will run the test defined in the LoginPageTest class using the configuration specified in the testng.xml file.
