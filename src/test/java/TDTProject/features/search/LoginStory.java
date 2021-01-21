package TDTProject.features.search;

import TDTProject.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps lgi;

    @Test
    public void successful_login()
    {
        lgi.is_the_home_page();
        //lgi.clickLogin();
        lgi.logins("master.alex15@yahoo.com","Leonixian1");
        lgi.should_see_overview("master.alex15@yahoo.com");
    }

    @Test
    public void invalid_email_login()
    {
        lgi.is_the_home_page();
        //lgi.clickLogin();
        lgi.logins("master.alex15@yahoo.com","");
        lgi.should_enter_valid_email();
    }

    @Test
    public void wrong_password_login()
    {
        lgi.is_the_home_page();
        //lgi.clickLogin();
        lgi.logins("master.alex15@yahoo.com","123456");
        lgi.should_check_user_and_password();
    }

    @Test
    public void empty_login()
    {
        lgi.is_the_home_page();
        //lgi.clickLogin();
        lgi.logins("","");
        lgi.should_enter_credentials();
    }

} 