/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydatdai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public final class DSquanlydatdai {
        
     private ArrayList<giaodien> data = new ArrayList<>();
    Connection connection= null;

    public DSquanlydatdai() {
        getConnect();
    }

    public ArrayList<giaodien> getData() {
        return data;
    }

    public void setData(ArrayList<giaodien> data) {
        this.data = data;
    }
    public void ThemDS(giaodien QL){
        data.add(QL);
    }
    public String HienthiDS(){
        String msg="";
        for(giaodien quanlydatdai : data){
            msg+=quanlydatdai+"\n";
        }
        return msg;
    }
    public void getConnect(){
         String connectionString = "jdbc:sqlserver://localhost:1433;" 
            + "databaseName=QuanLiDat;user=sa;password=sa;";
    Connection conn;
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionString);
            
            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
    }
   
    public void ThemDL(giaodien QL){
        String sql = "insert into quanlydatdai values(?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,QL.getMalodat());
            statement.setInt(2,QL.getGiaca());
            statement.setInt(3,QL.getDientich() );
            statement.setString(4,QL.getPhaply());
            statement.setString(5,QL.getGiayto());
            statement.setString(6,QL.getVitri());
            int status = statement.executeUpdate();
            if (status>0) {
                System.out.println("Them thanh cong"+status+"mau tin");
                
            } else {
                System.out.println("them khong thanh cong"+status+"mau tin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(giaodien.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    public void XoaDL(giaodien QL){
        String sql ="delete from quanlydatdai where malodat=?";
        try {
          PreparedStatement statement = connection.prepareStatement(sql);
          statement.setInt(1,QL.getMalodat());
          int status = statement.executeUpdate();
            if (status>0) {
                System.out.println("Xoa thanh cong "+status+"mau tin");    
            } else {
                System.out.println("Xoa khong Thanh cong"+status+"mau tin");
            }
        } catch (SQLException ex) {
            System.out.println("Xoa du lieu loi"+ex);
        }
    }
    public void DocDL(){
        data.clear();
        String sql="select * from quanlydatdai";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                giaodien QL = new giaodien();
                QL.setDientich(resultSet.getInt("dientich"));
                QL.setGiaca(resultSet.getInt("giaca"));
                QL.setMalodat(resultSet.getInt("malodat"));
                QL.setGiayto(resultSet.getNString("giayto"));
                QL.setPhaply(resultSet.getNString("phaply"));
                QL.setVitri(resultSet.getNString("vitri"));
                data.add(QL);
            }
        } catch (SQLException ex) {
           Logger.getLogger(giaodien.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    public void SuaDL(giaodien QL){
        String sql = "update quanlydatdai set vitri=?, giaca=?, phaply=?, dientich=?, giayto=? where malodat=?";
         try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(6,QL.getMalodat());
            statement.setString(5,QL.getGiayto());
            statement.setInt(2,QL.getGiaca());
            statement.setInt(4,QL.getDientich() );
            statement.setString(1,QL.getVitri());
            statement.setString(3,QL.getPhaply());
            int status = statement.executeUpdate();
            if (status>0) {
                System.out.println("sua thanh cong"+status+"mau tin");
                
            } else {
                System.out.println("sua khong thanh cong"+status+"mau tin");
            }
        } catch (SQLException ex) {
             System.err.println("Sua du lieu loi "+ex);
        }
    }
}
