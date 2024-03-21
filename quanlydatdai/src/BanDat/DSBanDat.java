/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BanDat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class DSBanDat {
    private ArrayList<BanDat> data = new ArrayList<>();
    Connection connection = null;

    public DSBanDat() {
        getConnect();
    }

    public ArrayList<BanDat> getData() {
        return data;
    }

    public void setData(ArrayList<BanDat> data) {
        this.data = data;
    }

    public void ThemDS(BanDat bd) {
        data.add(bd);
    }

    public String HienthiDS() {
        String msg = "";
        for (BanDat bandatt : data) {
            msg += bandatt + "\n";
        }
        return msg;
    }

    public void getConnect() {
        String url = "jdbc:mysql://localhost:3306/quanlydatdai";
        String user = "root";
        String password = "vertrigo";
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("ket noi thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(BanDat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ThemDL(BanDat bd) {
        String sql = "insert into bandat values(?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bd.getMaDat());
            statement.setInt(2, bd.getDienTich());
            statement.setString(3, bd.getTenDat());
            statement.setInt(4, bd.getGiaDat());
            statement.setString(5, bd.getViTri());
            statement.setString(6, bd.getTrangThai());
            int status = statement.executeUpdate();
            if (status > 0) {
                System.out.println("Them thanh cong" + status + " mau tin");

            } else {
                System.out.println("them khong thanh cong" + status + " mau tin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanDat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void XoaDL(BanDat bd) {
        String sql = "delete from bandat where madat=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bd.getMaDat());
            int status = statement.executeUpdate();
            if (status > 0) {
                System.out.println("Xoa thanh cong " + status + "mau tin");
            } else {
                System.out.println("Xoa khong Thanh cong" + status + "mau tin");
            }
        } catch (SQLException ex) {
            System.out.println("Xoa du lieu loi" + ex);
        }
    }

    public void DocDL() {
        data.clear();
        String sql = "select * from bandat";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                BanDat bd = new BanDat();
                bd.setMaDat(resultSet.getInt("madat"));
                bd.setDienTich(resultSet.getInt("dientich"));
                bd.setTenDat(resultSet.getString("tendat"));
                bd.setGiaDat(resultSet.getInt("giadat"));
                bd.setViTri(resultSet.getString("vitri"));
                bd.setTrangThai(resultSet.getString("trangthai"));
                data.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanDat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SuaDL(BanDat bd) {
        String sql = "update bandat set dientich=?, tendat=?, giadat=? , vitri=?, trangthai = ? where madat=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(6, bd.getMaDat());
            statement.setInt(1, bd.getDienTich());
            statement.setString(2, bd.getTenDat());
            statement.setInt(3, bd.getGiaDat());
            statement.setString(4, bd.getViTri());
            statement.setString(5, bd.getTrangThai());
            int status = statement.executeUpdate();
            if (status > 0) {
                System.out.println("sua thanh cong" + status + " mau tin");

            } else {
                System.out.println("sua khong thanh cong" + status + " mau tin");
            }
        } catch (SQLException ex) {
            System.err.println("Sua du lieu loi " + ex);
        }
    }
}
