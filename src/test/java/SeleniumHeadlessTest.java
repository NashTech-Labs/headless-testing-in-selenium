import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.*;

public class SeleniumHeadlessTest {
    private static Logger log =  LogManager.getLogger(SeleniumHeadlessTest.class);
    @Test
    public void HeadlessTest() {
        WebDriver driver = new HtmlUnitDriver(true);
        //Initialize webdriver
        driver.get("https://login.salesforce.com/?locale=in");
        //Enter the URL to hit.
        log.debug(driver.getTitle());
        //Print the title of the webpage
        log.debug(driver.getCurrentUrl());
        //Print the URL of the current webpage
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Add wait for uninterrupted test execution in case of long load times
        driver.findElement(By.cssSelector("#username")).sendKeys("sample@gmail.com");
        //Find and enter text in username field
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        //Find and enter text in password field
        driver.findElement(By.cssSelector("#Login")).click();
        //Find and hit login button
        log.debug(driver.findElement(By.id("error")).getText());
        //Print error message after unsuccessful login attempt
        driver.close();
        //Close the web browser
    }
}
