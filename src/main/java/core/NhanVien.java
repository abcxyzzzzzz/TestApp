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

    @BeforeTest
    public void setup() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "testmobilee");
            cap.setCapability("udid", "192.168.61.101:5555");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("appPackage", "com.lcssoft.qtsctms");
            cap.setCapability("appActivity", "com.lcssoft.qtsctms.MainActivity");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url,cap);
            touchAction = new TouchAction(driver);
    }

    @Test
    public void sampleTest(){
        System.out.println((systemDateTime));
        System.out.println(("I am inside sample Test"));
    }
}