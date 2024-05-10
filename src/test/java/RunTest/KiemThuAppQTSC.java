package RunTest;

import CSKH.TaoTicket;
import NhanVienDien.ThucHienTicket;
import core.NhanVien;
import org.testng.annotations.Test;
import CSKH.DuyetYeuCau;
import helper.LoginNhanVien;

public class KiemThuAppQTSC extends NhanVien {
    //Test nhân viên cskh

//    @Test
//    public void KiemThuDangNhap() throws Exception{
//        String taiKhoan = "nhanviencskh@qtsc.com.vn";
//        String matKhau = "nhanviencskh";
//        LoginNhanVien.LoginNhanVien(taiKhoan,matKhau);
//    }
//    @Test (dependsOnMethods = "KiemThuDangNhap")
//    public void DuyetYeuCau() throws Exception {
//        DuyetYeuCau.DuyetYeuCau();
//    }
//    @Test (dependsOnMethods = "DuyetYeuCau")
//    public void TaoTicket() throws Exception {
//        TaoTicket.TaoTicket();
//    }

    //Test nhân viên điện thực hiện ticket tải ảnh

//    @Test
//    public void KiemThuDangNhap() throws Exception{
//        String taiKhoan = "nhanviendien@qtsc.com.vn";
//        String matKhau = "nhanviendien";
//        LoginNhanVien.LoginNhanVien(taiKhoan,matKhau);
//    }
//    @Test (dependsOnMethods = "KiemThuDangNhap")
//    public void ThucHienTicKet() throws Exception {
//        ThucHienTicket.ThucHienTicket();
//    }
    //Test nhân viên điện thực hiện ticket chụp ảnh
    @Test
    public void KiemThuDangNhap() throws Exception{
        String taiKhoan = "nhanviendien@qtsc.com.vn";
        String matKhau = "nhanviendien";
        LoginNhanVien.LoginNhanVien(taiKhoan,matKhau);
    }
    @Test (dependsOnMethods = "KiemThuDangNhap")
    public void ThucHienTicKet() throws Exception {
        ThucHienTicket.ThucHienTicketChupAnh();
    }
}