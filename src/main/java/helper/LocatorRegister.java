package helper;

import org.openqa.selenium.By;

public class LocatorRegister {
    public static final By DienTen = By.xpath("(//android.view.View[@resource-id=\"input_label_text\"])[2]");
    public static final By CongTy = By.xpath("//android.widget.Button[@resource-id=\"register\"]/android.view.View/android.view.View[2]/android.view.View[2]");
    public static final By TenCongTy = By.xpath("//android.view.View[@content-desc=\"CÔNG TY TNHH GIẢI PHÁP CÔNG NGHỆ BIZWORK Linh\"]");
    public static final By Email = By.xpath("(//android.view.View[@resource-id=\"input_label_text\"])[4]");
    public static final By GioiTinh = By.xpath("//android.widget.Button[@resource-id=\"register\"]/android.view.View/android.view.View[4]");
    public static final By ChonGioiTinh = By.xpath("//android.view.View[@content-desc=\"Nữ\"]");
    public static final By NgayThangNam = By.xpath("//android.widget.Button[@resource-id=\"register\"]/android.view.View/android.view.View[5]");
    public static final By ChonNgayThangNam = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]");
    public static final By QueQuan = By.xpath("//android.widget.Button[@resource-id=\"register\"]/android.view.View/android.view.View[6]");
    public static final By ChonQueQuan = By.xpath("//android.view.View[@content-desc=\"Spain\"]");
    public static final By ChonChucVu = By.xpath("//android.view.View[@content-desc=\"Choose position\"]/android.view.View[2]");
    public static final By TaoTaiKhoanButton = By.xpath("//android.widget.Button[@content-desc=\"Create account\"]");
    public static final By DongGiaoDienDangKy = By.xpath("//android.widget.Button[@content-desc=\"Close\"]");
}
