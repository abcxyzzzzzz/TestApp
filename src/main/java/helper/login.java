package helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class login {
    public static AppiumDriver<MobileElement> openApp() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "testmobilee");
        cap.setCapability("udid", "192.168.61.101:5555");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12.1");
        cap.setCapability("appPackage", "com.lcssoft.aloqtsc");
        cap.setCapability("appActivity", "com.lcssoft.aloqtsc.MainActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        return new AndroidDriver<>(url, cap);
    }
}
