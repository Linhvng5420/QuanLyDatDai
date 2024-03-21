/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydatdai;

/**
 *
 * @author User
 */
   public class quanlydatdai_1 {
    private int malodat;
    private int giaca;
    private int dientich;
    private String phaply;
    private String giayto;
    private String vitri;

    @Override
    public String toString() {
        return "quanlydatdai{" + "malodat=" + malodat + ", giaca=" + giaca + ", dientich=" + dientich + ", phaply=" + phaply + ", giayto=" + giayto + ", vitri=" + vitri + '}';
    }

    public int getMalodat() {
        return malodat;
    }

    public void setMalodat(int malodat) {
        this.malodat = malodat;
    }

    public int getGiaca() {
        return giaca;
    }

    public void setGiaca(int giaca) {
        this.giaca = giaca;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public String getPhaply() {
        return phaply;
    }

    public void setPhaply(String phaply) {
        this.phaply = phaply;
    }

    public String getGiayto() {
        return giayto;
    }

    public void setGiayto(String giayto) {
        this.giayto = giayto;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public quanlydatdai_1() {
        
    }

    public quanlydatdai_1(int malodat, int giaca, int dientich, String phaply, String giayto, String vitri) {
        this.malodat = malodat;
        this.giaca = giaca;
        this.dientich = dientich;
        this.phaply = phaply;
        this.giayto = giayto;
        this.vitri = vitri;
    }

}
