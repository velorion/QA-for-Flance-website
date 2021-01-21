package TDTProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.flanco.ro")
public class SearchPage extends PageObject {

    @FindBy(xpath = "//div[@class='results-view']//div[1]//div[3]//a[1]//img[1]")
    private WebElementFacade selectItem;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElementFacade cartQuantity;

    @FindBy(xpath = "//button[@id='add-to-cart']")
    private WebElementFacade addToCart;

    @FindBy(xpath = "//a[@class='inter-fw']")
    private WebElementFacade next;

    @FindBy(xpath = "//div[@class='flancons flancons-close delete-product']")
    private WebElementFacade deleteItem;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]")
    private WebElementFacade checkCart;

    @FindBy(xpath = "//h1[@id='product-page-title']")
    private WebElementFacade searchResult;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[3]/div[1]/div[6]/a[1]")
    private WebElementFacade result1;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[3]/div[2]/div[6]/a[1]")
    private WebElementFacade result2;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[3]/div[3]/div[6]/a[1]")
    private WebElementFacade result3;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[3]/div[4]/div[6]/a[1]")
    private WebElementFacade result4;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/aside[1]/div[1]/div[2]/div[1]/ul[1]/ul[1]/li[1]/a[1]/div[1]")
    private WebElementFacade get1;

    @FindBy(xpath = "//ul[2]//li[1]//a[1]//div[1]")
    private WebElementFacade get2;

    @FindBy(xpath = "//div[@id='product-filters-select']//div[2]//ul[1]//li[4]//label[1]")
    private WebElementFacade filter1;

    @FindBy(xpath = "//div[3]//ul[1]//li[2]//label[1]")
    private WebElementFacade filter2;

    @FindBy(xpath = "//div[4]//ul[1]//li[4]//label[1]")
    private WebElementFacade filter3;


    public void addToCart()
    {
        selectItem.click();
        addToCart.click();
    }

    public void deleteFromCart()
    {
        next.click();
        deleteItem.click();
    }

    public void getToFilters()
    {
        get1.click();
        get2.click();
    }

    public void filterSearch()
    {
        filter1.click();
        waitABit(300);
        filter2.click();
        waitABit(300);
        filter3.click();
        waitABit(300);
    }

    public String getCartStatus() { return checkCart.getText(); }

    public String getCartQuantity() { return cartQuantity.getText(); }

    public String getSearchResult() { return searchResult.getText(); }

    public String getResult1() { return result1.getText(); }

    public String getResult2() { return result2.getText(); }

    public String getResult3() { return result3.getText(); }

    public String getResult4() { return result4.getText(); }

}
