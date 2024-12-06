package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class LoginPage {
    WebDriver driver;
    Yaml yaml = new Yaml();
    InputStream inputStream = new FileInputStream("./src/main/java/data/data.yml");
    Map<String, Object> data = yaml.load(inputStream);
    HashMap admin = (HashMap) data.get("admin");

    public LoginPage(WebDriver driver) throws Exception {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    PAGE FACTORY
    @FindBy(xpath = "//label[text()='Password']/ancestor::div/preceding-sibling::div//input[@name='username']")
    WebElement username_;
    @FindBy(xpath = "//label[text()='Password']/parent::div//following-sibling::div/input[@name='password']")
    WebElement password_;
    @FindBy(xpath = "//form[@class='oxd-form']/child::div//following-sibling::button[text()=' Login ']")
    WebElement loginButton;


    public String getUsernameCredentials() {
        String username = (String) admin.get("username");
        System.out.println(username);
        return username;
    }
    public String getPasswordCredentials() {
        String password = (String) admin.get("password");
        System.out.println(password);
        return password;
    }
    public void fillUsername(String username) {
        username_.sendKeys(username);
    }
    public void fillPassword(String password) {
        password_.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
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

//    USING HOW
//    @FindBy(how = How.XPATH, using = "//label[text()='Password']/ancestor::div/preceding-sibling::div//input[@name='username']")
//    WebElement username_;
//    @FindBy(how = How.XPATH, using = "//label[text()='Password']/parent::div//following-sibling::div/input[@name='password']")
//    WebElement password_;
//    @FindBy(how = How.XPATH, using = "//form[@class='oxd-form']/child::div//following-sibling::button[text()=' Login ']")
//    WebElement loginButton;


}