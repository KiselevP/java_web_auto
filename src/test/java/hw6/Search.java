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
                                                By.xpath(".//button[@data-tour-text]")))));

        HomePage homePageAfter = new HomePage(getDriver());
        homePageAfter
                .clickOnElement(homePageAfter.getSearchButton())
                .inputSearch("искусственный интеллект")
                .clickOnElement(homePageAfter.getSearchButton());

        List<String> winHandle = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(winHandle.get(1));


        HomePage searchPage = new HomePage(getDriver());
        searchPage
                .clickOnElement(searchPage.getTegSections());

        Assertions.assertDoesNotThrow(searchPage::getTegSections);
    }
}