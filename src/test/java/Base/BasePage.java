package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;



public class BasePage {
    public static WebDriver driver;
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public void waitUntilElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilElementClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void click(By by) {
        waitUntilElementClickable(by);
        driver.findElement(by).click();
    }

    public WebElement getElement(By by) {
        waitUntilElementVisible(by);
        return driver.findElement(by);
    }

    public String getElementText(By by){
        waitUntilElementVisible(by);
        return driver.findElement(by).getText();
    }

    public List<WebElement> getElements(By by) {
        waitUntilElementVisible(by);
        return driver.findElements(by);
    }

    public void sendKeys(By by, String text) {
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
    }
    public void ElementisDisplayed(By by){
        waitUntilElementVisible(by);
        driver.findElement(by).isDisplayed();
    }
    public void SelectVisibleDropDownItem(String itemid,String text){
        Select dropDown = new Select(driver.findElement(By.id(itemid)));
        dropDown.selectByVisibleText(text);
    }

    public void PageScrollDown(String ScrollDownAmount) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,"+ScrollDownAmount+")");
        Thread.sleep(2000);
    }

}
