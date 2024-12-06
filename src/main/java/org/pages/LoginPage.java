package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    PAGE OBJECT
//   WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
// //label[text()='Username']/parent::div//following-sibling::div/input[@name='username']
//    private By usernameLocator = By.xpath("//label[text()='Password']/ancestor::div/preceding-sibling::div//input[@name='username']");
//    private By passwordLocator = By.xpath("//label[text()='Password']/parent::div//following-sibling::div/input[@name='password']");
//    private By loginButton = By.xpath("//form[@class='oxd-form']/child::div//following-sibling::button[text()=' Login ']");


//   public void fillUsername(String username) {
//        driver.findElement(usernameLocator).sendKeys(username);
//    }
//    public void fillPassword(String password) {
//        driver.findElement(passwordLocator).sendKeys(password);
//    }
//    public void clickLoginButton() {
//        driver.findElement(loginButton).click();
//    }

//    PAGE FACTORY
//    @FindBy(xpath = "//label[text()='Password']/ancestor::div/preceding-sibling::div//input[@name='username']")
//    WebElement username_;
//    @FindBy(xpath = "//label[text()='Password']/parent::div//following-sibling::div/input[@name='password']")
//    WebElement password_;
//    @FindBy(xpath = "//form[@class='oxd-form']/child::div//following-sibling::button[text()=' Login ']")
//    WebElement loginButton;

//    USING HOW
    @FindBy(how = How.XPATH, using = "//label[text()='Password']/ancestor::div/preceding-sibling::div//input[@name='username']")
    WebElement username_;
    @FindBy(how = How.XPATH, using = "//label[text()='Password']/parent::div//following-sibling::div/input[@name='password']")
    WebElement password_;
    @FindBy(how = How.XPATH, using = "//form[@class='oxd-form']/child::div//following-sibling::button[text()=' Login ']")
    WebElement loginButton;

    public void fillUsername(String username) {
        username_.sendKeys(username);
    }
    public void fillPassword(String password) { password_.sendKeys(password); }
    public void clickLoginButton() { loginButton.click(); }



}