/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 *
 * Kết nối CSDL
 *
 */
public class DAO {

    private static String DB_URL = "jdbc:mysql://localhost:/quanlydatdai";
    private static String USER_NAME = "root";
    private static String PASSWORD = "vertrigo";

    public static Connection getConnection() {
        Connection c = null;
        try {
            c = (Connection) DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (SQLException ex) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(null, "Lỗi kết nối");
        }
        return c;
    }
}
