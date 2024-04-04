package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    @BeforeTest
    public void setup(){
        try{
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "testmobilee");
            cap.setCapability("udid", "192.168.61.101:5555");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("appPackage", "com.lcssoft.aloqtsc");
            cap.setCapability("appActivity", "com.lcssoft.aloqtsc.MainActivity");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url,cap);

        } catch (Exception e) {
            System.out.println("Cause is: "+e.getCause());
            System.out.println("Cause is: "+e.getMessage());
            e.printStackTrace();
        }
    }
    @Test
    public void sampleTest(){
        System.out.println(("I am inside sample Test"));
    }
}
