package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SepeteEklemePage {
    public SepeteEklemePage() {
        PageFactory.initElements(Driver.getDriver(), this);
        //@FindBy(xpath = "//table/thead/tr/th[1]")
        //public WebElement name;


    }

}
