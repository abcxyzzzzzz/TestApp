package RunTest;

import core.BaseTest;
import org.testng.annotations.Test;
import AppAlo.Login;
import AppAlo.TaoYeuCau;
/**
 * Lớp KiemThuAppAlo chứa các phương thức thực hiện các tác vụ
 * kiem thử ứng dụng Alo. Cụ thể, lớp này chứa hai phương thức:
 * 
 * - KiemTraDangNhap(): thực hiện việc đăng nhập với tài khoản ngẫu nhiên.
 * - TestTaoYeuCau(): thực hiện việc tạo yêu cầu sau khi đã đăng nhập thành công.
 */
public class KiemThuAppAlo extends BaseTest {
    
    /**
     * Kiem tra dang nhap bang tai khoan ngau nhiem.
     */
    @Test
    public void KiemTraDangNhap() throws Exception{
        Login.LoginRandomSDT();
    }
    
    /**
     * Tao yeu cau sau khi da dang nhap thanh cong.
     */
    @Test (dependsOnMethods = "KiemTraDangNhap")
    public void TestTaoYeuCau() throws Exception{
        TaoYeuCau.TaoYeuCau();
    }
}

