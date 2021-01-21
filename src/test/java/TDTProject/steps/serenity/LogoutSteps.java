package TDTProject.steps.serenity;

import TDTProject.pages.LoginPage;
import TDTProject.pages.MainPage;
import TDTProject.pages.OverviewPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LogoutSteps {

    private MainPage mainPage;
    private LoginPage loginPage;
    private OverviewPage overviewPage;

    @Step
    public void login(String username, String password)
    {
        loginPage.open();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void logout()
    {
        overviewPage.goBack();
        mainPage.click_logout();
    }

    @Step
    public void should_check_logout()
    {
        assertThat(mainPage.getLoginButtonText(),equalTo("Autentificare"));
    }

}
