/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensus;

/**
 *
 * @author Maira
 */
public class diagnosa {
    
    //field global
    private int kdDiag; 
    private String nmDiag; 
    
    //constructor overload
    public diagnosa(int kdDiag, String nmDiag) {
        this.kdDiag = kdDiag;
        this.nmDiag = nmDiag;
    }
    
    //set and get
    public int getKdDiag() {
        return kdDiag;
    }

    public void setKdDiag(int kdDiag) {
        this.kdDiag = kdDiag;
    }
    
    public String getNmDiag() {
        return nmDiag;
    }

    public void setNmDiag(String nmDiag) {
        this.nmDiag = nmDiag;
    }

    // Method overload
    public void tampilkanInfoDiagnosa() { 
       System.out.println("INFORMASI DIAGNOSA");
       System.out.println("-------------------------");
       System.out.println("Kode Diagnoga : "+getKdDiag());
       System.out.println("Nama Diagnoga : "+getNmDiag());
       System.out.println("-------------------------");
    }
    
}
