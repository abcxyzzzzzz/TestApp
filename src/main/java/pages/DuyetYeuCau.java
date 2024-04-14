package pages;

import core.NhanVien;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TimeUnit;

public class DuyetYeuCau extends NhanVien {
    public static void DuyetYeuCau() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        touchAction.tap(PointOption.point(450, 730)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Receive\"]")).click();



    }

}
