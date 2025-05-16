package tests;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import pages.SpeedTestPage;
import utils.RetryAnalyzer;

import java.util.concurrent.TimeUnit;

public class DownloadSpeedTest extends BaseTest {
    SpeedTestPage speedTestPage;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = initializeDriver("Download Speed Test");
        new SpeedTestPage(driver);

        speedTestPage = new SpeedTestPage(driver);

    }

    @Test
    public void testDownloadSpeed() {
        speedTestPage.clickBrowserIcon();
        speedTestPage.enterWebName();
        speedTestPage.enterWebName();
        speedTestPage.typeText();
        speedTestPage.clickFindButton();
        quitKeyboard();
        speedTestPage.clickTestMyInternet();
        //speedTestPage.clickOnDownloadBtn();
        //speedTestPage.clickOnUploadButton();

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
