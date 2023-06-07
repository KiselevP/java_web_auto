package hw6;

import hw6.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LanguageSwitch extends AbstractTest {

    @Test
    void test(){
        HomePage homePage = new HomePage(getEventDriver());

        homePage
                .moveToElement(homePage.getLanguageSwitchButton())
                .clickOnElement(homePage.getLanguageDeutsch());

        Assertions.assertDoesNotThrow(homePage::getLanguageDeutsch);
    }

}
