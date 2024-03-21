/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class MuaModel {
    
    //
    private int maDat;
    private String tenDat;
    private int dienTich;
    private int giaDat;
    private String viTri;
    private String trangThai;

    public MuaModel() {
    }

    public MuaModel(int maDat, String tenDat, int dienTich, int giaDat, String viTri, String trangThai) {
        this.maDat = maDat;
        this.tenDat = tenDat;
        this.dienTich = dienTich;
        this.giaDat = giaDat;
        this.viTri = viTri;
        this.trangThai = trangThai;
    }
    
    public MuaModel(int maDat, String tenDat, int dienTich, int giaDat, String viTri) {
        this.maDat = maDat;
        this.tenDat = tenDat;
        this.dienTich = dienTich;
        this.giaDat = giaDat;
        this.viTri = viTri;
    }
    
    public MuaModel(MuaModel muaModel)
    {
        this.maDat=muaModel.maDat;
        this.tenDat=muaModel.tenDat;
        this.dienTich=muaModel.dienTich;
        this.giaDat=muaModel.giaDat;
        this.viTri=muaModel.viTri;
        this.trangThai=muaModel.trangThai;
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
    
    //

    @Override
    public String toString() {
        return "MuaModel{" + "maDat=" + maDat + ", tenDat=" + tenDat + ", dienTich=" + dienTich + ", giaDat=" + giaDat + ", viTri=" + viTri + ", trangThai=" + trangThai + '}';
    }
    
    
}
