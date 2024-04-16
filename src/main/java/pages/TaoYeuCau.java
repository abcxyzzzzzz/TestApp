package pages;

import core.BaseTest;
import helper.Locator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TaoYeuCau extends BaseTest {
    public static void TaoYeuCau() throws Exception {
        Thread.sleep(1000);
        driver.findElement(Locator.TaoYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement sendNoiDung = driver.findElement(Locator.NoiDungYeuCau);
        sendNoiDung.click();
        sendNoiDung.sendKeys(systemDateTime);
        MobileElement sendGhiChu = driver.findElement(Locator.GhiChu);
        sendGhiChu.click();
        sendGhiChu.sendKeys("giúp tôi sữa chữa nhé");
        driver.findElement(Locator.ThemHinhAnh).click();
        driver.findElement(Locator.ChonThemHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.ChapNhanQuyen).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.ChonHinhAnh).click();
        Thread.sleep(1000);
        driver.findElement(Locator.GuiYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.DongYeuCau).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(Locator.LichSuYeuCau).click();
        touchAction.tap(PointOption.point(530, 350)).perform();

    }
}