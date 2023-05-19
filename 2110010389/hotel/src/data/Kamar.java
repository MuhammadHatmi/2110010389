/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Kamar{
    
    private int Nokamar;
    private int Jeniskamar;
    private int Typekamar;
    private String Sttskamar;

    // Constructor
    public Kamar(int Nokamar, int Jeniskamar, int Typekamar, String Sttskamar) {
        this.Nokamar = Nokamar;
        this.Jeniskamar = Jeniskamar;
        this.Typekamar = Typekamar;
        this.Sttskamar = Sttskamar;
    }

    // Getter dan Setter
    public int getNokamar() {
        return Nokamar;
    }

    public void setNokamar(int Nokamar) {
        this.Nokamar = Nokamar;
    }

    public int getJeniskamar() {
        return Jeniskamar;
    }

    public void setJeniskamar(int jeniskamar) {
        this.Jeniskamar = Jeniskamar;
    }

    public int getTypekamar() {
        return Typekamar;
    }

    public void setTypekamar(int Typekamar) {
        this.Typekamar = Typekamar;
    }

    public String getSttskamar() {
        return Sttskamar;
    }

    public void setJamcheckout(String Sttskamar) {
        this.Sttskamar= Sttskamar;
    }
   
           

    // Method
    public void tampilkanInfoKamar() {
        System.out.println("No kamar : " + Nokamar);
        System.out.println("Jenis kamar : " + Jeniskamar);
        System.out.println("Type kamar : " + Typekamar);
        System.out.println("Stts kamar : " + Sttskamar);
    }
       
        
}
