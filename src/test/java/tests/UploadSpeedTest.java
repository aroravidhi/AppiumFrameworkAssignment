package tests;

import base.BaseTest;
import org.testng.annotations.*;
import utils.RetryAnalyzer;

public class UploadSpeedTest extends BaseTest {

    @BeforeMethod
    public void setUp() throws Exception {
        initializeDriver("Upload Speed Test");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testUploadSpeed() throws Exception {

    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }
}