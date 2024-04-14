package helper;

import org.openqa.selenium.By;

public class locator {
    public static final By SkipButton = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    public static final By DienSDT = By.xpath("//android.widget.EditText");
    public static final By Next = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    public static final By TaoYeuCau = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public static final By NoiDungYeuCau = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    public static final By GhiChu = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    public static final By ThemHinhAnh = By.xpath("//android.view.View[@content-desc=\"Add image\"]");
    public static final By ChonThemHinhAnh = By.xpath("//android.view.View[@content-desc=\"Chose image\"]");
    public static final By ChapNhanQuyen = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static final By ChonHinhAnh = By.xpath("//android.widget.ImageView[@resource-id=\"com.android.documentsui:id/icon_thumb\"]");
    public static final By GuiYeuCau = By.xpath("//android.widget.Button[@content-desc=\"Create issue\"]");
    public static final By DongYeuCau = By.xpath("//android.widget.Button[@content-desc=\"Close\"]");
    public static final By LichSuYeuCau = By.xpath("//android.view.View[@content-desc=\"History\"]");

}
