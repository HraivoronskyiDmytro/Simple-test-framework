# Simple-test-framework-solution


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

---

Default TestNG report  - /build/reports/tests/test/index.html

Jacoco report  - /build/reports/jacoco/test/html/index.html

---
To generate Allure report please run:

./gradlew allureReport

---
To see Allure report: 

./gradlew allureServe

---

Additional: 

- Screenshots on testFail

- Video record is available for each execution (at the root of the project)

- Test data for dataprovider are located in CSV file next to the test class (java/tests/data.csv). Easy to add more test data to increase coverage.

---

**CI INTEGRATION**

added .travis.yml to have possibility to run on TRAVIS-CI
added  github actions .github/workflows/gradle.yml to run the project on github actions

---

**Possible to run test in**

Firefox browser  -  ./gradlew firefox

Chrome   -  ./gradlew chrome

Edge  -  ./gradlew edge

---

Framework-solution structure :

/src/main/java/framework - basic components basic page\test\listener\utils for framework solution.

/src/main/java/pages - useractions grouped by pages. for each page there is appropriate CSV file with locatiors.

/src/test/java/tests - tests directory. here also CSV file for data parameters for test.


---
**Possible code improvements**
- store URLs in CSV

- rework video and integrate it to the report

- detailed configuration of the Jacoco report 

- implement waitUntilPageLoads() for each page.

- publish test results 


