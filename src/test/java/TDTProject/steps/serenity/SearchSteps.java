package TDTProject.steps.serenity;

import TDTProject.pages.SearchPage;
import TDTProject.pages.LoginPage;
import TDTProject.pages.MainPage;
import TDTProject.pages.OverviewPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SearchSteps {

    private MainPage mainPage;
    private LoginPage loginPage;
    private OverviewPage overviewPage;
    private SearchPage searchPage;

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

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
    public void delete_from_cart()
    {
        searchPage.deleteFromCart();
    }

    @Step
    public void cart_should_be_empty()
    {
        assertThat(searchPage.getCartStatus(), equalTo("Coşul de cumparaturi este gol"));
    }

    @Step
    public void search_error()
    {
        assertThat(searchPage.getSearchResult(), equalTo("Nu au fost gasite rezultate pentru cautarea \"testing\""));
    }

    @Step
    public void check_results()
    {
        String line = searchPage.getResult1();
        assertThat(line.split(" ")[0], equalTo("Telefon"));
        line = searchPage.getResult2();
        assertThat(line.split(" ")[0], equalTo("Telefon"));
        line = searchPage.getResult3();
        assertThat(line.split(" ")[0], equalTo("Telefon"));
        line = searchPage.getResult4();
        assertThat(line.split(" ")[0], equalTo("Telefon"));
    }

    @Step
    public void check_results2()
    {
        String line = searchPage.getResult1();
        assertThat(line.split(" ")[0], equalTo("Camera"));
        line = searchPage.getResult2();
        assertThat(line.split(" ")[0], equalTo("Camera"));
        line = searchPage.getResult3();
        assertThat(line.split(" ")[0], equalTo("Camera"));
        line = searchPage.getResult4();
        assertThat(line.split(" ")[0], equalTo("Camera"));
    }

}
