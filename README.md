# Headless-testing-in-selenium

### Introduction:-
This repository contains a plug and play template for using HtmlUnitDriver for headless execution of the
tests without actually launching the browser.

### Why do we need Headless testing?

Using the headless testing we can execute our tests without actually opening the web browser.
This is useful when we integrate our tests with the CI/CD pipelines where the test scripts run automatically without any human intervention.
In this scenario, it is not necessary that the web browser is launched because the CI/CD pipelines are run automatically at the night or in early
the morning when no one is there to see the execution.

In the headless mode less resources are required to execute the tests. The tests are run normally as they would run on actual browser.

### Technologies used:-
**Programming language** - Java

**Assertion framework** - TestNG

**Build tool** - Maven

**Automation tool** - Selenium

**For Headless execution** - htmlunit-driver

**Logging** - Log4j2

**IDE** - Intellij

###Dependencies used : 
**TestNG**

`<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>RELEASE</version>
<scope>test</scope>
</dependency>`

**HTML unit driver**

`<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>htmlunit-driver</artifactId>
<version>2.47.1</version>
<scope>test</scope>
</dependency>`

**Selenium chrome driver**

`<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-chrome-driver</artifactId>
<version>4.0.0-alpha-4</version>
<scope>test</scope>
</dependency>`

**Log4j**

`<dependency>
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-core</artifactId>
<version>2.14.0</version>
</dependency>`

### Steps for execution:- 
Clone the repository on your local system.

Let intellij resolve all the required dependencies.

Go to the terminal the and execute the command **mvn test** to execute all the tests.

In case of any issue you can also try **mvn clean test**.


