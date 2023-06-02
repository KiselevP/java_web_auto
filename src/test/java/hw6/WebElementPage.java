package hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementPage{

    private final WebDriver driver;

    @FindBy(xpath = ".//a[text()='Войти']")
    private WebElement loginButtonHeader;
    @FindBy(css = ".s-header-sub-list-item__link--logout")
    private WebElement logoutButton;
    @FindBy(css = ".s-header-search__input-wrapper > #SearchText")
    private WebElement searchInput;
    @FindBy(xpath = ".//button[@data-tour-text]")
    private WebElement searchButton;
    @FindBy(xpath = ".//a[text()='Настройки']")
    private WebElement settingButton;
    @FindBy(xpath = ".//button[@name='action:login'][@tabindex='14']")
    private WebElement loginButtonWindow;
    @FindBy(xpath = ".//input[@id = 'user']")
    private WebElement inputLoginField;
    @FindBy(xpath = ".//input[@id = 'lj_loginwidget_password']")
    private WebElement inputPasswordField;
    @FindBy(xpath = ".//label[@class = 'b-loginform-checkbox__control']")
    private WebElement rememberMeButton;
    @FindBy(xpath = ".//span[contains(text(), 'Русский')]")
    private WebElement languageSwitchButton;
    @FindBy(xpath = ".//a[contains(text(), 'Deutsch (de)')]")
    private WebElement languageDeutsch;
    @FindBy(xpath = ".//a[@title='homework1234']")
    private WebElement profileHeader;
    @FindBy(xpath = ".//a[@href='https://www.livejournal.com/category/novye_lica/']")
    private WebElement elementOne;
    @FindBy(xpath = ".//a[@href='https://www.livejournal.com/category/media_v_zhzh/']")
    private WebElement elementTwo;
    @FindBy(xpath = ".//a[@href='https://www.livejournal.com/category/vsem-vesna/']")
    private WebElement elementThree;
    @FindBy(xpath = ".//a[@href='https://www.livejournal.com/category/korotko/']")
    private WebElement elementFour;
    @FindBy(xpath = ".//a[@href='https://www.livejournal.com/category/video/']")
    private WebElement elementFive;

    public WebElementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonHeader() {
        return loginButtonHeader;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSettingButton() {
        return settingButton;
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

    public WebElement getLanguageSwitchButton() {
        return languageSwitchButton;
    }

    public WebElement getLanguageDeutsch() {
        return languageDeutsch;
    }

    public WebElement getProfileHeader() {
        return profileHeader;
    }

    public WebElement getElementOne() {
        return elementOne;
    }

    public WebElement getElementTwo() {
        return elementTwo;
    }

    public WebElement getElementThree() {
        return elementThree;
    }

    public WebElement getElementFour() {
        return elementFour;
    }

    public WebElement getElementFive() {
        return elementFive;
    }


    public WebElementPage clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public WebElementPage moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public WebElementPage inputLogin(String login) {
        inputLoginField.clear();
        inputLoginField.sendKeys(login);
        return this;
    }

    public WebElementPage inputPassword(String password) {
        inputPasswordField.clear();
        inputPasswordField.sendKeys(password);
        return this;
    }

    public WebElementPage inputSearch(String text) {
        searchInput.clear();
        searchInput.sendKeys(text);
        return this;
    }
}
