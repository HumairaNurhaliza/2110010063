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
public class pasien {
    
    //field global
    private int noRM; 
    private String nmPasien; 
    private String alamat; 
    private String jk; 
    private Date tglLahir; 
    private String agama; 
    private String pekerjaan; 
    private String noTelp;  
    private String jenisPas; 
    
    //constructor overload
    public pasien(int noRM, String nmPasien, String alamat, String jk, Date tglLahir, String agama, String pekerjaan, String noTelp, String jenisPas) {
        this.noRM = noRM;
        this.nmPasien = nmPasien;
        this.alamat = alamat;
        this.jk = jk;
        this.tglLahir = tglLahir;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.noTelp = noTelp;
        this.jenisPas = jenisPas;
    }
    
    public int getNoRM() {
        return noRM;
    }

    public void setNoRM(int noRM) {
        this.noRM = noRM;
    }
    
    public String getNmPasien() {
        return nmPasien;
    }

    public void setNmPasien(String nmPasien) {
        this.nmPasien = nmPasien;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
    
    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
    
    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
    
    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public String getJenisPas() {
        return jenisPas;
    }

    public void setJenisPas(String jenisPas) {
        this.jenisPas = jenisPas;
    }

    // Method overload
    public void tampilkanDataPasien() { 
       System.out.println("-------------------------");
       System.out.println("DATA PASIEN");
       System.out.println("-------------------------");
       System.out.println("No : "+getNoRM());
       System.out.println("Nama Pasien      : "+getNmPasien());
       System.out.println("Alamat Pasien    : "+getAlamat());
       System.out.println("Jenis Kelamin    : "+getJk());
       System.out.println("Tanggal Lahir    : "+getTglLahir());
       System.out.println("Agama            : "+getAgama());
       System.out.println("Pekerjaan        : "+getPekerjaan());
       System.out.println("Nomer Telp       : "+getNoTelp());
       System.out.println("Jenis Pasien     : "+getJenisPas());
       System.out.println("-------------------------");
    }
 
    public boolean isTglahir() {
        Date lahir = new Date();
        return tglLahir.before(lahir);
    }
    
}
