/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DAO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MuaModel;

/**
 *
 * @author HP
 */
public class MuaControl {

    // #1
    Connection c = DAO.getConnection();
    PreparedStatement ps = null;
    Statement st = null;
    ArrayList<MuaModel> muaModels = new ArrayList<>();
    ArrayList<MuaModel> daMuaModels = new ArrayList<>();

    public MuaModel GetMuaByIndex(int index) {
        return muaModels.get(index);
    }

    public MuaModel GetDaMuaByIndex(int index) {
        return daMuaModels.get(index);
    }

    // Lấy dl cho Table Mua
    public ArrayList<MuaModel> GetTableMua() throws SQLException {
        ResultSet rs;
        muaModels = new ArrayList<>();

        ps = c.prepareStatement("SELECT * FROM `datdai`");
        rs = ps.executeQuery();

        while (rs.next()) {
            int maDat = rs.getInt("maDat");
            String tenDat = rs.getString("tenDat");
            int dienTich = rs.getInt("dienTich");
            int giaDat = rs.getInt("giaDat");
            String viTri = rs.getString("viTri");
            String trangThai = rs.getString("trangThai");

            //
            if ("Da Ban".equals(trangThai)) {
                continue;
            }

            //Tạo obj, thêm vào ds
            MuaModel muaModel = new MuaModel(maDat, tenDat, dienTich, giaDat, viTri, trangThai);
            muaModels.add(muaModel);
        }

        return muaModels;
    }

    // Update dl
    public boolean UpdateMua(int maDat, String trangThai) throws SQLException {
        st = c.createStatement();

        String str = "UPDATE `datdai` SET trangThai = '" + trangThai + "' WHERE maDat = " + maDat + ";";

        //chạy lệnh
        st.execute(str);

        return true;
    }

    // Thêm đất vừa mua vào ds đã mua
    public void ThemDaMua(int maDat) {
        for (MuaModel item : muaModels) {
            if (item.getMaDat() == maDat) {
                daMuaModels.add(item);
            }
        }
    }

    //Xoá đất khỏi ds đã mua
    public boolean XoaDaMua(int maDat) {
        for (MuaModel item : muaModels) {
            if (item.getMaDat() == maDat) {
                daMuaModels.remove(item);
                return true;
            }
        }
        return false;
    }

    // Lấy dl cho Table Đã Mua
    public ArrayList<MuaModel> GetTableDaMua() {
        return daMuaModels;
    }
}
