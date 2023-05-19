/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Tamu {
    
    
    private int Notamu;
    private String Namatamu;
    private String Pekerjaan;
    private String Alamat ;

    // Constructor
    public Tamu(int Nokamar, String Namatamu, String Pekerjaan, String Alamat) {
        this.Notamu = Notamu;
        this.Namatamu = Namatamu;
        this.Pekerjaan = Pekerjaan;
        this.Alamat= Alamat;
    }

    // Getter dan Setter
    public int getNotamu() {
        return Notamu;
    }

    public void setNotamu(int Notamu) {
        this.Notamu = Notamu;
    }

    public String getNamatamu() {
        return Namatamu;
    }

    public void setNamatamu(String Namatamu) {
        this.Namatamu= Namatamu;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setpekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String Alamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat= Alamat;
    }
   
           

    // Method
    public void tampilkanInfoTamu() {
        System.out.println("No tamu : " + Notamu);
        System.out.println("Nama tamu : " + Namatamu);
        System.out.println("Pekerjaan : " + Pekerjaan);
        System.out.println("Alamat : " + Alamat);
    }
     
}
