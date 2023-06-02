package hw5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Authorization extends AbstractTest {
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
                getDriver().findElement(By.xpath(".//button[@name='action:login'][@tabindex='14']"));
        loginButtonWindow.click();

        Thread.sleep(3000);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath(".//a[@title='homework1234']")));
    }
}
