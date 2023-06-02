package hw5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Surfing extends AbstractTest{

    @Test
    void test() throws InterruptedException {

        getDriver().get("https://www.livejournal.com");

        WebElement loginButtonHeader = getDriver().findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();

        Thread.sleep(1000);

        WebElement inputNameField = getDriver().findElement(By.xpath(".//input[@id = 'user']"));
        inputNameField.click();
        inputNameField.sendKeys("homework1234");

        Thread.sleep(1000);

        WebElement inputPasswordField = getDriver().findElement(By.xpath(".//input[@id = 'lj_loginwidget_password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("3h4-xrU-MwX-j3U");

        Thread.sleep(1000);

        WebElement rememberMeButton = getDriver().findElement(By.xpath(".//label[@class = 'b-loginform-checkbox__control']"));
        rememberMeButton.click();

        WebElement loginButtonWindow =
                getDriver().findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        loginButtonWindow.click();

        Thread.sleep(2000);

        WebElement element1 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/']"));
        element1.click();

        Thread.sleep(1000);

        WebElement element2 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/media_v_zhzh/']"));
        element2.click();

        Thread.sleep(1000);

        WebElement element3 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/vsem-vesna/']"));
        element3.click();

        Thread.sleep(1000);

        WebElement element4 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/korotko/']"));
        element4.click();

        Thread.sleep(1000);

        WebElement element5 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/video/']"));
        element5.click();

        Thread.sleep(1000);

        Assertions.assertEquals("https://www.livejournal.com/media/video/", getDriver().getCurrentUrl());
    }

}
