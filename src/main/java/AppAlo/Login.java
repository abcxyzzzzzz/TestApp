package AppAlo;

import core.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;

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
    public static void LoginRandomSDT() throws InterruptedException {
        MobileElement skipButton = driver.findElement(Locator.SkipButton);
        skipButton.click();
        driver.findElement(Locator.DienSDT).click();
        driver.findElement(Locator.DienSDT).sendKeys(soDienThoai);
        driver.findElement(Locator.Next).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        driver.findElement(Locator.Next).click();
        //Tiến hành đăng ký
        driver.findElement(Locator.DienTen).click();
        driver.findElement(Locator.DienTen).sendKeys(HoTen);
        //Chọn công ty
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.CongTy).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.TenCongTy).click();
        //Điền Email
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.Email).click();
        driver.findElement(Locator.Email).sendKeys(Email);
        //Điền giới tính
        driver.findElement(Locator.GioiTinh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.ChonGioiTinh).click();
        //Điền ngày tháng năm sinh
        driver.findElement(Locator.NgayThangNam).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.ChonNgayThangNam).click();
        //Điền quê quán
        driver.findElement(Locator.QueQuan).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.ChonQueQuan).click();
        //Điền chức vụ
        Thread.sleep(500);
        touchAction.tap(PointOption.point(430, 1845)).perform();
        Thread.sleep(500);
        touchAction.tap(PointOption.point(300, 1700)).perform();

        //ClickButton
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.TaoTaiKhoanButton).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locator.DongGiaoDienDangKy).click();

    }
}