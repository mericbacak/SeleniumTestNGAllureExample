package Pages;
import Base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(LoginPage.class);
    private final By signUpName = By.xpath("//input[@data-qa='signup-name']");
    private final By signUpEmail= By.xpath("//input[@data-qa='signup-email']");
    private final By singUpButton = By.xpath("//button[@data-qa='signup-button']");

    public void clickSignUp() {
        click(singUpButton);
        logger.info("clickSignIn method has worked.");
    }

    public void SignUp(String name, String email) {
        sendKeys(signUpName,name);
        sendKeys(signUpEmail,email);
        clickSignUp();
        logger.info("SignUp method has worked.");
    }
}
