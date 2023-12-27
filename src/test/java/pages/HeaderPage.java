package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HeaderPage {
    public HeaderPage() {PageFactory.initElements(Driver.getDriver(), this);}
    //@FindBy(xpath = "//table/thead/tr/th[1]") public WebElement name; ORNEK  !!!!ctrl+alt+L YAPMIYORUZ sayfa yapisi bozulmasin








    //US04  21-100 arasi















































































    //US10  101-180 arasi
    @FindBy(xpath = "(//h5)[1]") public WebElement urun;
    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]") public WebElement anaSayfaVerify;
    @FindBy(xpath = "(//*[@class='highlighted ng-star-inserted'])[1]") public WebElement girisYapIkonu;
    @FindBy(xpath = "(//*[@type='text'])[1]") public WebElement eMail;
    @FindBy(xpath = "(//*[@type='password'])[1]") public WebElement sifre;
    @FindBy(xpath = "//*[@class='round-btns']") public WebElement girisYapButton;
    @FindBy(xpath = "(//*[@style='cursor: pointer;'])[1]") public WebElement favoriButton;
    @FindBy(xpath = "(//*[@type='text'])[1]") public WebElement istekListesiName;
    @FindBy(xpath = "(//*[@type='radio'])[1]") public WebElement ozel;
    @FindBy(xpath = "//*[@class='round-btns ng-star-inserted']") public WebElement ekle;
    @FindBy(xpath = "//*[@class='alert alert-success ng-star-inserted']") public WebElement istekListesiVerify;
    @FindBy(xpath = "//*[@class='favorites']") public WebElement favoriler;
    @FindBy(xpath = "//*[text()='Favori Listelerim']") public WebElement favoriListesiVerify;
    @FindBy(xpath = "//*[@class='edit']") public WebElement listeAdiEdit;
    @FindBy(xpath = "//*[@class='modal-header']") public WebElement istekListesi;
    @FindBy(xpath = "(//*[@type='text'])[2]") public WebElement istekListesiIsimEdit;
    @FindBy(xpath = "//*[text()=' Kaydet ']") public WebElement kaydet;
    @FindBy(xpath = "//*[text()='Kabul Et']") public WebElement kabulEt;
    @FindBy(xpath = "//*[@class='alert alert-success ng-star-inserted']") public WebElement favoriListeNameVerify;
    @FindBy(xpath = "//*[@class='delete']") public WebElement delete;
    @FindBy(xpath = "//*[text()='İstek Listesini Sil']") public WebElement deleteVerify;
    @FindBy(xpath = "//*[@class='btn cc-button cc-button-primary']") public WebElement deleteButton;
    @FindBy(xpath = "//*[@class='btn cc-button cc-button-primary']") public List<WebElement> deleteListeVerify;
    @FindBy(xpath = "//*[@formcontrolname='selectedWishListCode']") public WebElement ddm;

































    }

