/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao_pattern;

import java.sql.SQLException;
import view.FrBan;
import view.FrHome;
import view.FrLogin;
import view.FrMua;
import view.FrQuanTri;

/**
 *
 * @author NGUYỄN VĂN LINH 22211TT0127
 *
 * Cài đặt (view)Form đầu tiên được chạy
 */
public class Pattern_Main {
    
    public static void main(String[] args) throws SQLException {
        new FrLogin().setVisible(true);
//        new FrHome().setVisible(true);
//        new FrBan().setVisible(true);
//        new FrMua().setVisible(true);
//        new FrQuanTri().setVisible(true);
    }
}
