package core;

import io.appium.java_client.AppiumDriver;
import net.datafaker.Faker;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    protected static TouchAction touchAction;
    protected static String systemDateTime;
    protected static String soDienThoai;
    protected static String HoTen;
    protected static String Email;

    @BeforeTest
    public void SetUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "testmobilee");
        cap.setCapability("udid", "192.168.61.101:5555");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12.1");
        cap.setCapability("appPackage", "com.lcssoft.aloqtsc");
        cap.setCapability("appActivity", "com.lcssoft.aloqtsc.MainActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<>(url, cap);
        touchAction = new TouchAction(driver);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        systemDateTime = formatter.format(new Date());
        Faker faker = new Faker();
        soDienThoai = faker.phoneNumber().cellPhone();
        HoTen = faker.name().fullName();
        Email = faker.internet().emailAddress();
    }

    @Test
    public void SampleTest(){
        System.out.println("I am inside sample Test");
        System.out.println("Số điện thoại ngẫu nhiên: " + soDienThoai);
    }
}
