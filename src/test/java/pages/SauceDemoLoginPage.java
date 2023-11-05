package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPage {

    WebDriver driver = null;
    By username_field = By.id("user-name");
    By password_field = By.name("password");
    By login_button = By.id("login-button");

    public SauceDemoLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(username_field).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(password_field).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(login_button).click();
    }
}

