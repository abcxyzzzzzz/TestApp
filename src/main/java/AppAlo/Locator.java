package AppAlo;

import org.openqa.selenium.By;

public class Locator {
    public static final By SkipButton = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    public static final By DienSDT = By.xpath("//android.widget.EditText");
    public static final By Next = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    public static final By AnThongBao = By.xpath("com.android.permissioncontroller:id/permission_allow_button");
    public static final By TaoYeuCau = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public static final By NoiDungYeuCau = By.xpath("(//android.view.View[@resource-id=\"input_label_text\"])[5]");
    public static final By GhiChu = By.xpath("(//android.view.View[@resource-id=\"input_label_text\"])[6]");
    public static final By ThemHinhAnh = By.xpath("//android.view.View[@content-desc=\"Add image\"]");
    public static final By ChonThemHinhAnh = By.xpath("//android.view.View[@content-desc=\"Chose image\"]");
    public static final By ChapNhanQuyen = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static final By ChonHinhAnh = By.xpath("//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"]");
    public static final By GuiYeuCau = By.xpath("//android.widget.Button[@content-desc=\"Create issue\"]");
    public static final By DongYeuCau = By.xpath("//android.widget.Button[@content-desc=\"Close\"]");
    public static final By LichSuYeuCau = By.xpath("//android.view.View[@content-desc=\"History\"]");


    //Đăng ký

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
