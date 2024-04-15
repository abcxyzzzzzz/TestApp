package pages;

import core.BaseTest;
import helper.locator;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class login extends BaseTest {
    public static void login()
    {
        MobileElement skipButton = driver.findElement(locator.SkipButton);
        skipButton.click();
        driver.findElement(locator.DienSDT).click();
        driver.findElement(locator.DienSDT).sendKeys("2837158888");
        driver.findElement(locator.Next).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(locator.Next).click();
    }
}