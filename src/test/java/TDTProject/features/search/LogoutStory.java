package TDTProject.features.search;


import TDTProject.steps.serenity.LogoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LogoutStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogoutSteps lout;

    @Test
    public void logout()
    {
        lout.login("master.alex15@yahoo.com","Leonixian1");
        lout.logout();
        lout.should_check_logout();
    }

}
