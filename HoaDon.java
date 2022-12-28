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
public class HoaDon {
    private String SDT;
    private Date date;
    int SoHD;
    private String MaNV;
    private float cost;

    public HoaDon() {
    }

    public HoaDon(int SoHD) {
        this.SoHD = SoHD;
    }

    
    public HoaDon(String SDT, Date date, int SoHD, String MaNV, float cost) {
        this.SDT = SDT;
        this.date = date;
        this.SoHD = SoHD;
        this.MaNV = MaNV;
        this.cost = cost;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSoHD() {
        return SoHD;
    }

    public void setSoHD(int SoHD) {
        this.SoHD = SoHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
}
