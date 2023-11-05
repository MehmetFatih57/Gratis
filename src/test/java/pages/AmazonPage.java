package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_026_UI_page {
    public US_026_UI_page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    US_026_UI_page loginLocators = new US_026_UI_page();

    @FindBy(xpath = "//a[@href='/contact']")
    public WebElement contactButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameInputContact;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailInputContact;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subjectInputContact;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public WebElement messageInputContact;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendButtonContact;

    @FindBy(xpath = "//*[contains(text(),'Your message has been received')]")
    public WebElement successfulContactMessage;

    @FindBy (xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesMenu;

    @FindBy (xpath = "//a[@href='/c-message' and @class='dropdown-item']")
    public WebElement messagesButtonOnDDM;


    public void loginAs(String userRole) {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
        ReusableMethods.waitFor(1);
        loginLocators.userIconButton.click();
        ReusableMethods.waitFor(1);
        loginLocators.signInButton.click();
        ReusableMethods.waitFor(1);
        switch (userRole) {
            case "admin":
                loginLocators.usernameOnSignIn.sendKeys(ConfigurationReader.getProperty("adminUserNameRk"));
                loginLocators.passwordOnSignIn.sendKeys(ConfigurationReader.getProperty("adminPwdRk"));
                BrowserUtilities.clickWithJS(loginLocators.signInButtonOnSignIn);
                break;
            case "patient":
                loginLocators.usernameOnSignIn.sendKeys(ConfigurationReader.getProperty("patientUsername"));
                loginLocators.passwordOnSignIn.sendKeys(ConfigurationReader.getProperty("passWordRk"));
                BrowserUtilities.clickWithJS(loginLocators.signInButtonOnSignIn);
                break;
            case "staff":
                loginLocators.usernameOnSignIn.sendKeys(ConfigurationReader.getProperty("staffUsername"));
                loginLocators.passwordOnSignIn.sendKeys(ConfigurationReader.getProperty("passWordRk"));
                BrowserUtilities.clickWithJS(loginLocators.signInButtonOnSignIn);
                break;
            case "Physician":
                loginLocators.usernameOnSignIn.sendKeys(ConfigurationReader.getProperty("physicianUsername"));
                loginLocators.passwordOnSignIn.sendKeys(ConfigurationReader.getProperty("passWordRk"));
                BrowserUtilities.clickWithJS(loginLocators.signInButtonOnSignIn);
                break;
            case "User":
                loginLocators.usernameOnSignIn.sendKeys(ConfigurationReader.getProperty("userUsername"));
                loginLocators.passwordOnSignIn.sendKeys(ConfigurationReader.getProperty("passWordRk"));
                BrowserUtilities.clickWithJS(loginLocators.signInButtonOnSignIn);
                break;
        }
    }
}
