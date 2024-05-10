package NhanVienDien;

import org.openqa.selenium.By;

public class LocatorNhanVienDien {
    public static final By NhanTicKet = By.xpath("//android.widget.Button[@content-desc=\"Receive\"]");
    public static final By DongYTicKet = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]");
    public static final By DongYThongBao = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    public static final By NhapGhiChu = By.xpath("//android.widget.EditText");
    public static final By ThemHinhAnh = By.xpath("//android.view.View[@content-desc=\"More photos\"]");
    public static final By ChonHinhAnh = By.xpath("//android.view.View[@content-desc=\"Select photo\"]");
    public static final By DongYYeuCau = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    public static final By ChonHinhAnhDaLuu = By.xpath("//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"]");
    public static final By LuuTienTrinh = By.xpath("//android.widget.Button[@content-desc=\"Update processing\"]");
    public static final By Dong = By.xpath("//android.widget.Button[@content-desc=\"Close\"]");
    public static final By HoanTat = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]");

}
