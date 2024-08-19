package Pages;
import Base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(HomePage.class);
    private  final By Category=By.xpath("//h2[text()='Category']");
    private final By SignUpButton=By.xpath("//a[text()=' Signup / Login']");
    private final By NewUserSignUp=By.xpath("//h2[text()='New User Signup!']");
    private final By LoggedAsin=By.xpath("//b[text()='test Automation']");
    private final By DeleteAccount= By.xpath("//a[@href='/delete_account']");
    private final By AccountDeletedText =By.xpath("//b[text()='Account Deleted!']");
    private final By AccountDeletedText2=By.xpath("//p[text()='Your account has been permanently deleted!']");
    private final By ContinueBtn=By.xpath("//a[@data-qa='continue-button']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void VerifyCategoryisDisplayed(){
        ElementisDisplayed(Category);
    }
    public void clickSignupbutton(){
        click(SignUpButton);
        logger.info("clickSignupbutton method has worked.");
    }
    public void VerifyNewUserSignUpText(String text){
        Assert.assertEquals(text,getElementText(NewUserSignUp));
        logger.info("VerifyNewUserSignUpText method has worked.");
    }
    public void VerifyLoggedAsinText(String text){
        Assert.assertEquals(text,getElementText(LoggedAsin));
        logger.info("VerifyLoggedAsinText method has worked.");
    }
    public void clickDeleteAccountBtn(){
        click(DeleteAccount);
        logger.info("clickDeleteAccountBtn method has worked.");
    }
    public void AccountDeletedIsDisplayed(){
        ElementisDisplayed(AccountDeletedText);
        ElementisDisplayed(AccountDeletedText2);
        logger.info("AccountDeletedIsDisplayed method has worked.");
    }
    public void clickContinueBtn(){
        click(ContinueBtn);
        logger.info("clickContinueBtn method has worked.");
    }
}
