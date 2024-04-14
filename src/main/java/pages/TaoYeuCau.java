package pages;

import core.BaseTest;
import helper.locator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;

import java.util.concurrent.TimeUnit;

public class TaoYeuCau extends BaseTest {
    public static void TaoYeuCau() throws Exception {
        Thread.sleep(1000);
        driver.findElement(locator.TaoYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement sendNoiDung = driver.findElement(locator.NoiDungYeuCau);
        sendNoiDung.click();
        sendNoiDung.sendKeys("giúp tôi sữa chữa nhé");
        MobileElement sendGhiChu = driver.findElement(locator.GhiChu);
        sendGhiChu.click();
        sendGhiChu.sendKeys("giúp tôi sữa chữa nhé");
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
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(locator.LichSuYeuCau).click();
        touchAction.tap(PointOption.point(530, 350)).perform();
    }
}