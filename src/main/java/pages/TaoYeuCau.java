package pages;

import helper.locator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TaoYeuCau {
    public static void TaoYeuCau(AppiumDriver<MobileElement> driver) throws Exception {
        MobileElement skipButton = driver.findElement(locator.SkipButton);
        skipButton.click();
        driver.findElement(locator.DienSDT).click();
        driver.findElement(locator.DienSDT).sendKeys("2837158888");
        driver.findElement(locator.Next).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(locator.Next).click();
        Thread.sleep(5000);
        driver.findElement(locator.TaoYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(locator.NoiDungYeuCau).click();
        driver.findElement(locator.NoiDungYeuCau).sendKeys("giúp tôi sữa chữa nhé");
        driver.findElement(locator.GhiChu).click();
        driver.findElement(locator.GhiChu).sendKeys("giúp tôi sữa chữa nhé");
        driver.findElement(locator.ThemHinhAnh).click();
        driver.findElement(locator.ChonThemHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(locator.ChapNhanQuyen).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(locator.ChonHinhAnh).click();
        Thread.sleep(1000);
        driver.findElement(locator.GuiYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(locator.DongYeuCau).click();
    }
}
