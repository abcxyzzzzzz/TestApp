package RunTest;

import core.NhanVien;
import org.testng.annotations.Test;
import pages.DuyetYeuCau;
import pages.loginNhanVien;

public class TestNhanVien extends NhanVien {
    @Test
    public void Test() throws Exception{
        String taiKhoan = "nhanviencskh@qtsc.com.vn";
        String matKhau = "nhanviencskh";
        loginNhanVien.loginNhanVien(taiKhoan,matKhau);
    }
    @Test (dependsOnMethods = "Test")
    public void DuyetIssue() throws Exception {
        DuyetYeuCau.DuyetYeuCau();
    }
}