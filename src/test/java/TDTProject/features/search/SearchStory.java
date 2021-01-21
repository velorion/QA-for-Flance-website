package TDTProject.features.search;


import TDTProject.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchSteps srch;

    @Test
    public void buy_item()
    {
        srch.search("iPhone X");
        srch.add_to_cart();
        srch.should_be_in_cart();
        srch.delete_from_cart();
        srch.cart_should_be_empty();
    }

    @Test
    public void invalid_search()
    {
        srch.search("testing");
        srch.search_error();
    }

    @Test
    public void simple_search_1()
    {
        srch.search("Telefon");
        srch.check_results();
    }

    @Test
    public void simple_search_2()
    {
        srch.search("Camera");
        srch.check_results2();
    }

}
