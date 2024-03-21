/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import dao.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 *
 * Cài đặt điều khiển Login
 *
 */
public class LoginControl {

    //Kết nối SQL
    private Connection c = DAO.getConnection();
    //Truy vấn CSDL
    private PreparedStatement preparedStatement = null;
    //Lấy kết quả cảu dữ liệu được truy vấn về
    private ResultSet resultSet = null;

    // Kiểm tra ID-Pass
    public boolean login(int id, String pass) {
        try {
            String str = "SELECT * FROM `user` WHERE `ID` = " + id + " AND `Pass` = " + pass +";";
            preparedStatement = c.prepareStatement(str);
            resultSet = preparedStatement.executeQuery();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
