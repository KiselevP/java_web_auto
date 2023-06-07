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

        HomePage homePage = new HomePage(getEventDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword())
                .clickOnElement(authPanel.getRememberMeButton())
                .clickOnElement(authPanel.getLoginButtonWindow());

        new WebDriverWait(getEventDriver(), Duration.ofSeconds(1))
                .until(
                        ExpectedConditions.refreshed(
                                ExpectedConditions.stalenessOf(
                                        getEventDriver().findElement(
                                                By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/']")))));

        HomePage homePageAfter = new HomePage(getEventDriver());
        homePageAfter
                .clickOnElement(homePageAfter.getElementOne())
                .clickOnElement(homePageAfter.getElementTwo())
                .clickOnElement(homePage.getElementThree())
                .clickOnElement(homePage.getElementFour())
                .clickOnElement(homePage.getElementFive());

        Assertions.assertEquals("https://www.livejournal.com/media/video/", getEventDriver().getCurrentUrl());
    }

}
