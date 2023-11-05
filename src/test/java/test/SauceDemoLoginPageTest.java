package test;

import com.aventstack.extentreports.ExtentTest;
import config.ConfigProperties;
import general.BaseTest;
import org.testng.annotations.*;
import utils.GenericFunctions;
import validations.SauceDemoValidations;


public class SauceDemoLoginPageTest extends BaseTest {

    GenericFunctions loginPageObj = new GenericFunctions();


    @Test
    @Parameters("browser")
    public void invalidLogin(String browser){
        ExtentTest test = extent.createTest("Scenario 1", "Logging in with invalid credentials");
        loginPageObj.getDriver(browser);
        loginPageObj.waitDriver(300);
        loginPageObj.getUrl(ConfigProperties.BaseUrl);
        loginPageObj.setUsername("standard_user");
        loginPageObj.setPassword("secret");
        loginPageObj.clickLoginButton();
        SauceDemoValidations.assertErrorMessage(loginPageObj.driver);

    }

    @Test
    @Parameters("browser")
    public void validLogin(String browser){

        ExtentTest test = extent.createTest("Scenario 2", "Logging in with valid credentials");
        loginPageObj.getDriver(browser);
        loginPageObj.waitDriver(300);
        loginPageObj.getUrl(ConfigProperties.BaseUrl);
        loginPageObj.doLogin();
        SauceDemoValidations.assertLogin(loginPageObj.driver);
        loginPageObj.clickFilterButton();
        loginPageObj.add_item_to_cart();
        loginPageObj.checkout_cart();
        SauceDemoValidations.assertCart(loginPageObj.driver);
    }

    @Test
    public void checkInventoryItemTest(){

        ExtentTest test = extent.createTest("Scenario 3", "Checking the count of inventory items");
        SauceDemoValidations.assertInventorySize(loginPageObj.driver);

    }

    @Test
    public void checkAddToCartButtonTest(){

        ExtentTest test = extent.createTest("Scenario 4", "Checking the count of add to cart buttons");
        SauceDemoValidations.assertAddToCartButtonsCount(loginPageObj.driver);

    }

    @Test
    public void logoutTest(){

        ExtentTest test = extent.createTest("Scenario 5", "Logging out");
        loginPageObj.clickBurgerMenu();
        loginPageObj.clickLogout();
        SauceDemoValidations.assertLogOut(loginPageObj.driver);
    }


}
