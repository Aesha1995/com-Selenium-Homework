package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends TopMenuTest
{
    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully()
    {
        // verifing user is navigated to register page or not
        String expectedMessage = "Register";
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to registration page",expectedMessage,actualMessageText);
    }

    @Test

    public void userShouldRegisterAccountSuccessfully()
    {
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click(); // finding the register link and click on it

        driver.findElement(By.xpath("//input[@id='gender-female']")).click(); // finding the female radio button element and clicking
        driver.findElement(By.id("FirstName")).sendKeys("Aesha"); // finding and entering the first name
        driver.findElement(By.id("LastName")).sendKeys("Panchal"); // finding  and entering the last name

        Select day = new Select(driver.findElement(By.name("DateOfBirthDay"))); // finding DoBday dropdown and selecting the day
        day.selectByVisibleText("5");
        //day.selectByIndex(1);
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth"))); // finding Dobmonth dropdown and selecting the month
        month.selectByVisibleText("December");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear"))); // finding Dobyear dropdown and selecting the year
        year.selectByValue("1995");
        driver.findElement(By.id("Email")).sendKeys("aesha123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("aesha123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("aesha123");
        driver.findElement(By.id("register-button")).click();
        // verifing user is logged in successfully or not by verifying the text displayed on the page
        String expectedMessge = "Your registration completed";
        WebElement actualMessage = driver.findElement(By.xpath("//div[text() = 'Your registration completed']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not registered successfully",expectedMessge,actualMessageText);
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }

}
