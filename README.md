# Headless-testing-in-selenium

### Introduction:-
This repository contains a plug and play template for using HtmlUnitDriver for headless execution of the
tests without actually launching the browser.

### Why do we need Headless testing?

We can execute our tests in Headless mode to save time and have faster execution. 
It is similar to the normal execution but in this we don't actually launch our web browser, but still 
execute all the steps in the test script.

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


