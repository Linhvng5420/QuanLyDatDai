/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao_pattern.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dat;

/**
 *
 * @author Trương Huy Cận
 */
public final class QuanTriControl {

    // sql
    Connection c = DAO.getConnection();
    PreparedStatement ps = null;
    Statement st = null;

    // #1
    private ArrayList<Dat> dsDat = new ArrayList<>();
    Connection connection = null;

    // #2 lấy dữ liệu một đối tượng trong ds bằng index
    public Dat GetDatByIndex(int index) {
        return dsDat.get(index);
    }

    public ArrayList<Dat> getDsDat() {
        return dsDat;
    }

    public void setDsDat(ArrayList<Dat> dsDat) {
        this.dsDat = dsDat;
    }

    public void ThemDS(Dat dat) {
        dsDat.add(dat);
    }

    // Lấy dl từ databse và lưu vào ds
    public ArrayList<Dat> GetTable() throws SQLException {
        ResultSet rs;
        dsDat = new ArrayList<>();

        ps = c.prepareStatement("SELECT * FROM `datdai` ORDER BY `maDat` ASC");
        rs = ps.executeQuery();

        while (rs.next()) {
            int maDat = rs.getInt("maDat");
            String tenDat = rs.getString("tenDat");
            int dienTich = rs.getInt("dienTich");
            int giaDat = rs.getInt("giaDat");
            String viTri = rs.getString("viTri");
            String trangThai = rs.getString("trangThai");

            //Thêm vào ds
            Dat muaModel = new Dat(maDat, tenDat, dienTich, giaDat, viTri, trangThai);
            dsDat.add(muaModel);
        }

        System.out.println("QuanTriControl: Đã Lấy Danh Sách.");
        return dsDat;
    }

    //Lấy tất cả mã đất hiện có trên CSDL
    public boolean KTMaDat(int maDat) {

        try {
            ResultSet rs;
            ps = c.prepareStatement("SELECT `maDat` FROM `datdai`");
            rs = ps.executeQuery();

            while (rs.next()) {
                if (maDat == rs.getInt("maDat")) {
                    return false;
                }
            }
            System.out.println("QuanTriControl: Kiểm Tra Mã Đất OK.");
            return true;
        } catch (SQLException e) {
            System.out.println("QuanTriControl: !! Lỗi Kiểm Tra Mã Đất.");
            return false;
        }
    }

    // Thêm đất vào CSDL
    public boolean ThemDat(Dat dat) {

        String code = "insert into datdai values(?,?,?,?,?,?)";
        try {

            //Kiểm tra xem mã đất có bị tồn tại
            if (KTMaDat(dat.getMaDat()) == false) {
                return false;
            }

            ps = c.prepareStatement(code);
            ps.setInt(1, dat.getMaDat());
            ps.setString(2, dat.getTenDat());
            ps.setInt(3, dat.getDienTich());
            ps.setInt(4, dat.getGiaDat());
            ps.setString(5, dat.getViTri());
            ps.setString(6, dat.getTrangThai());

            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("QuanTriControl: Them thanh cong" + status + "mau tin");
                return true;
            } else {
                System.out.println("QuanTriControl: !!them khong thanh cong" + status + "mau tin");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dat.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuanTriControl: !! Lỗi Thêm Đất Vào CSDL.");
            return false;
        }
    }

    // Xoá Đất Khỏi CSDL
    public Boolean XoaDat(int maDat) {
        String sql = "delete from datdai where maDat=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(1, maDat);
            
            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("QuanTriControl: Xoa thanh cong " + status + "mau tin");
                return true;
            } else {
                System.out.println("QuanTriControl: !!Xoa khong Thanh cong" + status + "mau tin");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("QuanTriControl: !!Lỗi Xoá Đất" + ex);
            return false;
        }
    }

//    public boolean XoaDat(int maDat) {
//
//        String sql = "delete from datdai where madat=?";
//        try {
//            ps = c.prepareStatement(sql);
//            ps.setInt(1, maDat);
//            int status = ps.executeUpdate();
//
//            if (status > 0) {
//                System.out.println("Xoa thanh cong " + status + "mau tin");
//                return true;
//            } else {
//                System.out.println("Xoa khong Thanh cong" + status + "mau tin");
//                return false;
//            }
//        } catch (SQLException ex) {
//            return false;
//        }
//    }
    // Sửa dữ liệu của Đất
    public void SuaDat(Dat newDat) {

        // #2 sửa dl ở trên DataBase
        String sql = "update datdai set dienTich=?, tenDat=?, giaDat=? , viTri=?, trangThai=? where maDat=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(6, newDat.getMaDat());
            ps.setInt(1, newDat.getDienTich());
            ps.setString(2, newDat.getTenDat());
            ps.setInt(3, newDat.getGiaDat());
            ps.setString(4, newDat.getViTri());
            ps.setString(5, newDat.getTrangThai());

            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("QuanTriControl: sua thanh cong" + status + " mau tin");

            } else {
                System.out.println("QuanTriControl: !!sua khong thanh cong" + status + " mau tin");
            }
        } catch (SQLException ex) {
            System.err.println("QuanTriControl: !!Sua du lieu loi " + ex);
        }
    }
}
