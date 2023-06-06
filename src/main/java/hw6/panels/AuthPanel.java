package hw6.panels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPanel {

    private final WebDriver driver;

    @FindBy(xpath = ".//button[@name='action:login'][@tabindex='14']")
    private WebElement loginButtonWindow;
    @FindBy(xpath = ".//input[@id = 'user']")
    private WebElement inputLoginField;
    @FindBy(xpath = ".//input[@id = 'lj_loginwidget_password']")
    private WebElement inputPasswordField;
    @FindBy(xpath = ".//label[@class = 'b-loginform-checkbox__control']")
    private WebElement rememberMeButton;

    public AuthPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonWindow() {
        return loginButtonWindow;
    }

    public WebElement getInputNameField() {
        return inputLoginField;
    }

    public WebElement getInputPasswordField() {
        return inputPasswordField;
    }

    public WebElement getRememberMeButton() {
        return rememberMeButton;
    }


    public AuthPanel clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public AuthPanel moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public AuthPanel inputLogin(String login) {
        inputLoginField.clear();
        inputLoginField.sendKeys(login);
        return this;
    }

    public AuthPanel inputPassword(String password) {
        inputPasswordField.clear();
        inputPasswordField.sendKeys(password);
        return this;
    }
}
