package Utils.Driver;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    @NotNull
    @Contract("_ -> new")
    public static WebDriver getNewDriverInstance(@NotNull String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome-headless":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--disable-infobars");
                chromeOptions.addArguments("--version");
                chromeOptions.addArguments("--no-sandbox");  // Sandbox modunu devre dışı bırak
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--disable-popup-blocking");
                chromeOptions.addArguments("--enable-automation");
                chromeOptions.addArguments("--incognito");
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
               return new ChromeDriver(chromeOptions);
            case "firefox":
                return new FirefoxDriver();
            case "firefox-headless":
                FirefoxBinary firefoxBinary = new FirefoxBinary();
                firefoxBinary.addCommandLineOptions("--headless");
                firefoxBinary.addCommandLineOptions("--version");
                firefoxBinary.addCommandLineOptions("--start-maximized");
                firefoxBinary.addCommandLineOptions("--disable-popup-blocking");
                firefoxBinary.addCommandLineOptions("--enable-automation");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                return new FirefoxDriver(firefoxOptions);
            case "edge":
                return new EdgeDriver();
            default:
                ChromeOptions chromeOptions2 = new ChromeOptions();
                chromeOptions2.addArguments("--disable-infobars");
                chromeOptions2.addArguments("--version");
                chromeOptions2.addArguments("--no-sandbox");  // Sandbox modunu devre dışı bırak
                chromeOptions2.addArguments("--start-maximized");
                chromeOptions2.addArguments("--disable-popup-blocking");
                chromeOptions2.addArguments("--enable-automation");
                chromeOptions2.addArguments("--incognito");
                return new ChromeDriver(chromeOptions2);
        }
    }
}
