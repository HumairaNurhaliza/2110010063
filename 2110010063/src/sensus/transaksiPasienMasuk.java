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
public class transaksiPasienMasuk {
    
    //field global
    private int noReg; 
    private int noRM; 
    private Date tglMasuk; 
    private int kdDiag; 
    private int kdBang; 
    private String status;
    
    //constructor overload
    public transaksiPasienMasuk(int noReg, int noRM, Date tglMasuk, int kdDiag, int kdBang, String status) {
        this.noReg = noReg;
        this.noRM = noRM;
        this.tglMasuk = tglMasuk;
        this.kdDiag = kdDiag;
        this.kdBang = kdBang;
        this.status = status;
    }
    
    public int getNoReg() {
        return noReg;
    }

    public void setNoReg(int noReg) {
        this.noReg = noReg;
    }
    
    public int getNoRM() {
        return noRM;
    }

    public void setNoRM(int noRM) {
        this.noRM = noRM;
    }
    
    public Date getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(Date tglMasuk) {
        this.tglMasuk = tglMasuk;
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
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method overload
    public void tampilkanPasienMasuk() { 
       System.out.println("TRANSAKSI PASIEN MASUK");
       System.out.println("-------------------------");
       System.out.println("No Registrasi            : "+getNoReg());
       System.out.println("No Rekam Medis           : "+getNoRM());
       System.out.println("Tanggal dan Waktu Masuk  : "+getTglMasuk());
       System.out.println("Kode Diagnosa            : "+getKdDiag());
       System.out.println("Kode Bangsal             : "+getKdBang());
       System.out.println("Status Pasien            : "+getStatus());
       System.out.println("-------------------------");
    }
 
    public boolean isTglMasuk() {
        Date tanggalSekarang = new Date();
        return tglMasuk.before(tanggalSekarang);
    }
    
}
