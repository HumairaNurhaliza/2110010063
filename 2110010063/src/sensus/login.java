/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensus;

/**
 *
 * @author Maira
 */
public class login {
    
    //field global
    private String username; 
    private String password; 
    private String nama; 
    private String level; 
    
    //constructor overload
    public login(String username, String password, String nama, String level) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.level = level;
    }
    
    //set and get
    public String getUsername() {
        return username;
    }

    public void setKdUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //set and get
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // Method overload
    public void tampilkanLogin() { 
       System.out.println("DAFTAR USER LOGIN");
       System.out.println("-------------------------");
       System.out.println("Username     : "+getUsername());
       System.out.println("Password     : "+getPassword());
       System.out.println("Nama         : "+getNama());
       System.out.println("Level        : "+getLevel());
       System.out.println("-------------------------");
    }
    
}
