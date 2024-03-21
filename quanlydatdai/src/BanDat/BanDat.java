/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BanDat;

/**
 *
 * @author Admin
 */
public class BanDat {
  private int maDat; 
    private int dienTich; 
    private String tenDat;
    private int giaDat;
    private String viTri;
    private String trangThai;

    public BanDat() {
    }

    public BanDat(int maDat, int dienTich, String tenDat, int giaDat, String viTri, String trangThai) {
        this.maDat = maDat;
        this.dienTich = dienTich;
        this.tenDat = tenDat;
        this.giaDat = giaDat;
        this.viTri = viTri;
        this.trangThai = trangThai;
    }

    public int getMaDat() {
        return maDat;
    }

    public void setMaDat(int maDat) {
        this.maDat = maDat;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getTenDat() {
        return tenDat;
    }

    public void setTenDat(String tenDat) {
        this.tenDat = tenDat;
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

    @Override
    public String toString() {
        return "BanDatt{" + "maDat=" + maDat + ", dienTich=" + dienTich + ", tenDat=" + tenDat + ", giaDat=" + giaDat + ", viTri=" + viTri + ", trangThai=" + trangThai + '}';
    }

}
