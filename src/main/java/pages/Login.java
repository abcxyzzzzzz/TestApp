package pages;

import core.BaseTest;
import helper.Locator;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class Login extends BaseTest {
    public static void Login() throws InterruptedException {
        MobileElement skipButton = driver.findElement(Locator.SkipButton);
        skipButton.click();
        driver.findElement(Locator.DienSDT).click();
        driver.findElement(Locator.DienSDT).sendKeys("2837158888");
        driver.findElement(Locator.Next).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        driver.findElement(Locator.Next).click();
    }
}