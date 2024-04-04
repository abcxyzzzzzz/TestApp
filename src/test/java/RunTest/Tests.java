package RunTest;

import core.BaseTest;
import helper.locator;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;
import pages.TaoYeuCau;

import java.util.concurrent.TimeUnit;

public class Tests extends BaseTest {
    @Test
    public void testOne() throws Exception{
            TaoYeuCau.TaoYeuCau();
    }
}
