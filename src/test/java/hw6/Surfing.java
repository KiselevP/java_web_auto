package hw6;

import hw6.pages.HomePage;
import hw6.panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Surfing extends AbstractTest {

    @Test
    void test() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getDriver());
        authPanel.inputLogin("homework1234")
                .inputPassword("3h4-xrU-MwX-j3U")
                .clickOnElement(authPanel.getRememberMeButton())
                .clickOnElement(authPanel.getLoginButtonWindow());

        new WebDriverWait(getDriver(), Duration.ofSeconds(1))
                .until(
                        ExpectedConditions.refreshed(
                                ExpectedConditions.stalenessOf(
                                        getDriver().findElement(
                                                By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/']")))));

        HomePage homePageAfter = new HomePage(getDriver());
        homePageAfter
                .clickOnElement(homePageAfter.getElementOne())
                .clickOnElement(homePageAfter.getElementTwo())
                .clickOnElement(homePage.getElementThree())
                .clickOnElement(homePage.getElementFour())
                .clickOnElement(homePage.getElementFive());

        Assertions.assertEquals("https://www.livejournal.com/media/video/", getDriver().getCurrentUrl());
    }

}
