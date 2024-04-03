import helper.login;
import pages.TaoYeuCau;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class mobileTests {
    static AppiumDriver<MobileElement> driver;
    public static void main(String[] args) throws Exception {
        driver = login.openApp();
        Thread.sleep(2000);
        TaoYeuCau.TaoYeuCau(driver);
    }
}
