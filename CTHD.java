/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managermart;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class CTHD extends HoaDon{
    private String MaMatHang;
    private int amount;

    public CTHD() {
    }

    public CTHD(int SoHD, String MaMatHang, int amount) {
        super(SoHD);
        this.MaMatHang = MaMatHang;
        this.amount = amount;
    }

    @Override
    public int getSoHD() {
        return SoHD;
    }

    @Override
    public void setSoHD(int SoHD) {
        this.SoHD = SoHD;
    }

    public String getMaMatHang() {
        return MaMatHang;
    }

    
    public void setMaMatHang(String MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
