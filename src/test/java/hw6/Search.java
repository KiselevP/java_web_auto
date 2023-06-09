package hw6;

import hw6.pages.HomePage;
import hw6.panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class Search extends AbstractTest {

    @Test
    void test() {

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
                                                By.xpath(".//button[@data-tour-text]")))));

        HomePage homePageAfter = new HomePage(getEventDriver());
        homePageAfter
                .clickOnElement(homePageAfter.getSearchButton())
                .inputSearch("искусственный интеллект")
                .clickOnElement(homePageAfter.getSearchButton());

        List<String> winHandle = new ArrayList<>(getEventDriver().getWindowHandles());
        getEventDriver().switchTo().window(winHandle.get(1));


        HomePage searchPage = new HomePage(getEventDriver());
        searchPage
                .clickOnElement(searchPage.getTegSections());

        Assertions.assertDoesNotThrow(searchPage::getTegSections);
    }
}