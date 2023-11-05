package utils;

import config.ConfigProperties;
import general.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GenericFunctions {
    public static WebDriver driver = null;
    By username_field = By.id("user-name");
    By password_field = By.name("password");
    By login_button = By.id("login-button");

    public By inventory_item = By.cssSelector(".inventory_item");

    public By button_text = By.xpath("//button[text()='Add to cart']");

    public By burger_menu = By.xpath("//button[@id='react-burger-menu-btn']");

    public By logout = By.xpath("//a[@id='logout_sidebar_link']");
    public By filter = By.xpath("//*[@id='header_container']/div[2]/div/span/select");
    public By select_filter_option = By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[2]");

    public By add_to_cart = By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
    public By cart_icon = By.xpath("//*[@id='shopping_cart_container']/a");

    public By checkout = By.id("checkout");

    public By continue_btn = By.id("continue");



    ////////////////////////// Automation Test Store ////////////////////////////////////

    By login_or_register = By.xpath("//a[normalize-space()='Login or register']");
    By login_name_field = By.xpath("//input[@id='loginFrm_loginname']");
    By passwordField = By.xpath("//input[@id='loginFrm_password']");
    By loginButton = By.xpath("//button[@title='Login']");
    By home = By.xpath("//a[@class='active menu_home']");
    By apparels_accessories = By.cssSelector("a[href='https://automationteststore.com/index.php?rt=product/category&path=68']");
    By skin_care = By.cssSelector("a[href='https://automationteststore.com/index.php?rt=product/category&path=43']");
    By dove_link = By.xpath("//img[@alt='Dove']");
    By tshirts_link = By.cssSelector("li:nth-child(2) a:nth-child(1) img:nth-child(1)");
    By shoes_link = By.cssSelector(".col-md-2.col-sm-2.col-xs-6.align_center");
    By brands_scrolling_list = By.xpath("//span[normalize-space()='Brands Scrolling List']");
    By dropdown_dove = By.xpath("//select[@id='sort']");
    By dropdown_tshirt_shoes = By.cssSelector("#sort");
    By dropdown_size = By.cssSelector("#option351");
    By add_to_cart_dove = By.xpath("//div[@class='contentpanel']//div[1]//div[2]//div[3]//a[1]//i[1]");
    By add_to_cart_tshirt_shoes = By.cssSelector(".fa.fa-cart-plus.fa-fw");
    By add_quantity = By.cssSelector("#product_quantity");
    By sale = By.xpath("//div[@class='thumbnails grid row list-inline']//div[@class='thumbnail']//span[@class='sale']");
    By outOfStockItem = By.xpath("//div[@class='pricetag jumbotron']//span[@class='nostock'][normalize-space()='Out of Stock']");
    public By cart_items = By.xpath("//a[@class='dropdown-toggle']//i[@class='fa fa-shopping-cart fa-fw']");
    By product = By.cssSelector(".prdocutname");
    By men = By.cssSelector("a[href='https://automationteststore.com/index.php?rt=product/category&path=58']");



    public void getDriver(String browser){

        if (browser.equalsIgnoreCase("edge")){
            this.driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            this.driver = new ChromeDriver();
        } else {
            this.driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void waitDriver(Integer duration){
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
    }

    public void getUrl(String url){
        this.driver.get(url);
    }

    public void setUsername(String username){
        this.driver.findElement(username_field).sendKeys(username);
    }

    public void setPassword(String password){
        this.driver.findElement(password_field).sendKeys(password);
    }

    public void clickLoginButton(){
        this.driver.findElement(login_button).click();
    }

    public void checkInventoryItem() { this.driver.findElements(inventory_item).size(); }

    public void checkAddToCartButton() { this.driver.findElements(button_text).size(); }


    public void doLogin() {
        waitDriver(300);
        getUrl(ConfigProperties.BaseUrl);
        setUsername("standard_user");
        setPassword("secret_sauce");
        clickLoginButton();
    }

    public void clickBurgerMenu() { this.driver.findElement(burger_menu).click(); }
    public void clickFilterButton() {
        this.driver.findElement(filter).click();
        this.driver.findElement(select_filter_option).click();
    }
    public void add_item_to_cart() {
        this.driver.findElement(add_to_cart).click();
        this.driver.findElement(cart_icon).click();
    }


    public void checkout_cart() {
        this.driver.findElement(checkout).click();
    }

    public void clickLogout() { this.driver.findElement(logout).click(); }

    //////////////////////////// Automation Test Store ////////////////////////////////

    public void clickLogin(){
        this.driver.findElement(login_or_register).click();
    }

    public void setLoginName(String username){
        this.driver.findElement(login_name_field).sendKeys(username);
    }

    public void setPasswordField(String password){
        this.driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLoginButton(){
        this.driver.findElement(loginButton).click();
    }

    public void clickOnHome(){this.driver.findElement(home).click();}

    public void clickOnApparelsAccessories(){this.driver.findElement(apparels_accessories).click();}

    public void clickOnSkinCare(){this.driver.findElement(skin_care).click();}
    public void clickOnMen(){this.driver.findElement(men).click();}
    public void clickOnDove(){this.driver.findElement(dove_link).click();}
    public void clickOnTShirts(){this.driver.findElement(tshirts_link).click();}
    public void clickOnShoes(){this.driver.findElement(shoes_link).click();}

    public void addToCartDoveItem(){this.driver.findElement(add_to_cart_dove).click();}
    ///// For Tshirt & Shoes (CSS-Selector) /////////
    public void addToCart(){this.driver.findElement(add_to_cart_tshirt_shoes).click();}

    public void scrollDownToBrandsScrollingList() {
        Actions actions = new Actions(driver);
        actions.moveToElement(this.driver.findElement(brands_scrolling_list)).perform();

    }
    public void selectNewestItem(){
        Select dropdown = new Select(this.driver.findElement(dropdown_dove));
        dropdown.selectByVisibleText("Date New > Old");
    }
    public void sortLowToHighRate(){
        Select dropdown = new Select(this.driver.findElement(dropdown_tshirt_shoes));
        dropdown.selectByVisibleText("Rating Lowest");
    }
    public void sortHighToLow(){
        Select dropdown = new Select(this.driver.findElement(dropdown_tshirt_shoes));
        dropdown.selectByVisibleText("Price High > Low");
    }
    public void selectSizeFromDropdown(){
        Select dropdown = new Select(this.driver.findElement(dropdown_size));
        dropdown.selectByVisibleText("Medium");
    }

    public void setQuantity(String quantity){
        this.driver.findElement(add_quantity).clear();
        this.driver.findElement(add_quantity).sendKeys(quantity);
    }
    public void goToCart(){this.driver.findElement(cart_items).click();}
    public String getCartItemTitle(String locator){return this.driver.findElement(By.xpath(locator)).getText();}
    public String getCartItemPrice(String locator){return this.driver.findElement(By.xpath(locator)).getText();}
    public String getCartItemQuantity(String locator){return this.driver.findElement(By.xpath(locator)).getAttribute("value");}
    public int onSale(){return this.driver.findElements(sale).size();}
    public int outOfStock(){return this.driver.findElements(outOfStockItem).size();}

    public String productName(){return this.driver.findElement(product).getText();}

    public WebElement checkOnSale(){return this.driver.findElement(product).findElement(sale);}

    public WebElement checkOutOfStock(){return (this.driver.findElement(By.xpath("//a[@title='Absolue Eye Precious Cells']"))).findElement(outOfStockItem);}

    public void productElements(){
        List<WebElement> productElements = driver.findElements(By.cssSelector(".col-md-3.col-sm-6.col-xs-12"));

        // Iterate through the product elements and check if they are on sale
        productElements.forEach((mainElem) -> {
            WebElement outOfStockTag = null;
            WebElement productCart = null;
            WebElement saleTag = null;
            try {

                productCart = mainElem.findElement(By.cssSelector(".productcart"));
                saleTag = mainElem.findElement(By.cssSelector(".sale"));

            } catch (Exception e){

                System.out.println("Below Product either not in sale or out of stock");
            }
            try {

                outOfStockTag = mainElem.findElement(By.cssSelector(".nostock"));

            } catch (Exception e){

                System.out.println("Below product Not out of stock");

            }
            System.out.println(mainElem.findElement(By.cssSelector(".prdocutname")).getText());

            if ((saleTag != null) && (productCart != null) ) {
                // Product is on sale, add it to the cart
                WebElement addToCartButton = mainElem.findElement(By.cssSelector(".fa.fa-cart-plus.fa-fw"));
                addToCartButton.click();
                System.out.println("Added to Cart!\n");
        }else if ((outOfStockTag != null)){
                System.out.println(mainElem.findElement(By.cssSelector(".prdocutname")).getText() + " is Out of Stock!\n");
            }
            else {
                System.out.println("Not in sale!\n");
            }
        });

    }

    public void doLoginStore() {
        waitDriver(3);
        getUrl(ConfigProperties.BaseUrl);
        clickLogin();
        setLoginName("EshaEmran");
        setPasswordField("AutomationEngr");
        clickOnLoginButton();
    }



}





