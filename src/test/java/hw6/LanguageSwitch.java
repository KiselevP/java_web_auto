package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LanguageSwitch extends AbstractTest {

    @Test
    void test(){
        WebElementPage webElementPage = new WebElementPage(getDriver());

        webElementPage
                .moveToElement(webElementPage.getLanguageSwitchButton())
                .clickOnElement(webElementPage.getLanguageDeutsch());

        Assertions.assertDoesNotThrow(webElementPage::getLanguageDeutsch);
    }

}
