package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import net.datafaker.Faker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Base class for all test cases
 */
public class BaseTest {
    /**
     * Driver for Appium sessions
     */
    protected static AppiumDriver<MobileElement> driver;
    /**
     * TouchAction object for interacting with the Appium session
     */
    protected static TouchAction touchAction;
    /**
     * Current system date and time
     */
    protected static String systemDateTime;
    /**
     * Random cell phone number generated using the Faker library
     */
    protected static String soDienThoai;
    /**
     * Random full name generated using the Faker library
     */
    protected static String HoTen;
    /**
     * Random email address generated using the Faker library
     */
    protected static String Email;
    @BeforeTest
    public void SetUp() throws MalformedURLException {
        // Cấu hình cho session Appium
        // Includes deviceName, udid, platformName, platformVersion, appPackage, and appActivity
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel XL"); // tên thiết bị
        cap.setCapability("udid", "192.168.52.103:5555"); // udid của thiết bị
        cap.setCapability("platformName", "Android"); // hệ điều hành
        cap.setCapability("platformVersion", "13"); // phiên bản hệ điều hành
        cap.setCapability("appPackage", "com.lcssoft.aloqtsc"); // gói ứng dụng
        cap.setCapability("appActivity", "com.lcssoft.aloqtsc.MainActivity"); // Activity mặc định
        URL url = new URL("http://127.0.0.1:4723/wd/hub"); // URL đến Appium server

        driver = new AppiumDriver<MobileElement>(url,cap);
        touchAction = new TouchAction(driver);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        systemDateTime = formatter.format(new Date());

        // Tạo dữ liệu ngẫu nhiên bằng library Faker
        Faker faker = new Faker();

        // Tạo một số điện thoại ngẫu nhiên và gán nó cho soDienThoai
        soDienThoai = faker.phoneNumber().cellPhone();

        // Tạo một tên đầy đủ ngẫu nhiên và gán nó cho HoTen
        HoTen = faker.name().fullName();

        // Tạo một địa chỉ email ngẫu nhiên và gán nó cho Email
        Email = faker.internet().emailAddress();
    }

    @Test
    public void SampleTest() {
        System.out.println("Tôi đang trong sample Test");
        System.out.println("Số điện thoại ngẫu nhiên: " + soDienThoai);
    }
}
