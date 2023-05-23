import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Surfing {
public static void siteSurfing() throws InterruptedException {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    options.addArguments("start-maximized");

    WebDriver webDriver = new ChromeDriver(options);
    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    webDriver.get("https://www.livejournal.com");

    WebElement loginButtonHeader = webDriver.findElement(By.xpath(".//a[text()='Войти']"));
    loginButtonHeader.click();

    Thread.sleep(1000);

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

    Thread.sleep(2000);

    WebElement element1 = webDriver.findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/']"));
    element1.click();

    Thread.sleep(1000);

    WebElement element2 = webDriver.findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/media_v_zhzh/']"));
    element2.click();

    Thread.sleep(1000);

    WebElement element3 = webDriver.findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/vsem-vesna/']"));
    element3.click();

    Thread.sleep(1000);

    WebElement element4 = webDriver.findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/korotko/']"));
    element4.click();

    Thread.sleep(1000);

    WebElement element5 = webDriver.findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/video/']"));
    element5.click();

    Thread.sleep(1000);

    webDriver.quit();
}
}
