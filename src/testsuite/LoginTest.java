package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before

    public void setUp()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        driver.findElement(By.linkText("Log in")).click();
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String actualMessageText = actualMessage.getText();

        Assert.assertEquals("User is not redirected to login page",expectedMessage,actualMessageText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("aesha123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Aesha123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        String expectedMessage = "Log out";
        WebElement actualMessage=driver.findElement(By.linkText("Log out"));
        String actualMessageText= actualMessage.getText();

        Assert.assertEquals("User is not logged in successfully",expectedMessage,actualMessageText);

    }
    @Test
    public void verifyTheErrorMessage()
    {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("aesha123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Aesha12345");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        WebElement actualMessage = driver.findElement(By.xpath("//div[contains(@class,'message-error ')]"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("Login is not successful Please enter valid credentials ",expectedMessage,actualMessageText);

    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }

}
