package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Surfing extends AbstractTest {

    @Test
    void test() throws InterruptedException {

        WebElementPage webElementPage = new WebElementPage(getDriver());

        webElementPage
                .clickOnElement(webElementPage.getLoginButtonHeader())
                .inputLogin("homework1234")
                .inputPassword("3h4-xrU-MwX-j3U")
                .clickOnElement(webElementPage.getRememberMeButton())
                .clickOnElement(webElementPage.getLoginButtonWindow());
        Thread.sleep(1000);
        webElementPage
                .clickOnElement(webElementPage.getElementOne())
                .clickOnElement(webElementPage.getElementTwo())
                .clickOnElement(webElementPage.getElementThree())
                .clickOnElement(webElementPage.getElementFour())
                .clickOnElement(webElementPage.getElementFive());

        Assertions.assertEquals("https://www.livejournal.com/media/video/", getDriver().getCurrentUrl());
    }

}
