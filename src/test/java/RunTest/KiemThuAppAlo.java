package RunTest;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.Login;
import pages.TaoYeuCau;

public class KiemThuAppAlo extends BaseTest {
    @Test
    public void KiemTraDangNhap() throws Exception{
        Login.LoginRandomSDT();
    }
    @Test (dependsOnMethods = "KiemTraDangNhap")
    public void TestTaoYeuCau() throws Exception{
        TaoYeuCau.TaoYeuCau();
    }
}
