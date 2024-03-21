/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYỄN VĂN LINH 22211TT0127
 * 
 * Lưu dữ liệu của đối tượng lấy từ csdl về.
 * 
 */
public class Dat {
    
    private int maDat;
    private String tenDat;
    private int dienTich;
    private int giaDat;
    private String viTri;
    private String trangThai;

    public Dat() {
    }

    public Dat(int maDat, String tenDat, int dienTich, int giaDat, String viTri, String trangThai) {
        this.maDat = maDat;
        this.tenDat = tenDat;
        this.dienTich = dienTich;
        this.giaDat = giaDat;
        this.viTri = viTri;
        this.trangThai = trangThai;
    }
    
    public Dat(int maDat, String tenDat, int dienTich, int giaDat, String viTri) {
        this.maDat = maDat;
        this.tenDat = tenDat;
        this.dienTich = dienTich;
        this.giaDat = giaDat;
        this.viTri = viTri;
    }
    
    public Dat(Dat dat)
    {
        this.maDat=dat.maDat;
        this.tenDat=dat.tenDat;
        this.dienTich=dat.dienTich;
        this.giaDat=dat.giaDat;
        this.viTri=dat.viTri;
        this.trangThai=dat.trangThai;
    }
    
    public int getMaDat() {
        return maDat;
    }

    public void setMaDat(int maDat) {
        this.maDat = maDat;
    }

    public String getTenDat() {
        return tenDat;
    }

    public void setTenDat(String tenDat) {
        this.tenDat = tenDat;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getGiaDat() {
        return giaDat;
    }

    public void setGiaDat(int giaDat) {
        this.giaDat = giaDat;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }       
}
