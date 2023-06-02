package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Search extends AbstractTest {

    @Test
    void test() throws InterruptedException {
        WebElementPage webElementPage = new WebElementPage(getDriver());

        webElementPage
                .clickOnElement(webElementPage.getLoginButtonHeader())
                .inputLogin("homework1234")
                .inputPassword("3h4-xrU-MwX-j3U")
                .clickOnElement(webElementPage.getRememberMeButton())
                .clickOnElement(webElementPage.getLoginButtonWindow());
        Thread.sleep(3000);
        webElementPage
                .clickOnElement(webElementPage.getSearchButton())
                .inputSearch("искусственный интеллект")
                .clickOnElement(webElementPage.getSearchButton());
        Thread.sleep(5000);

        Assertions.assertDoesNotThrow(webElementPage::getLoginButtonHeader);
    }
}
