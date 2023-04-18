package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {
    //Inheriting the BaseTest class
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Navigate to the OrangeHRM Live login page
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        // click on the Login button
        WebElement loginBtn = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
        loginBtn.click();

        // verify the Dashboard text is displayed using xpath
        Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
    }

    @After
    public void tearDown() {
        driver.close();//close the browser
    }
}
