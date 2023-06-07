package hw3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Search {
public static void searchOnSite() throws InterruptedException {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    options.addArguments("start-maximized");

    WebDriver webDriver = new ChromeDriver(options);
    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    webDriver.get("https://www.livejournal.com");

    WebElement loginButtonHeader = webDriver.findElement(By.xpath(".//a[text()='Войти']"));
    loginButtonHeader.click();


    WebElement inputNameField = webDriver.findElement(By.xpath(".//input[@id = 'user']"));
    inputNameField.click();
    inputNameField.sendKeys("homework1234");

    Thread.sleep(1000);

    WebElement inputPasswordField = webDriver.findElement(By.xpath(".//input[@id = 'lj_loginwidget_password']"));
    inputPasswordField.click();
    inputPasswordField.sendKeys("3h4-xrU-MwX-j3U");

    Thread.sleep(1000);

    WebElement rememberMeButton = webDriver.findElement(By.xpath(".//label[@class = 'b-loginform-checkbox__control']"));
    rememberMeButton.click();

    WebElement loginButtonWindow =
            webDriver.findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
    loginButtonWindow.click();

    Thread.sleep(1000);

    WebElement searchButton = webDriver.findElement(By.xpath(".//button[@data-tour-text]"));
    searchButton.click();

    Thread.sleep(1000);

    WebElement searchInput = webDriver.findElement(By.cssSelector(".s-header-search__input-wrapper > #SearchText"));
    searchInput.sendKeys("искусственный интеллект");

    searchButton.click();

    Thread.sleep(3000);

    webDriver.quit();
}
}
