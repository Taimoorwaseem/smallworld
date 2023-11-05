package validations;

import config.ConfigProperties;
import general.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.GenericFunctions;
public class SauceDemoValidations {

    public static GenericFunctions loginPageObj = new GenericFunctions();
    //static WebDriver driver = null;

    public static String actualmessage;
    public static String expectederrormessage="Epic sadface: Username and password do not match any user in this service";

    public static void assertErrorMessage(WebDriver driver) {
        //driver = new ChromeDriver();
        actualmessage = driver.findElement(By.cssSelector("div.error-message-container")).getText();
        Assert.assertEquals(actualmessage, expectederrormessage);
    }

    public static void assertLogin(WebDriver driver) {

        actualmessage = driver.getCurrentUrl();
        Assert.assertEquals(actualmessage, "https://www.saucedemo.com/inventory.html");

    }

    public static void assertCart(WebDriver driver) {
        Assert.assertEquals(driver.findElements(loginPageObj.continue_btn).size(), 1);

    }
    public static void assertInventorySize(WebDriver driver){
        Assert.assertEquals(driver.findElements(loginPageObj.inventory_item).size(), 6);
    }

    public static void assertAddToCartButtonsCount(WebDriver driver){
        Assert.assertEquals(driver.findElements(loginPageObj.button_text).size(), 6);
    }

    public static void assertLogOut(WebDriver driver){
        actualmessage = driver.getCurrentUrl();
        Assert.assertEquals(actualmessage, "https://www.saucedemo.com/");
    }
}
