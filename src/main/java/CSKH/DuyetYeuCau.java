package CSKH;

import core.NhanVien;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class DuyetYeuCau extends NhanVien {
    public static void DuyetYeuCau() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DongYThongBao).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DanhSachYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.TheTatCa).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChonLoaiTimKiem).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.TheNoiDung).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //MobileElement sendGhiChu = driver.findElement(By.xpath("//android.widget.EditText/android.widget.Button[1]"));
        touchAction.tap(PointOption.point(400, 350)).perform();
        //sendGhiChu.sendKeys(systemDateTime);
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(450, 730)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DuyetYeuCau).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DongY).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.Dong).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Create tickets\"]")).click();

    }

}
