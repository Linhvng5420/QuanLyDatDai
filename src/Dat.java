/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author NGUYỄN TẤN BIN
 */
public class Dat {
    private int maDat; 
    private int dienTich; 
    private String tenDat;
    private int giaDat;
    private String viTri;
    private String trangThai;

    public Dat() {
    }

    public Dat(int maDat, int dienTich, String tenDat, int giaDat, String viTri, String trangThai) {
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
