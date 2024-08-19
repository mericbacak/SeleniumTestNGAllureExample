package Tests;
import Base.BaseTest;
import Pages.LoginPage;
import Pages.SignUpPage;
import io.qameta.allure.*;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.HomePage;
import static io.qameta.allure.SeverityLevel.*;
import static Utils.Driver.DriverHolder.getDriver;

@Epic("TestCases")
@Feature("TestCase1")
@Story("user first create a account after fill the information than verify account is created after that user delete account and verify user deleted")
public class TestCase1 extends BaseTest {

    private HomePage homePage;    private LoginPage loginPage;    private SignUpPage signUpPage;
    @BeforeMethod
    public void GetPageDrivers(){
        homePage=new HomePage(getDriver());
        loginPage=new LoginPage(getDriver());
        signUpPage=new SignUpPage(getDriver());
    }
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(LoginPage.class);


    @Test(description = "Register User Step1")
    @Severity(NORMAL)
    @Description("user open automation exercise page, click signup button")
    public void Step1() throws InterruptedException {
        logger.info("Step1 is running");
        homePage.VerifyCategoryisDisplayed();
        homePage.clickSignupbutton();
        homePage.VerifyNewUserSignUpText("New User Signup!");
        loginPage.SignUp("test Automation","mericbacak@gmail.com");
        signUpPage.VerifyEnterAccountInfo("ENTER ACCOUNT INFORMATION");
        signUpPage.VerifyAddressInfo("ADDRESS INFORMATION");
        signUpPage.clickGender();
        signUpPage.setPassword("test1234");
        signUpPage.SelectBirthDate("days","8");
        signUpPage.SelectBirthMonth("months","August");
        signUpPage.SelectBirthYear("years","1993");
        signUpPage.SignUpNews();
        signUpPage.Optin();
        signUpPage.SetFirstname("Meriç");
        signUpPage.SetLastname("Bacak");
        signUpPage.SetCompany("Viennalife");
        signUpPage.SetAddres1("Esatpaşa");
        signUpPage.SetAdres2("Atasehir");
        signUpPage.SelectCountry("country","United States");
        signUpPage.SetState("Marmara");
        signUpPage.SetCity("ISTANBUL");
        signUpPage.SetZipCode("34700");
        signUpPage.SetMobileNumber("5424642222");
        signUpPage.clickCreateAccount();
        signUpPage.VerifyAccountCreatedTexts();
        signUpPage.clickContinueBtn();
        homePage.VerifyLoggedAsinText("test Automation");
        homePage.clickDeleteAccountBtn();
        homePage.AccountDeletedIsDisplayed();
        homePage.clickContinueBtn();
        logger.info("Step1 has completed");
    }
}
