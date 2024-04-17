package pages;

import core.BaseTest;
import helper.Locator;
import helper.LocatorRegister;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

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
        driver.findElement(LocatorRegister.DienTen).click();
        driver.findElement(LocatorRegister.DienTen).sendKeys(HoTen);
        //Chọn công ty
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.CongTy).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.TenCongTy).click();
        //Điền Email
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.Email).click();
        driver.findElement(LocatorRegister.Email).sendKeys(Email);
        //Điền giới tính
        driver.findElement(LocatorRegister.GioiTinh).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.ChonGioiTinh).click();
        //Điền ngày tháng năm sinh
        driver.findElement(LocatorRegister.NgayThangNam).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.ChonNgayThangNam).click();
        //Điền quê quán
        driver.findElement(LocatorRegister.QueQuan).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.ChonQueQuan).click();
        //Điền chức vụ
        Thread.sleep(500);
        touchAction.tap(PointOption.point(980, 1650)).perform();
        Thread.sleep(500);
        touchAction.tap(PointOption.point(300, 1700)).perform();

        //ClickButton
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.TaoTaiKhoanButton).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorRegister.DongGiaoDienDangKy).click();

    }
}