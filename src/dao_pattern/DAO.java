/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao_pattern;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYỄN VĂN LINH 22211TT0127
 *
 * Data Access Object (DAO) Hỗ trợ kết nối với CSDL
 *
 */
public class DAO {

    private static String DB_URL = "jdbc:mysql://localhost:/quanlydatdai";
    private static String USER_NAME = "root";
    private static String PASSWORD = "vertrigo";

    // Lấy kết nối
    public static Connection getConnection() {
        Connection c = null;
        try {
            c = (Connection) DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (SQLException ex) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(null, "Lỗi kết nối");
            System.out.println("DAO: !!Lỗi kết nối.\n");
        }

        System.out.println("DAO: Đã kết nối.\n");
        return c;
    }
}
