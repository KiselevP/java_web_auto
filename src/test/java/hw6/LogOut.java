package hw6;

import hw6.pages.HomePage;
import hw6.panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogOut extends AbstractTest {

    @Test
    void test(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword())
                .clickOnElement(authPanel.getRememberMeButton())
                .clickOnElement(authPanel.getLoginButtonWindow());

        HomePage homePageAfter = new HomePage(getDriver());
        homePageAfter
                .moveToElement(homePageAfter.getProfileHeader())
                .clickOnElement(homePageAfter.getLogoutButton());

        Assertions.assertDoesNotThrow(homePageAfter::getLoginButtonHeader);
    }

}
