/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensus;

/**
 *
 * @author Maira
 */
public class bangsal {
    
    //field global
    private int kdBang; 
    private String nmBang; 
    private String kelasBang; 
    private int jumlahBang; 
    
    //constructor overload
    public bangsal(int kdBang, String nmBang, String kelasBang, int jumlahBang) {
        this.kdBang = kdBang;
        this.nmBang = nmBang;
        this.kelasBang = kelasBang;
        this.jumlahBang = jumlahBang;
    }
    
    //set dan get
    public int getKdBang() {
        return kdBang;
    }

    public void setKdBang(int kdBang) {
        this.kdBang = kdBang;
    }
    
    public String getNmBang() {
        return nmBang;
    }

    public void setNmBang(String nmBang) {
        this.nmBang = nmBang;
    }
    
    public String getKelasBang() {
        return kelasBang;
    }

    public void setKelasBang(String kelasBang) {
        this.kelasBang = kelasBang;
    }
    
    public int getJumlahBang() {
        return jumlahBang;
    }

    public void setJumlahBang(int jumlahBang) {
        this.jumlahBang = jumlahBang;
    }

    // Method overload
    public void tampilkanInfoBangsal() { 
       System.out.println("INFORMASI BANGSAL");
       System.out.println("-------------------------");
       System.out.println("Kode Bangsal     : "+getKdBang());
       System.out.println("Nama Bangsal     : "+getNmBang());
       System.out.println("Kelas Bangsal    : "+getKelasBang());
       System.out.println("Jumlah Bangsal   : "+getJumlahBang());
       System.out.println("-------------------------");
    }
}
