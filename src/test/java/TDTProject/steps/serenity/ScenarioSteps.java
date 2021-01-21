package TDTProject.steps.serenity;

import TDTProject.pages.*;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ScenarioSteps {

    private MainPage mainPage;
    private LoginPage loginPage;
    private OverviewPage overviewPage;
    private SearchPage searchPage;

    @Step
    public void successfulLogin(String username,String password)
    {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        assertThat(overviewPage.getEmail(),equalTo(username));
    }

    @Step
    public void goToLoginPage()
    {
        loginPage.open();
    }

    @Step
    public void goToMainPage()
    {
        mainPage.open();
    }

    @Step
    public void logout()
    {
        goToMainPage();
        mainPage.click_logout();
    }

    @Step
    public void search(String item)
    {
        mainPage.open();
        mainPage.enterSearchItem(item);
    }

    @Step
    public void add_to_cart()
    {
        searchPage.addToCart();
    }

    @Step
    public void should_be_in_cart()
    {
        assertThat(searchPage.getCartQuantity(), equalTo("A fost adaugat in cos cu succes"));
    }

    @Step
    public void get_to_filters()
    {
        searchPage.getToFilters();
    }

    @Step
    public void filter_search()
    {
        searchPage.filterSearch();
    }
}
