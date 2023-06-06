package hw5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search extends AbstractTest{

    @Test
    void test() throws InterruptedException {

        getDriver().get("https://www.livejournal.com");

        String firstWindow = getDriver().getWindowHandle();

        WebElement loginButtonHeader = getDriver().findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();


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

        Thread.sleep(1000);

        WebElement searchButton = getDriver().findElement(By.xpath(".//button[@data-tour-text]"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement searchInput = getDriver().findElement(By.cssSelector(".s-header-search__input-wrapper > #SearchText"));
        searchInput.sendKeys("искусственный интеллект");

        searchButton.click();

        Thread.sleep(1000);

        getDriver().switchTo().window(firstWindow);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/']")));


    }

}
