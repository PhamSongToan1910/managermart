/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managermart;

/**
 *
 * @author admin
 */
public class KhachHang {
    private String SoDienThoai;
    private String name;
    private float point;
    private int Rank;

    public KhachHang() {
    }

    public KhachHang(String SoDienThoai, String name, float point, int Rank) {
        this.SoDienThoai = SoDienThoai;
        this.name = name;
        this.point = point;
        this.Rank = Rank;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int Rank) {
        this.Rank = Rank;
    }
    
}
