package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends LoginTest {
    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        driver.findElement(By.linkText("Computers")).click();
        String expectedText = "Computers";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Computers']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Computers Text is not shown on page ",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        driver.findElement(By.linkText("Electronics")).click();
        String expectedText = "Electronics";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Electronics']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Electronics Text is not shown on page ",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        driver.findElement(By.linkText("Apparel")).click();
        String expectedText = "Apparel";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Apparel']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Apparel Text is not shown on page ",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadPageSuccessfully()
    {
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedText = "Digital downloads";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Digital downloads Text is not shown on page ",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        driver.findElement(By.linkText("Books")).click();
        String expectedText = "Books";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Books']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Books downloads Text is not shown on page ",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedText = "Jewelry";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Jewelry']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Jewelry downloads Text is not shown on page ",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedText = "Gift Cards";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text() = 'Gift Cards']"));
        String actualText = actualMessage.getText();
        Assert.assertEquals("Gift Cards downloads Text is not shown on page ",expectedText,actualText);
    }
    @After
    public void tearDown()
    {
        driver.close();
    }


}
