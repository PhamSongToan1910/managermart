/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managermart;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AccountDao {

    Scanner sc = new Scanner(System.in);

    public void addCustumer(String sdt, String name) {
        try {
            Connection con = new ConnectDataBase().getConnection();

            String sql = "insert into KhacHang (SDT, HoTen,point,ranked)" + "values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sdt);
            pst.setString(2, name);
            pst.setFloat(3, 0);
            pst.setInt(4, 1);

            pst.executeUpdate();
            System.out.println("Them thanh cong");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int SoHD() {
        int amount = 0;
        try {
            Connection con = new ConnectDataBase().getConnection();

            String sql = "select count(dbo.hoadon.sohd) from dbo.hoadon";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                amount = rs.getInt(1);
                return amount;
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return amount;
    }

    public void insertIntoHD(String sdt, Date date, int sohd, String manv, float cost) {
        try {
            Connection con = new ConnectDataBase().getConnection();

            String sql = "insert into HOADON (SOHD, NGHD,SDT,MANV,TRIGIA)" + "values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, sohd);
            pst.setDate(2, date);
            pst.setString(3, sdt);
            pst.setString(4, manv);
            pst.setFloat(5, cost);

            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public KhachHang searchCustomer(String a) throws SQLException, Exception {

        try {
            Connection con = new ConnectDataBase().getConnection();

            String sql = "select * from dbo.KHACHANG where KHACHANG.sdt = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, a);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                String sdt = rs.getString(1);
                String name = rs.getString(2);
                float money = rs.getFloat(3);
                int rank = rs.getInt(4);
               
                KhachHang khachhang = new KhachHang(sdt, name, money, rank);
                return khachhang;
                
            }
        } catch (Exception e) {
        }
        
        return null;
    }

}
