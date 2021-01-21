package TDTProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.flanco.ro/customer/account/")
public class OverviewPage extends PageObject {

    //@FindBy(xpath = "//*[@id=\"card-profile-email\"]")
    @FindBy(xpath = "//p[@class='account-mail']")
    private WebElementFacade email_field;

    @FindBy(xpath = "//img[@id='logo']")
    private WebElementFacade go_back;

    public String getEmail()
    {
        return email_field.getText();
    }

    public void goBack()
    {
        go_back.click();
    }

}
