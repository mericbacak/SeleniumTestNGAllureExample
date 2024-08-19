package Pages;
import Base.BasePage;
import Locators.SignUpPageLocators;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class SignUpPage extends BasePage {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(SignUpPage.class);
    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    SignUpPageLocators locators=new SignUpPageLocators();

    public void VerifyEnterAccountInfo(String text){
        Assert.assertEquals(text,getElementText(locators.EnterAccountInfo));
        logger.info("VerifyElementText, method has worked. Verified text: "+text);
    }
    public void VerifyAddressInfo(String text){
        Assert.assertEquals(text,getElementText(locators.AddressInformation));
        logger.info("VerifyElementText, method has worked. Verified text: "+text);
    }
    public void clickGender(){
        click(locators.Gender);
        logger.info("clickGender method has worked");
    }
    public void setPassword(String password){
        sendKeys(locators.passwordField,password);
        logger.info("setPassword method has worked");
    }
    public void SelectBirthDate(String itemid,String day){
        SelectVisibleDropDownItem(itemid,day);
        logger.info("SelectBirthDate method has worked");
    }
    public void SelectBirthMonth(String itemid,String month){
        SelectVisibleDropDownItem(itemid,month);
        logger.info("SelectMonthDate method has worked");
    }
    public void SelectBirthYear(String itemid,String year) throws InterruptedException {
        SelectVisibleDropDownItem(itemid,year);
        logger.info("SelectBirthYear method has worked");
        PageScrollDown("500");
    }
    public void SignUpNews(){
        click(locators.Signupnews);
        logger.info("SignUpNews method has worked");
    }
    public void Optin(){
        click(locators.optin);
        logger.info("Optin method has worked");
    }
    public void SetFirstname(String FirstName){
        sendKeys(locators.FirstName,FirstName);
        logger.info("SetFirstname method has worked");
    }
    public void SetLastname(String LastName){
        sendKeys(locators.LastName,LastName);
        logger.info("SetLastname method has worked");
    }
    public void SetCompany(String Company){
        sendKeys(locators.Company,Company);
        logger.info("SetCompany method has worked");
    }
    public void SetAddres1(String adress1){
        sendKeys(locators.Adres1,adress1);
        logger.info("SetAddres1 method has worked");
    }
    public void SetAdres2(String adress2){
        sendKeys(locators.Adres2,adress2);
        logger.info("SetAdres2 method has worked");
    }
    public void SelectCountry(String itemid,String Country){
        SelectVisibleDropDownItem(itemid,Country);
        logger.info("SelectCountry method has worked");
    }
    public void SetState(String State){
        sendKeys(locators.State,State);
        logger.info("SetState method has worked");
    }
    public void SetCity(String City){
        sendKeys(locators.City,City);
        logger.info("SetCity method has worked");
    }
    public void SetZipCode(String Zipcode){
        sendKeys(locators.ZipCode,Zipcode);
        logger.info("SetZipCode method has worked");
    }
    public void SetMobileNumber(String GSM) throws InterruptedException {
        sendKeys(locators.MobileNumber,GSM);
        logger.info("SetMobileNumber method has worked");
        PageScrollDown("400");
    }
    public void clickCreateAccount(){
        click(locators.CreateAccountBtn);
        logger.info("clickCreateAccount method has worked");
    }
    public void VerifyAccountCreatedTexts(){
        ElementisDisplayed(locators.AccountCreated);
        ElementisDisplayed(locators.VerifyAccountCreationText);
        logger.info("VerifyAccountCreatedTexts method has worked");
    }
    public void clickContinueBtn(){
        click(locators.ContinueBtn);
        logger.info("clickContinueBtn method has worked");
    }
}
