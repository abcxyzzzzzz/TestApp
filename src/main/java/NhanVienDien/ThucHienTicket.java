package NhanVienDien;

import core.NhanVien;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import NhanVienDien.LocatorNhanVienDien;

import java.util.concurrent.TimeUnit;


public class ThucHienTicket extends NhanVien {
    public static void ThucHienTicket() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.DongYThongBao).click();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(500, 650)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.NhanTicKet).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.DongYTicKet).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(500, 650)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).click();
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).sendKeys("Trước xử lý");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ThemHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ChonHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.DongYThongBao).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ChonHinhAnhDaLuu).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.LuuTienTrinh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();


        //Sau khi thực hiện
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).click();
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).sendKeys("Sau khi xử lý");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ThemHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ChonHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ChonHinhAnhDaLuu).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.LuuTienTrinh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.HoanTat).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();


    }
    public static void ThucHienTicketChupAnh() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.DongYThongBao).click();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(500, 650)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.NhanTicKet).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.DongYTicKet).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(500, 650)).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).click();
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).sendKeys("Trước xử lý");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ThemHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Take a photo\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.camera2:id/done_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.LuuTienTrinh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();


        //Sau khi thực hiện
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).click();
        driver.findElement(LocatorNhanVienDien.NhapGhiChu).sendKeys("Sau khi xử lý");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.ThemHinhAnh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Take a photo\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.camera2:id/done_button")).click();
        driver.findElement(LocatorNhanVienDien.LuuTienTrinh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.HoanTat).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorNhanVienDien.Dong).click();


    }
}
