package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected AppiumDriver<MobileElement> driver;

    public void initializeDriver(String testName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Galaxy.*");
        caps.setCapability("platformVersion", ".*");
        caps.setCapability("isRealMobile", true);
        caps.setCapability("build", "Internet Speed Test");
        caps.setCapability("name", testName);
        caps.setCapability("app", ConfigReader.get("app_id"));
        caps.setCapability("console", true);
        caps.setCapability("network", true);

        String username = ConfigReader.get("LT_USERNAME");
        String accessKey = ConfigReader.get("LT_ACCESS_KEY");

        driver = new AndroidDriver<>(
                new URL("https://" + username + ":" + accessKey + "@mobile-hub.lambdatest.com/wd/hub"),
                caps
        );
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void quitDriver() {
        if (driver != null) driver.quit();
    }
}
