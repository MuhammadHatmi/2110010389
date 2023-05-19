/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


/**
 *
 * @author ACER
 */
public class Pemesanan{
    
    private int Nopesan;
    private int Nokamar;
    private String Tglpesan;
    private int Uangmuka ;

    // Constructor
    public Pemesanan(int Nopesan, int Nokamar, String Tglpesan, int Uangmuka) {
        this.Nopesan = Nopesan;
        this.Nokamar = Nokamar;
        this.Tglpesan = Tglpesan;
        this.Uangmuka= Uangmuka;
    }

    // Getter dan Setter
    public int getNopesan() {
        return Nopesan;
    }

    public void setNopesan(int pesan) {
        this.Nopesan = Nopesan;
    }

    public int getNokamar() {
        return Nokamar;
    }

    public void setNokamar(int Nokamar) {
        this.Nokamar= Nokamar;
    }

    public String Tglpesan() {
        return Tglpesan;
    }

    public void setTglpesan(String Tglpesan) {
        this.Tglpesan = Tglpesan;
    }

    public int Uangmuka() {
        return Uangmuka;
    }

    public void setUangmuka(int Uangmuka) {
        this.Uangmuka= Uangmuka;
    }
   
    // Method
    public void tampilkanInfoPemesanan() {
        System.out.println("No pesan : " + Nopesan);
        System.out.println("No kamar : " +  Nokamar);
        System.out.println("Tgl pesan : " + Tglpesan);
        System.out.println("Uangmuka : " + Uangmuka);
    }

    
}
