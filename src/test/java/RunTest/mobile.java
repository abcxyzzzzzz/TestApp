package RunTest;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.TaoYeuCau;
import pages.login;
import pages.loginNhanVien;

public class mobile extends BaseTest {
    @Test
    public void testOne() throws Exception{
        login.login();
    }
    @Test (dependsOnMethods = "testOne")
    public void testTwo() throws Exception{
        TaoYeuCau.TaoYeuCau();
    }

    @Test (dependsOnMethods = {"testOne", "testTwo"})
    public void testNhanVien() throws Exception{
        TestNhanVien testNhanVien = new TestNhanVien();
        testNhanVien.Test();
    }
}