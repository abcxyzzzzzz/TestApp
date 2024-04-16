package RunTest;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.Login;
import pages.TaoYeuCau;

public class mobile extends BaseTest {
    @Test
    public void TestOne() throws Exception{
        Login.Login();
    }
    @Test (dependsOnMethods = "TestOne")
    public void TestTwo() throws Exception{
        TaoYeuCau.TaoYeuCau();
    }

    @Test (dependsOnMethods = {"TestOne", "TestTwo"})
    public void TestNhanVien() throws Exception{
        TestNhanVien testNhanVien = new TestNhanVien();
        testNhanVien.Test();
    }
}