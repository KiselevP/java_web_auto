package hw6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    @FindBy(xpath = ".//a[text()='Войти']")
    private WebElement loginButtonHeader;
    /* @FindBy(css = ".s-header-sub-list-item__link--logout")
    private WebElement logoutButton; */
    @FindBy(css = ".s-header-search__input-wrapper > #SearchText")
    private WebElement searchInput;
    @FindBy(xpath = ".//button[@data-tour-text]")
    private WebElement searchButton;
    @FindBy(xpath = ".//a[text()='Настройки']")
    private WebElement settingButton;
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

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonHeader() {
        return loginButtonHeader;
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


    public HomePage clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public HomePage moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public HomePage inputSearch(String text) {
        searchInput.clear();
        searchInput.sendKeys(text);
        return this;
    }
}
