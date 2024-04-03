import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileTests {
    static AppiumDriver<MobileElement> driver;
    public static void  main(String[] args) {
        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
        public static void openCalculator() throws Exception {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName","testmobilee");
            cap.setCapability("udid","192.168.61.101:5555");
            cap.setCapability("platformName","Android");
            cap.setCapability("platformVersion","12.1");
            cap.setCapability("appPackage","com.lcssoft.aloqtsc");
            cap.setCapability("appActivity","com.lcssoft.aloqtsc.MainActivity");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url,cap);
            System.out.println("Application Started...");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement skipButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]"));
            skipButton.click();
            driver.findElement(By.xpath("//android.widget.EditText")).click();
            driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("2837158888");
            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).click();
            driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).sendKeys("giúp tôi sữa chữa nhé");
            driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).click();
            driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).sendKeys("giúp tôi sữa chữa nhé");
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add image\"]")).click();
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Chose image\"]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Create issue\"]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Close\"]")).click();







        }


}
