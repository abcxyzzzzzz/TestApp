package RunTest;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.Login;
import pages.TaoYeuCau;
import pages.Login;
import pages.LoginNhanVien;

public class Tests extends BaseTest {
    @Test
    public void Test1() throws Exception{
        Login.Login();
    }
    @Test (dependsOnMethods = "Test1")
    public void TestTwo() throws Exception{
        TaoYeuCau.TaoYeuCau();
    }

}
