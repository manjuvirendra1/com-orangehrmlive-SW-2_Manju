package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    //Inheriting the BaseTest class
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
        public void userShouldNavigateToForgotPasswordPageSuccessfully() {
            // click on the Forgot your password link
            driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
            // verify the text 'Forgot Your Password?' is displayed
            String expectedMessage = "Reset Password";
            WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals(expectedMessage, actualMessage);
    }


      @After
    public void tearDown() {
        driver.close();
      }
    }

