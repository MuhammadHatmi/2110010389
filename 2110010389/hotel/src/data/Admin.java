/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Admin {
    private int kodeadmin;
    private String Username;
    private String Password;
    

    // Constructor
    public Admin (int kodeadmin, String Username, String Password) {
        this.kodeadmin = kodeadmin;
        this.Username = Username;
        this.Password = Password;
      
    }

 

    // Getter dan Setter
    public int getkodeadmin() {
        return kodeadmin;
    }

    public void setkodeadmin(int kodeadmin) {
        this.kodeadmin= kodeadmin;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsernamae(String Username) {
        this.Username= Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    // Method
    public void tampilkanInfoAdmin() {
        System.out.println("Admin : " + kodeadmin );
        System.out.println("Username : " + Username);
        System.out.println("Password : " + Password);
       
    }
   
    
}
 