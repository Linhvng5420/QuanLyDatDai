/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao_pattern.DAO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Dat;

/**
 *
 * @author NGUYỄN VĂN LINH 22211TT0127
 */
public class MuaControl {

    // sql
    Connection c = DAO.getConnection();
    PreparedStatement ps = null;
    Statement st = null;

    // Lưu ds đất và ds đất vừa mua
    ArrayList<Dat> dsDat = new ArrayList<>();
    ArrayList<Dat> dsDatDaMua = new ArrayList<>();

    // #2 lấy dữ liệu một đối tượng trong ds bằng index
    public Dat GetMuaByIndex(int index) {
        return dsDat.get(index);
    }

    public Dat GetDaDaMuaByIndex(int index) {
        return dsDatDaMua.get(index);
    }

    // Lấy dl từ databse và lưu vào ds
    public ArrayList<Dat> GetTableMua() throws SQLException {
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

            //không lấy dl của đất 'Da Ban'
            if ("Da Ban".equals(trangThai)) {
                continue;
            }

            //Thêm vào ds
            Dat muaModel = new Dat(maDat, tenDat, dienTich, giaDat, viTri, trangThai);
            dsDat.add(muaModel);
        }

        System.out.println("MuaControl: Đã Lấy Danh Sách.");
        return dsDat;
    }

    // Update CSDL (Sau Khi Mua/Huy Mua)
    public void UpdateCSDL(int maDat, String trangThai) throws SQLException {
        st = c.createStatement();

        //chạy lệnh
        String str = "UPDATE `datdai` SET trangThai = '" + trangThai + "' WHERE maDat = " + maDat + ";";
        st.execute(str);

        System.out.println("MuaControl: Đã Cập Nhật.");
    }

    // Lấy dl cho Table Đã Mua
    public ArrayList<Dat> GetTableDaMua() {
        System.out.println("MuaControl: Đã Lấy Danh Sách Giỏ Hàng.");
        return dsDatDaMua;
    }

    // Thêm đất vừa mua vào ds đã mua
    public void ThemDatDaMua(int maDat) {
        for (Dat item : dsDat) {
            if (item.getMaDat() == maDat) {
                dsDatDaMua.add(item);
            }
        }
        System.out.println("MuaControl: Đã Thêm Vào Giỏ Hàng.");
    }

    //Xoá đất khỏi ds đã mua
    public void XoaDatDaMua(int maDat) {

        for (Dat item : dsDatDaMua) {
            if (item.getMaDat() == maDat) {
                dsDatDaMua.remove(item);
                System.out.println("MuaControl: Đã Xoá Khỏi Giỏ Hàng.");
                return;
            }
        }
    }

}
