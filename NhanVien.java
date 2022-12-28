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
public class NhanVien {
    private String MaNV;
    private String password;
    private String name;
    private String SDT;
    private String position;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String password, String position) {
        this.MaNV = MaNV;
        this.password = password;
        this.position = position;
    }

    
    public NhanVien(String MaNV, String password, String name, String SDT, String position) {
        this.MaNV = MaNV;
        this.password = password;
        this.name = name;
        this.SDT = SDT;
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
