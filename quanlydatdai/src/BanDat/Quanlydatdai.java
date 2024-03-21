/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BanDat;

/**
 *
 * @author Admin
 */
public class Quanlydatdai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            DSBanDat bd = new DSBanDat();
       bd.ThemDL(new BanDat(1,100,"dat nong nghiep",40000,"mat tien" , "chinh chu"));
       bd.XoaDL(new BanDat(1,100,"dat nong nghiep",40000,"mat tien" , "chinh chu"));
       bd.ThemDL(new BanDat(3,1020,"dat tho cu",4000000,"mat tien" , "chinh chu"));
       bd.ThemDL(new BanDat(4,3200,"dat nong nghiep",410000,"trung tam " , "chinh chu"));
       bd.DocDL();
       System.out.println(bd.HienthiDS());
    }
    
}
