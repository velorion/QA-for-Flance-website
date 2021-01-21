package TDTProject.features.search;

import TDTProject.steps.serenity.ScenarioSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ScenarioStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public ScenarioSteps scen;


    @Test
    public void beginnerScenario()
    {
        scen.goToLoginPage();
        scen.successfulLogin("master.alex15@yahoo.com","Leonixian1");
        scen.search("telefon");
        scen.get_to_filters();
        scen.filter_search();
        scen.add_to_cart();
        scen.should_be_in_cart();
        scen.logout();
    }

//    @Test
//    public void advancedScenario()
//    {
//
//    }

}
