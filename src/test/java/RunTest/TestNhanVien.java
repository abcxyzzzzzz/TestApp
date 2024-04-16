package RunTest;

import core.NhanVien;
import org.testng.annotations.Test;
import pages.DuyetYeuCau;
import pages.LoginNhanVien;

public class TestNhanVien extends NhanVien {
    @Test
    public void Test() throws Exception{
        String taiKhoan = "nhanviencskh@qtsc.com.vn";
        String matKhau = "nhanviencskh";
        LoginNhanVien.LoginNhanVien(taiKhoan,matKhau);
    }
    @Test (dependsOnMethods = "Test")
    public void DuyetIssue() throws Exception {
        DuyetYeuCau.DuyetYeuCau();
    }
}