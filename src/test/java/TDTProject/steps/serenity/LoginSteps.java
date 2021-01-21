package TDTProject.steps.serenity;

import TDTProject.pages.LoginPage;
import TDTProject.pages.MainPage;
import TDTProject.pages.OverviewPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    private MainPage mainPage;
    private LoginPage loginPage;
    private OverviewPage overviewPage;

    @Step
    public void clickLogin()
    {
        mainPage.click_login();
    }

    @Step
    public void is_the_home_page()
    {
        loginPage.open();
    }

    @Step
    public void logins(String username, String password)
    {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void should_see_overview(String username)
    {
        assertThat(overviewPage.getEmail(),equalTo(username));
    }

    @Step
    public void should_enter_valid_email()
    {
        assertThat(loginPage.getInvalidEmail(),equalTo("Acest camp este obligatoriu."));
    }

    @Step
    public void should_check_user_and_password()
    {
        assertThat(loginPage.getIncorrect(),equalTo("Parolă de înregistrare invalidă."));
    }

    @Step
    public void should_enter_credentials()
    {
        assertThat(loginPage.getMissingPass(),equalTo("Acest camp este obligatoriu."));
        assertThat(loginPage.getMissingUser(),equalTo("Acest camp este obligatoriu."));
    }

}
