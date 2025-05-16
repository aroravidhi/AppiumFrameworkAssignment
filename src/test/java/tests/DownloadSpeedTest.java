package tests;

import base.BaseTest;
import org.testng.annotations.*;
import utils.RetryAnalyzer;

public class DownloadSpeedTest extends BaseTest {

    @BeforeMethod
    public void setUp() throws Exception {
        initializeDriver("Download Speed Test");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testDownloadSpeed() throws Exception
    {

    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }
}