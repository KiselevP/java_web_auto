package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogOut extends AbstractTest {

    @Test
    void test(){

        WebElementPage webElementPage = new WebElementPage(getDriver());

        webElementPage
                .clickOnElement(webElementPage.getLoginButtonHeader())
                .inputLogin("homework1234")
                .inputPassword("3h4-xrU-MwX-j3U")
                .clickOnElement(webElementPage.getRememberMeButton())
                .clickOnElement(webElementPage.getLoginButtonWindow())
                .moveToElement(webElementPage.getProfileHeader())
                .clickOnElement(webElementPage.getLogoutButton());

        Assertions.assertDoesNotThrow(webElementPage::getLoginButtonHeader);
    }

}
