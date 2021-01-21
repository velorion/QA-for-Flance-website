package TDTProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.flanco.ro/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade username_field;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    private WebElementFacade password_field;

    @FindBy(xpath = "//*[@id=\"send2\"]")
    private WebElementFacade login_button;

    @FindBy(xpath = "//div[@id='advice-required-entry-pass']")
    private WebElementFacade login_invalid_email;

    @FindBy(xpath = "//div[@id='advice-required-entry-pass']")
    private WebElementFacade login_missing_pass;

    @FindBy(xpath = "//span[@class='noty_text']")
    private WebElementFacade incorrect;

    @FindBy(xpath = "//div[@id='advice-required-entry-email']")
    private WebElementFacade missing_username;

    public void enterUsername(String username)
    {
        username_field.type(username);
    }

    public void enterPassword(String password)
    {
        password_field.type(password);
    }

    public String getIncorrect()
    {
        return incorrect.getText();
    }

    public String getInvalidEmail()
    {
        return login_invalid_email.getText();
    }

    public String getMissingPass()
    {
        return login_missing_pass.getText();
    }

    public String getMissingUser()
    {
        return missing_username.getText();
    }


    public void clickLoginButton()
    {
        login_button.click();
    }

}
