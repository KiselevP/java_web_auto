package hw5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOut extends AbstractTest{

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

        Thread.sleep(3000);

        WebElement profileHeader = getDriver().findElement(By.xpath(".//a[@title='homework1234']"));
        new Actions(getDriver()).moveToElement(profileHeader).perform();

        WebElement logoutButton = getDriver().findElement(By.cssSelector(".s-header-sub-list-item__link--logout"));
        logoutButton.click();

        Thread.sleep(3000);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath(".//a[text()='Войти']")));
    }

}
