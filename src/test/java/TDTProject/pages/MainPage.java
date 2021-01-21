package TDTProject.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.flanco.ro")
public class MainPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"login-towatch\"]")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//*[@id=\"login-towatch\"]")
    private WebElementFacade logoutButton;

    @FindBy(xpath = "//a[contains(text(),'Iesire cont')]")
    private WebElementFacade logout;

    @FindBy(xpath = "//input[@class='button']")
    private WebElementFacade loginButtonText;

    @FindBy(xpath = "//input[@id='searchingfield']")
    private WebElementFacade searchField;

    @FindBy(xpath = "//button[@id='searching']")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//body[contains(@class,'catalogsearch-result-index result')]/div[@id='content']/div[@class='section clearfix']/div[@class='results-view']/div[@class='listing-wrapper']/div[@id='products-wrapper']/div[1]")
    private WebElementFacade addToCartButton;

    public void click_login()
    {
        loginButton.click();
    }

    public void click_logout()
    {
        logoutButton.click();
        logout.click();
    }

    public String getLoginButtonText()
    {
       //return loginButtonText.getText();
        loginButton.click();
        return loginButtonText.getValue();
    }

    public void enterSearchItem(String item)
    {
        searchField.type(item);
        searchButton.click();
    }

    public void setAddToCart()
    {
        addToCartButton.click();
    }
}
