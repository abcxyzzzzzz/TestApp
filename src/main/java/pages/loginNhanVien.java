package pages;
import core.NhanVien;
import helper.locator;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class loginNhanVien extends NhanVien{
    public static void loginNhanVien(String taiKhoan, String matKhau) throws InterruptedException {
        Thread.sleep(1000);
        MobileElement skipButton = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Welcome to\n" +
                "QTSC TMS\"]/android.widget.EditText[1]"));
        skipButton.click();
        skipButton.sendKeys(taiKhoan);
        MobileElement passWord = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Welcome to\n" +
                "QTSC TMS\"]/android.widget.EditText[2]"));
        passWord.click();
        passWord.sendKeys(matKhau);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();
    }
}