/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

import quanlydatdai.giaodien;
import view.Home;
import view.Login;
import view.Mua;

/**
 *
 */
public class Pattern {

    public static giaodien giaoDienChinh = new giaodien();
    public static quanlydatdai.clsConnectDB connection = new quanlydatdai.clsConnectDB();

    public static void main(String[] args) {
        Login login = new Login();

        login.show();
    }
}
