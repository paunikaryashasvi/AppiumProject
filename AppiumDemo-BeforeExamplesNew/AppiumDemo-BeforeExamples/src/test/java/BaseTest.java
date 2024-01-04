import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "/src/test/resources/TestDataFiles/ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Demo");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "14");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
