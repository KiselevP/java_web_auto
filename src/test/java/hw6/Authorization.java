package hw6;

import hw6.pages.HomePage;
import hw6.panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Authorization extends AbstractTest {
    @Test
    void test(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());
        AuthPanel authPanel = new AuthPanel(getDriver());
        authPanel.inputLogin("homework1234")
                .inputPassword("3h4-xrU-MwX-j3U")
                .clickOnElement(authPanel.getRememberMeButton())
                .clickOnElement(authPanel.getLoginButtonWindow());
        Assertions.assertDoesNotThrow(homePage::getLoginButtonHeader);
    }
}
