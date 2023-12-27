package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.*;
import utilities.*;
import static org.junit.Assert.*;
public class HeaderModuleStepDefition {
    //50'ye kadar import kaymasi veya degisken tanimla
    MenuCategoryPage menuCategoryPage = new MenuCategoryPage();
    HomePage homePage  = new HomePage();
    FooterPage footerPage = new FooterPage();
    HeaderPage headerPage = new HeaderPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();





































    //US04  51 - 400 arasi





























































































































































































































































































































































    // US10  401-750 arasi
    @When("Giris Yap butonuna tikla")
    public void girisYapButonunaTikla() {
        js.executeScript("arguments[0].click()" , headerPage.anaSayfaVerify);
        ReusableMethods.bekle(2);
    }
    @And("Açilan menüden Giris Yap secenegine tiklar")
    public void açilanMenüdenGirisYapSecenegineTiklar() {
        js.executeScript("arguments[0].click()" , headerPage.girisYapIkonu);
        ReusableMethods.bekle(2);
    }
    @And("kullanici kayit bilgilerini girer {string},{string}")
    public void kullaniciKayitBilgileriniGirer(String eMail, String Password) {
        headerPage.eMail.sendKeys(eMail);
        ReusableMethods.bekle(5);
        headerPage.sifre.sendKeys(Password);
        ReusableMethods.bekle(5);
    }
    @And("Giriş Yap butonuna tiklar")
    public void girişYapButonunaTiklar() {
        js.executeScript("arguments[0].click()" , headerPage.girisYapButton);
        ReusableMethods.bekle(8);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(5);
    }
    @And("Kullanici sectigi urunu favori listesine ekler")
    public void kullaniciSectigiUrunuFavoriListesineEkler() {
        js.executeScript("arguments[0].click()" , headerPage.urun);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click()" , headerPage.favoriButton);
    }
    @Then("Acilan pencerede istek listesine isim verir")
    public void acilanPenceredeIstekListesineIsimVerir() {
        Select select = new Select(headerPage.ddm);
        js.executeScript("arguments[0].click()" , headerPage.ddm);
        ReusableMethods.bekle(10);
        js.executeScript("arguments[0].click()" , headerPage.ddm);
        ReusableMethods.bekle(5);
        ReusableMethods.tumSayfaResmi("Olusturulan Istek Listeleri");
        ReusableMethods.bekle(2);
        select.selectByVisibleText("Yeni istek listesi...");
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click()" , headerPage.istekListesiName);
        ReusableMethods.bekle(2);
        headerPage.istekListesiName.sendKeys("Fatih");
        ReusableMethods.bekle(2);
    }
    @And("Gizlilik ayarlarindan ozel'in secili oldugunu dogrula")
    public void gizlilikAyarlarindanOzelInSeciliOldugunuDogrula() {
        Assert.assertTrue(headerPage.ozel.isEnabled());
        ReusableMethods.bekle(2);
    }
    @When("Ekle butonuna tikla")
    public void ekleButonunaTikla() {
        js.executeScript("arguments[0].click()" , headerPage.ekle);
        ReusableMethods.bekle(2);
    }
    @And("Listenin olusturuldugunu dogrula")
    public void listeninOlusturuldugunuDogrula() {
        Assert.assertEquals(headerPage.istekListesiVerify.getText() , "Tebrikler! Antonio Banderas Black Seduction EDT Erkek Parfüm 100 ml ürünün eklendiği alan: Mehmet");
        System.out.println("Liste Mesaji : " + headerPage.istekListesiVerify.getText());
    }
    @When("Favori listeni gormek icin gerekli ikona tikla")
    public void favoriListeniGormekIcinGerekliIkonaTikla() {
        js.executeScript("arguments[0].click()" , headerPage.favoriler);
        ReusableMethods.bekle(5);
    }
    @Then("Favori listesinde oldugunu dogrula")
    public void favoriListesindeOldugunuDogrula() {
        Assert.assertEquals(headerPage.favoriListesiVerify.getText() , "Favori Listelerim");
        System.out.println("Favori Listem : " + headerPage.favoriListesiVerify.getText());
    }
    @And("Liste adini duzenle yazisina tikla")
    public void listeAdiniDuzenleYazisinaTikla() {
        js.executeScript("arguments[0].click()" , headerPage.kabulEt);
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(3);
        js.executeScript("arguments[0].click()" , headerPage.listeAdiEdit);
        ReusableMethods.bekle(3);
        js.executeScript("arguments[0].click()" , headerPage.istekListesi);
        ReusableMethods.bekle(3);
        headerPage.istekListesiIsimEdit.sendKeys(Keys.CONTROL , "a");
        ReusableMethods.bekle(2);
        headerPage.istekListesiIsimEdit.clear();
        //gratis.istekListesiIsimEdit.sendKeys(Keys.CONTROL , "x");
    }
    @And("Olusturdugun favori listesine yeni bir isim ver")
    public void olusturdugunFavoriListesineYeniBirIsimVer() {
        js.executeScript("arguments[0].click()" , headerPage.listeAdiEdit);
        ReusableMethods.bekle(5);
        headerPage.istekListesiIsimEdit.sendKeys("Fatih");
        ReusableMethods.bekle(3);
    }
    @And("Kaydet butonuna tikla")
    public void kaydetButonunaTikla() {
        js.executeScript("arguments[0].click()" , headerPage.kaydet);
        ReusableMethods.bekle(3);
    }
    @Then("Listenin guncellendigini dogrula")
    public void listeninGuncellendiginiDogrula() {
        Assert.assertEquals(headerPage.favoriListeNameVerify.getText() , "Fatih adlı favori listeniz güncellendi");
        System.out.println("Liste Mesaji : " + headerPage.favoriListeNameVerify.getText());
    }
    @When("Sil butonuna tikla")
    public void silButonunaTikla() {
        js.executeScript("arguments[0].click()" , headerPage.delete);
        ReusableMethods.bekle(3);
    }
    @And("Silme ekraninin acildigini dogrula")
    public void silmeEkranininAcildiginiDogrula() {
        Assert.assertEquals(headerPage.deleteVerify.getText() , "İstek Listesini Sil");
        System.out.println("Mesaj : " + headerPage.deleteVerify.getText());
    }
    @When("Sil butonuna tiklar")
    public void silButonunaTiklar() {
        js.executeScript("arguments[0].click()" , headerPage.deleteButton);
        ReusableMethods.bekle(3);
    }
    @And("Silindigini dogrula")
    public void silindiginiDogrula() {
        for (int i = 0; i < headerPage.deleteListeVerify.size(); i++) {
            if (headerPage.deleteListeVerify.contains("Fatih")){
                System.out.println("Fatih listesi silinmistir");
            }else {
                System.out.println("Fatih listesi silinmemistir");
            }
        }
    }
    @And("Listenin olusturulamadigini dogrula")
    public void listeninOlusturulamadiginiDogrula() {
        ReusableMethods.tumSayfaResmi("Ayni isimde istek listesi olustu");
        System.out.println("Liste Mesaji : " + headerPage.istekListesiVerify.getText());
        Assert.assertFalse(headerPage.istekListesiVerify.isDisplayed() , "Istek listesi olusturuldu");
    }
}





























































































































































































































































