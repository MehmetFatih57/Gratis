package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id= \"sp-cc-accept\"]")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//a[@id= 'nav-link-accountList']")
    public WebElement accountList;

    @FindBy(xpath = "//span[@class= 'nav-action-inner']")
    public WebElement login;

    @FindBy(xpath = "//input[@type= \"email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type= \"submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    public WebElement passwordButton;

    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    public WebElement searchBox;


    @FindBy(xpath = "nav-search-submit-button")
    public WebElement searchBoxButton;

    @FindBy(xpath = "//span[@class = \"a-dropdown-prompt\"]")
    public WebElement dropDownMenu;

    @FindBy (id = "a-autoid-0-announce")
    public WebElement getDropDownMenu2;


    @FindBy(xpath = "//a[@id= \"s-result-sort-select_1\"]")
    public WebElement lowToHigh;


    @FindBy(xpath = "//img[@class=\"s-image\"] [1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
    public WebElement addToCard;

    @FindBy(xpath = "//span [@class = \"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]")
    public WebElement addToCartAssert;

    @FindBy(xpath = "//input[@title= \"Sil\"]")
    public WebElement productDelete;


}
