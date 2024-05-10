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

public class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    protected static TouchAction touchAction;
    protected static String systemDateTime;
    protected static String soDienThoai;
    protected static String HoTen;
    protected static String Email;
    @BeforeTest
    public void SetUp() throws MalformedURLException {
        // Set up the DesiredCapabilities for the Appium session
        // This includes the deviceName, udid, platformName, platformVersion,
        // appPackage, and appActivity
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel XL"); // Set the device name to Pixel XL
        cap.setCapability("udid", "192.168.52.103:5555"); // Set the udid to 192.168.52.103:5555
        cap.setCapability("platformName", "Android"); // Set the platformName to Android
        cap.setCapability("platformVersion", "13"); // Set the platformVersion to 13
        cap.setCapability("appPackage", "com.lcssoft.aloqtsc"); // Set the appPackage to com.lcssoft.aloqtsc
        cap.setCapability("appActivity", "com.lcssoft.aloqtsc.MainActivity"); // Set the appActivity to com.lcssoft.aloqtsc.MainActivity
        URL url = new URL("http://127.0.0.1:4723/wd/hub"); // Set the URL to the Appium server

        driver = new AppiumDriver<MobileElement>(url,cap);
        touchAction = new TouchAction(driver);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        systemDateTime = formatter.format(new Date());

        // Generate fake data using the Faker library
        Faker faker = new Faker();

        // Generate a random cell phone number and assign it to soDienThoai
        soDienThoai = faker.phoneNumber().cellPhone();

        // Generate a random full name and assign it to HoTen
        HoTen = faker.name().fullName();

        // Generate a random email address and assign it to Email
        Email = faker.internet().emailAddress();
    }

    @Test
    public void SampleTest() {
        System.out.println("I am inside sample Test");
        System.out.println("Số điện thoại ngẫu nhiên: " + soDienThoai);
    }
}