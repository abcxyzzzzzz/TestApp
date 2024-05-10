package CSKH;

import org.openqa.selenium.By;

public class LocatorCSKH {
    //Chọn phòng ban
    public static final By PhongBan = By.xpath("//android.widget.ScrollView/android.view.View[5]");
    public static final By ChonOPhongBan = By.xpath("//android.widget.EditText");
    public static final By ChonPhongBan = By.xpath("//android.view.View[@content-desc=\"PHÒNG KỸ THUẬT ĐIỆN NƯỚC\"]");
    //Chọn bộ phận
    public static final By BoPhan = By.xpath("//android.widget.ScrollView/android.view.View[6]");
    public static final By ChonOBoPhan = By.xpath("//android.widget.EditText");
    public static final By ChonBoPhan = By.xpath("//android.view.View[@content-desc=\"BỘ PHẬN ĐIỆN\"]");
    //Chọn dịch vụ
    public static final By DichVu = By.xpath("//android.widget.ScrollView/android.view.View[7]");
    public static final By ChonDichVu = By.xpath("//android.view.View[@content-desc=\"Hệ thống điện bị sụt áp (Phối hợp với PCAPĐ xử lý)\"]");
    public static final By TaoTicket = By.xpath("//android.widget.Button[@content-desc=\"Create tickets\"]");
    public static final By DongTaoTicket = By.xpath("//android.widget.Button[@content-desc=\"Close\"]");
    public static final By ChuyenTiepTicket = By.xpath("//android.widget.Button[@content-desc=\"Forward\"]");
    public static final By DongYTicket = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]");


    //Duyệt yêu cầu
    public static final By DongYThongBao = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    public static final By DanhSachYeuCau = By.xpath("//android.widget.Button");
    public static final By TheTatCa = By.xpath("//android.view.View[@content-desc=\"All\n" +
            "Tab 2 of 2\"]");
    public static final By ChonLoaiTimKiem = By.xpath("//android.widget.EditText/android.widget.Button[2]/android.widget.Button");
    public static final By TheNoiDung = By.xpath("//android.view.View[@content-desc=\"Nội dung\"]");
    public static final By DuyetYeuCau = By.xpath("//android.widget.Button[@content-desc=\"Receive\"]");
    public static final By DongY = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]");
    public static final By Dong = By.xpath("//android.widget.Button[@content-desc=\"Close\"]");

}
