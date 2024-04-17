package RunTest;

import core.NhanVien;
import org.testng.annotations.Test;
import pages.DuyetYeuCau;
import pages.LoginNhanVien;

public class KiemThuAppQTSC extends NhanVien {
    @Test
    public void KiemThuDangNhap() throws Exception{
        String taiKhoan = "nhanviencskh@qtsc.com.vn";
        String matKhau = "nhanviencskh";
        LoginNhanVien.LoginNhanVien(taiKhoan,matKhau);
    }
    @Test (dependsOnMethods = "KiemThuDangNhap")
    public void DuyetYeuCau() throws Exception {
        DuyetYeuCau.DuyetYeuCau();
    }
}