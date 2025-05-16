package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import javax.swing.*;

public class SpeedTestPage {

    private AppiumDriver<MobileElement> driver;

    public SpeedTestPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void clickBrowserIcon() {
        driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and ./parent::*[@resource-id='com.example.QAapp:id/webpage']]")).click();
    }

    public void enterWebName() {
        driver.findElement(By.xpath("//*[@resource-id='com.example.QAapp:id/websiteName']")).click();
    }
    public void typeText() {
        driver.findElement(By.xpath("//*[@resource-id='com.example.QAapp:id/websiteName']")).sendKeys("https://testmy.net/");

    }
    public void clickFindButton() {
        driver.findElement(By.xpath("//*[@resource-id=\"com.example.QAapp:id/findButton\"]")).click();
    }
    public void clickTestMyInternet()
    {
        driver.findElement(By.xpath("//*[@resource-id=\"testBtnMn\"]")).click();
    }
    public void clickOnDownloadBtn()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"DOWNLOAD\"]")).click();
    }
    public void clickOnUploadButton()
    {
        driver.findElement(By.xpath("//android.widget.Button[contains(@text, 'UPLOAD')]")).click();
    }
}
