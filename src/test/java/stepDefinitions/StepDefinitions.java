package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;


public class StepDefinitions {
    AmazonPage amazon = new AmazonPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Given("Kullanici Amazon anasayfasina gider")
    public void kullanici_amazon_anasayfasina_gider() {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        wait.until(ExpectedConditions.visibilityOf(amazon.cookiesAccept));

    }

    @When("Giris yap sekmesine tiklar")
    public void giris_yap_sekmesine_tiklar() {
        actions.moveToElement(amazon.accountList).perform();
        amazon.login.click();
    }

    @Then("Gecerli kullanici adini girer")
    public void gecerli_kullanici_adini_girer() {
        amazon.emailBox.click();
        actions.sendKeys(amazon.emailBox, "akifrencber@gmail.com").perform();

    }

    @Then("Devam et butonuna tiklar")
    public void devam_et_butonuna_tiklar() {
        amazon.submitButton.click();
    }

    @Then("Gecerli password bilgisini girer")
    public void gecerli_password_bilgisini_girer() {
        actions.sendKeys(amazon.passwordBox, "Akif12345").perform();

    }

    @Then("Giris yap butonuna tiklar")
    public void giris_yap_butonuna_tiklar() {
        amazon.passwordButton.click();
    }

    @Then("Kullanici arama kutusuna herhangi bir gecerli veri girisi yapar")
    public void kullanici_arama_kutusuna_herhangi_bir_gecerli_veri_girisi_yapar() {

        actions.sendKeys(amazon.searchBox, "Java")
                .sendKeys(Keys.ENTER).perform();

    }


    @Then("Kullanici arama sonuclarini fiyati dusukten yuksege siralar")
    public void kullanici_arama_sonuclarini_fiyati_dusukten_yuksege_siralar() {


        amazon.getDropDownMenu2.click();
        amazon.lowToHigh.click();


    }

    @Then("Kullanici fiyati en dusuk olan urune tiklar")
    public void kullanici_fiyati_en_dusuk_olan_urune_tiklar() {

        ReusableMethods.waitForVisibility(amazon.firstProduct, 5).click();

    }

    @Then("Kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {

        amazon.addToCard.click();

    }

    @Then("Kullanici urunun sepete eklendigini dogrular")
    public void kullaniciUrununSepeteEklendiginiDogrular() {


        Assert.assertTrue(amazon.addToCartAssert.getText().contains("Sepete Eklendi"));
        // test başarılı oldu.

    }
}

