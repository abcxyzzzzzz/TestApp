package CSKH;

import core.NhanVien;

import java.util.concurrent.TimeUnit;

public class TaoTicket extends NhanVien {
    public static void TaoTicket() throws Exception {
        Thread.sleep(1000);
        driver.findElement(LocatorCSKH.PhongBan).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChonOPhongBan).click();
        driver.findElement(LocatorCSKH.ChonOPhongBan).sendKeys("PHÒNG KỸ THUẬT ĐIỆN ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChonPhongBan).click();
        //Chọn bộ phận
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.BoPhan).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChonOBoPhan).click();
        driver.findElement(LocatorCSKH.ChonOBoPhan).sendKeys("ĐIỆN ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChonBoPhan).click();
        //Dịch vụ
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DichVu).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChonDichVu).click();

        driver.findElement(LocatorCSKH.TaoTicket).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DongTaoTicket).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.ChuyenTiepTicket).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DongYTicket).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(LocatorCSKH.DongTaoTicket).click();



    }
}
