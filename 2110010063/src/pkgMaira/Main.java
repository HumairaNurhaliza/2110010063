/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgMaira;
import sensus.*;
import java.util.Date;
/**
 *
 * @author Maira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menampilkan constructor overload pada setiap class
        
        //membuat object dari class pasien ( object : Pasien)
        pasien Pasien = new pasien(1, "Humaira Nurhaliza", "Banjarmasin", "perempuan", new Date(103,2 ,22), "islam", "mahasiswa", "089737850256", "masuk");
    
        //membuat object dari class bangsal ( object : Bangsal)
        bangsal Bangsal = new bangsal(35, "mawar", "1", 4);
    
        //membuat object dari class diagnosa ( object : Diagnosa)
        diagnosa Diagnosa = new diagnosa(53, "Maaag Kronis");

        //membuat object dari class transaksiPasienMasuk ( object : Masuk)
        transaksiPasienMasuk Masuk = new transaksiPasienMasuk(231, 65, new Date(123,4,21), 53, 35, "masuk");

        //membuat object dari class transaksiPasienPindah ( object : Pindah)
        transaksiPasienPindah Pindah = new transaksiPasienPindah(435, 65, new Date(123,4 ,20 ), 53, 35, "pindah"); 
       
        //membuat object dari class login ( object : Login)
        login Login = new login("maira22", "2203", "HumairaNurhaliza", "pasien");
        
        
        // Menampilkan data pada objek(method overload)      
        Pasien.tampilkanDataPasien();       
        Bangsal.tampilkanInfoBangsal();      
        Diagnosa.tampilkanInfoDiagnosa();    
        Masuk.tampilkanPasienMasuk();   
        Pindah.tampilkanPasienPindah();
        Login.tampilkanLogin();
    }
    
}
