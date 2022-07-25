# Simple-test-framework


used:

- Java 11 

- Selenium

- Webdrivermanager (https://bonigarcia.dev/webdrivermanager/)

- Jacoco

- TestNG

- Gradle

- Allure for reporting

- CSV files as a storage for locators 

- Docker Engine to run the tests out of the box 

To run test pleaase run: ./gradlew chrome  ( will be used Chrome browser)

Default TestNG report  - /build/reports/tests/test/index.html

Jacoco report  - /build/reports/jacoco/test/html/index.html

To generate Allure report please run:

./gradlew allureReport


To see Allure report: 

./gradlew allureServe

**CI INTEGRATION**

added .travis.yml to have possibility to run on TRAVIS-CI

**Possible to run test in**

Firefox browser  -  ./gradlew firefox

Chrome   -  ./gradlew chrome

Edge  -  ./gradlew edge


**Possible code improvements**
- store URLs in CSV

