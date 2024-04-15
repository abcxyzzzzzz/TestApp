package pages;

import core.NhanVien;
import helper.locator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TimeUnit;

public class DuyetYeuCau extends NhanVien {
    public static void DuyetYeuCau() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"All\n" +
                "Tab 2 of 2\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText/android.widget.Button[2]/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Nội dung\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement sendGhiChu = driver.findElement(By.xpath("//android.widget.EditText/android.widget.Button[1]"));
        touchAction.tap(PointOption.point(483, 450)).perform();
        sendGhiChu.sendKeys(systemDateTime);
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(450, 730)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Receive\"]")).click();
    }

}
