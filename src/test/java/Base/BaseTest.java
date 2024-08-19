package Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Utils.Driver.DriverFactory;

import static Utils.PropertyFileReader.getProperty;
import static Utils.Driver.DriverHolder.getDriver;
import static Utils.Driver.DriverHolder.setDriver;

public class BaseTest {

    @BeforeClass
    public void before() {
        killChromeProcesses();
        setDriver(DriverFactory.getNewDriverInstance(getProperty("browser")));
        getDriver().manage().window().maximize();
        getDriver().get(getProperty("application_url"));
    }

    public static void killChromeProcesses() {
        try {
            // This will kill all Chrome processes
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void after() {
        if (getDriver() != null) {
            getDriver().quit();
        }
        killChromeProcesses();
    }
}
