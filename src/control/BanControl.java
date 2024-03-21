/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao_pattern.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dat;

/**
 *
 * @author NGUYỄN TẤN BIN
 */
public class BanControl {

    // SQL
    Connection c = DAO.getConnection();
    PreparedStatement ps = null;
    Statement st = null;

    //
    private ArrayList<Dat> dsDat = new ArrayList<>();

    public ArrayList<Dat> getDsDat() {
        return dsDat;
    }

    public void setDsDat(ArrayList<Dat> dsDat) {
        this.dsDat = dsDat;
    }

    public void ThemDS(Dat bd) {
        dsDat.add(bd);
    }

    public String HienthiDS() {
        String msg = "";
        for (Dat bandatt : dsDat) {
            msg += bandatt + "\n";
        }
        return msg;
    }

    public boolean ThemDL(Dat bd) {
        String sql = "insert into datdai values(?,?,?,?,?,?)";
        try {
            dsDat.add(bd);

            ps = c.prepareStatement(sql);
            ps.setInt(1, bd.getMaDat());
            ps.setInt(3, bd.getDienTich());
            ps.setString(2, bd.getTenDat());
            ps.setInt(4, bd.getGiaDat());
            ps.setString(5, bd.getViTri());
            ps.setString(6, bd.getTrangThai());
            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Them thanh cong" + status + " mau tin");
                return true;

            } else {
                System.out.println("them khong thanh cong" + status + " mau tin");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean HuyBan(int maDat) {
        String sql = "delete from datdai where madat=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(1, maDat);
            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Xoa thanh cong " + status + "mau tin");
                return true;
            } else {
                System.out.println("Xoa khong Thanh cong" + status + "mau tin");
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean XoaDatdaBan(int maDat) {
        for (Dat item : dsDat) {
            if (item.getMaDat() == maDat) {
                dsDat.remove(item);
                return true;
            }
        }
        return false;
    }

    // #2 lấy dữ liệu một đối tượng trong ds bằng index
    public Dat GetBanByIndex(int index) {
        return dsDat.get(index);
    }

    public void SuaDatDaBan(Dat newBD) {

        // #1 sửa dữ liệu đât ở ds Đất Offline
        for (int i = 0; i < dsDat.size(); i++) {
            if (dsDat.get(i).getMaDat() == newBD.getMaDat()) {

                dsDat.get(i).setTenDat(newBD.getTenDat());
                dsDat.get(i).setDienTich(newBD.getDienTich());
                dsDat.get(i).setGiaDat(newBD.getGiaDat());
                dsDat.get(i).setViTri(newBD.getViTri());
            }
        }

        // #2 sửa dl ở trên DataBase
        String sql = "update datdai set dienTich=?, tenDat=?, giaDat=? , viTri=? where maDat=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(5, newBD.getMaDat());
            ps.setInt(1, newBD.getDienTich());
            ps.setString(2, newBD.getTenDat());
            ps.setInt(3, newBD.getGiaDat());
            ps.setString(4, newBD.getViTri());

            int status = ps.executeUpdate();
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
