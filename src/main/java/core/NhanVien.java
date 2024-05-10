package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NhanVien extends BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    protected static TouchAction touchAction;

    /**
     * Hàm SetUp được gọi trước mỗi test case để thiết lập cấu hình để kết nối với Appium server
     * @throws MalformedURLException nếu thiết lập cấu hình thất bại
     */
    @BeforeTest
    public void SetUp() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            // Thiết lập thông tin thiết bị
            cap.setCapability("deviceName", "Pixel XL");
            cap.setCapability("udid", "192.168.52.103:5555");
            // Thiết lập hệ điều hành
            cap.setCapability("platformName", "Android");
            // Thiết lập phiên bản hệ điều hành
            cap.setCapability("platformVersion", "13");
            // Thiết lập gói ứng dụng
            cap.setCapability("appPackage", "com.lcssoft.qtsctms");
            // Thiết lập Activity mặc định
            cap.setCapability("appActivity", "com.lcssoft.qtsctms.MainActivity");
            // Kết nối đến Appium server thông qua địa chỉ URL
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            // Khởi tạo đối tượng driver
            driver = new AppiumDriver<MobileElement>(url,cap);
            // Khởi tạo đối tượng touchAction
            touchAction = new TouchAction(driver);
    }

    /**
     * Test case ví dụ, in ra thời gian hiện tại và in ra một tin nhắn
     */
    @Test
    public void SampleTest(){
        System.out.println((systemDateTime)); // In ra thời gian hiện tại
        System.out.println(("Tôi đang nằm trong test case ví dụ")); // In ra một tin nhắn
    }
}
