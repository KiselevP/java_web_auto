package hw5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LanguageSwitch extends AbstractTest{

    @Test
    void test() throws InterruptedException {
        getDriver().get("https://www.livejournal.com");

        WebElement languageSwitchButton = getDriver().findElement(By.xpath(".//span[contains(text(), 'Русский')]"));
        new Actions(getDriver()).moveToElement(languageSwitchButton).perform();

        WebElement languageDeutsch = getDriver().findElement(By.xpath(".//a[contains(text(), 'Deutsch (de)')]"));
        languageDeutsch.click();

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath(".//span[contains(text(), 'Deutsch')]")));
    }

}
