/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensus;

import java.util.Date;

/**
 *
 * @author Maira
 */
public class transaksiPasienPindah {
    
    //field global
    private int noRegP; 
    private int noRM; 
    private Date tglPindah; 
    private int kdDiag; 
    private int kdBang; 
    private String statusP;
    
    //constructor overload
    public transaksiPasienPindah(int noRegP, int noRM, Date tglPindah, int kdDiag, int kdBang, String statusP) {
        this.noRegP = noRegP;
        this.noRM = noRM;
        this.tglPindah = tglPindah;
        this.kdDiag = kdDiag;
        this.kdBang = kdBang;
        this.statusP = statusP;
    }
    
    public int getNoRegP() {
        return noRegP;
    }

    public void setNoRegP(int noRegP) {
        this.noRegP = noRegP;
    }
    
    public int getNoRM() {
        return noRM;
    }

    public void setNoRM(int noRM) {
        this.noRM = noRM;
    }
    
    public Date getTglPindah() {
        return tglPindah;
    }

    public void setTglPindah(Date tglPindah) {
        this.tglPindah = tglPindah;
    }
    
    public int getKdDiag() {
        return kdDiag;
    }

    public void setKdDiag(int kdDiag) {
        this.kdDiag = kdDiag;
    }
    
    public int getKdBang() {
        return kdBang;
    }

    public void setKdBang(int kdBang) {
        this.kdBang = kdBang;
    }
    
    public String getStatusP() {
        return statusP;
    }

    public void setStatusP(String statusP) {
        this.statusP = statusP;
    }

    // Method overload
    public void tampilkanPasienPindah() { 
       System.out.println("TRANSAKSI PASIEN PINDAH");
       System.out.println("-------------------------");
       System.out.println("No Registrasi Pindah     : "+getNoRegP());
       System.out.println("No Rekam Medis           : "+getNoRM());
       System.out.println("Tanggal dan Waktu Pindah : "+getTglPindah());
       System.out.println("Kode Diagnosa            : "+getKdDiag());
       System.out.println("Kode Bangsal             : "+getKdBang());
       System.out.println("Status Pasien Pindah     : "+getStatusP());
       System.out.println("-------------------------");
    }
 
    public boolean isTglPindah() {
        Date tanggalSekarang = new Date();
        return tglPindah.before(tanggalSekarang);
    }
    
}
