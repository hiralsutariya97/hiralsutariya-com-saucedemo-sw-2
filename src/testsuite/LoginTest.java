package testsuite;
/**
 * 2. Create the package ‘testsuite’ and create the following class inside the ‘testsuite’ package.
 * 1. LoginTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValid Credentials
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify the text “PRODUCTS”
 * 2. verifyThatSixProductsAreDisplayedOnPage
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify that six products are displayed on page
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find the username field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        //Find the password field and type the password to password field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Find the login btn element and click
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();

        String expectedText = "Products";
        //Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//span"));
        String actualText = actualTextElement.getText();

        //Verify expected and actual text
        Assert.assertEquals("Products", expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Find the username field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        //Find the password field and type the password to password field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Find the login btn element and click
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();

        String expectedText = "Products";
        //Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//span"));
        String actualText = actualTextElement.getText();

        //Verify expected and actual text
        Assert.assertEquals("Products", expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
