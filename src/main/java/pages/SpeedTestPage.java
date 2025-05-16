package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SpeedTestPage {

    private AppiumDriver<MobileElement> driver;

    public SpeedTestPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private final By browserIcon = By.xpath("//*[@class='android.widget.ImageView' and ./parent::*[@resource-id='com.example.QAapp:id/webpage']]");

    public void clickBrowserIcon() {
        driver.findElement(browserIcon).click();  // This fails if driver is null
    }

}


