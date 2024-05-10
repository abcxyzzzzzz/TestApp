package helper;
import core.NhanVien;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Lớp LoginNhanVien có một phương thức static để thực hiện việc đăng nhập nhân viên.
 * Phương thức này trích xuất các thông tin đăng nhập từ các biến taiKhoan và matKhau
 * và thực hiện các hành động tương ứng trên trang đăng nhập.
 */
public class LoginNhanVien extends NhanVien{
    /**
     * Phương thức đăng nhập nhân viên.
     * @param taiKhoan Mã tài khoản nhân viên
     * @param matKhau Mật khẩu của nhân viên
     * @throws InterruptedException
     */
    public static void LoginNhanVien(String taiKhoan, String matKhau) throws InterruptedException {
        // Chờ 1 giây trước khi thực hiện các hành động tiếp theo
        Thread.sleep(1000);
        // Tìm kiếm và nhấn vào nút chuyển qua
        MobileElement skipButton = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Welcome to\n" +
                "QTSC TMS\"]/android.widget.EditText[1]"));
        skipButton.click();
        // Gửi tên đăng nhập vào trường nhập tài khoản
        skipButton.sendKeys(taiKhoan);
        // Tìm kiếm và nhấn vào trường nhập mật khẩu
        MobileElement passWord = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Welcome to\n" +
                "QTSC TMS\"]/android.widget.EditText[2]"));
        passWord.click();
        // Gửi mật khẩu vào trường nhập mật khẩu
        passWord.sendKeys(matKhau);
        // Tìm kiếm và nhấn vào nút tiếp tục
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();
    }
}
