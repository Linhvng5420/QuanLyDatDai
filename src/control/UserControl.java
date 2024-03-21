/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import dao_pattern.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dat;

/**
 *
 * @author NGUYỄN VĂN LINH 22211TT0127
 *
 * Cài đặt điều khiển Login
 *
 */
public class UserControl {

    //Kết nối SQL
    private Connection c = DAO.getConnection();
    //Truy vấn CSDL
    private PreparedStatement ps = null;
    Statement st = null;

    //Lưu lại ID (Phân biệt user và Admin)
    public static int getFlagID() {
        return flagID;
    }
    static int flagID;

    // Login Kiểm tra ID-Pass
    public boolean login(int id, String pass) {
        //Lấy kết quả cảu dữ liệu được truy vấn về
        ResultSet rs = null;

        int ID;
        String Pass;

        try {
            String str = "SELECT * FROM `user`;";
            ps = c.prepareStatement(str);
            rs = ps.executeQuery();

            //Duyệt từng dòng trong bảng SQL và kiểm tra
            //rs.get từng dòng từ trên xuống
            while (rs.next()) {
                //Lưu ID-Pass
                ID = rs.getInt("ID");
                Pass = rs.getString("Pass");

                //Kiểm Tra
                if (id == ID && pass.equals(Pass) == true) {
                    flagID = ID;
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("UserControl: !!Lỗi Login.\n");
        }

        System.out.println("UserControl: Login OK.\n");
        return false;
    }

    // Sign Up, kiểm tra xem id đăng ký có trùng
    public boolean KiemTraID(int id) {
        ResultSet rs = null;
        int ID;
        String Pass;

        try {
            String str = "SELECT `ID` FROM `user`;";
            ps = c.prepareStatement(str);
            rs = ps.executeQuery();

            //Duyệt từng dòng trong bảng SQL và kiểm tra
            //rs.get từng dòng từ trên xuống
            while (rs.next()) {
                //Lấy ID hiện có trong CSDL
                ID = rs.getInt("ID");

                //Kiểm Tra
                if (id == ID) {
                    flagID = ID;
                    return false;
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("UserControl: !!Lỗi Sign Up.\n");
        }

        System.out.println("UserControl: Sign Up OK.\n");
        return true;
    }

    // SIGN UP
    public boolean SignUp(int id, String pass) throws SQLException {
        String sql = "insert into user values(?,?)";

        ps = c.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, pass);

        int status = ps.executeUpdate();
        if (status > 0) {
            System.out.println("UserControl: Đăng Ký Thành Công." + status + " mau tin");
            return true;

        } else {
            System.out.println("UserControl: Đăng Ký Thất Bại!" + status + " mau tin");
            return false;
        }
    }
}
