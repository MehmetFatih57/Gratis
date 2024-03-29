package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MenuCategoryPage {
    public MenuCategoryPage() {PageFactory.initElements(Driver.getDriver(), this);}
    //@FindBy(xpath = "//table/thead/tr/th[1]") public WebElement name; ORNEK  !!!!ctrl+alt+L YAPMIYORUZ sayfa yapisi bozulmasin








    //US03  21-100 arasi















































































    //US05  101- 180 arasi
    @FindBy(css = "li[class='category-509 mega-menu-drop ng-star-inserted']") public WebElement modaVeAksesuarButon;
    @FindBy(xpath = "//h1[@class='guide-title ng-star-inserted']") public WebElement modaVeAksesuarVerify;
    @FindBy(xpath = "//app-custom-product-facet-navigation[@class='ng-star-inserted']/descendant::a[@data-cx-focus='${placeholder}']") public WebElement filtreList;
    @FindBy(xpath = "//app-custom-active-facets/descendant:: span[@class='filter-value']") public WebElement filterValue;
    @FindBy(xpath = "//app-custom-product-grid-item[@class='col-xs-6 col-sm-4 col-md-4 ng-star-inserted']/descendant:: h5") public List<WebElement> urunBaslik;
    @FindBy(xpath = "//app-custom-facet[@class='list-filter-cards expanded active multi-select focus-lock ng-star-inserted']//div[@class='head ng-star-inserted']/..//span[@class='label ng-star-inserted']") public List<WebElement> markalarList;
    @FindBy(xpath = "//app-custom-facet[@class='list-filter-cards expanded active focus-lock ng-star-inserted is-locked']//span[@class='title'][normalize-space()='Alt Kategoriler']/../..//span[@class='label ng-star-inserted']") public List<WebElement> kategoriList;
    @FindBy(css = ".filter-close") public WebElement filtreKapat;
    @FindBy(xpath = "//cx-page-slot[@class='ProductLeftRefinements has-components']/descendant:: input[@placeholder='En az']")public WebElement enAzFiyat;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3 col-xs-12 mobile-hidden']/descendant:: span[@aria-valuenow='8']") public WebElement enAzFiyatSlideBar;
    @FindBy(xpath = "//cx-page-slot[@class='ProductLeftRefinements has-components']/descendant:: input[@placeholder='En Çok']") public WebElement enCokFiyat;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3 col-xs-12 mobile-hidden']/descendant:: span[@aria-valuenow='776']") public WebElement enCokFiyatSlideBar;
    @FindBy(xpath = "//cx-page-slot[@class='ProductLeftRefinements has-components']/descendant:: a[@class='apply']") public WebElement fiyatEnter;
    @FindBy(xpath = "//div[@class='row product-list-wrapper col3 ng-star-inserted']//div[@class='product-price']/descendant::span[@class='amount']") public List<WebElement> fiyatDogrulama;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3 col-xs-12 mobile-hidden']/descendant:: a[contains (@href, 'priceValue:8-776')]") public WebElement fiyatFiltreTemizlikDogrulama;
    @FindBy(xpath = "//app-custom-active-facets//span[@class='filter-value']") public WebElement fiyatFiltreDeger;































































    //US06 181-260 arasi















































































    //US07 261-340 arasi















































































    //US08 341- 420 arasi
    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]") public WebElement anaSayfaVerify;
    @FindBy(xpath = "(//*[text()='Parfüm & Deodorant'])[2]") public WebElement parfumDeodorant;
    @FindBy(xpath = "(//*[text()='Erkek Parfüm'])[2]") public WebElement erkekParfüm;
    @FindBy(xpath = "(//h1)[1]") public WebElement erkekParfümVerify;
    @FindBy(xpath = "(//h5)[1]") public WebElement urun;
    @FindBy(xpath = "(//h1)[1]") public WebElement urunVerify;
    @FindBy(xpath = "(//*[@type='button'])[4]") public WebElement button;
    @FindBy(xpath = "//*[@type='submit']") public WebElement sepeteEkle;
    @FindBy(xpath = "//*[@class='alert alert-danger ng-star-inserted']") public WebElement messageVerify;

}
