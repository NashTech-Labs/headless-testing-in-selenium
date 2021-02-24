# Headless-testing-in-selenium

Introduction:-
This repository contains a plug and play template for using HtmlUnitDriver for headless execution of the
tests without actually launching the browser.

Why do we need Headless testing?
We can execute our tests in Headless mode to save time and have faster execution. 
It is similar to the normal execution but in this we don't actually launch our web browser, but still 
execute all the steps in the test script.

Technologies used:-
Programming language - Java
Assertion framework - TestNG
Build tool - Maven
Automation tool - Selenium
For Headless execution - htmlunit-driver
Logging - Log4j2
IDE - Intellij

Steps for execution:- 
Clone the repository on your local system.

Let intellij resolve all the required dependencies.

Go to src-->test-->java-->SeleniumHeadlessTest.class

Inside the file right click and go to Run HeadlessTest() to execute the test.

