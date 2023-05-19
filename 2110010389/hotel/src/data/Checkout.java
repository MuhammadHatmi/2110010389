/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Checkout {
    
    private int Notacheckout;
    private int Noreg;
    private int Tglcheckout;
    private int Jamcheckout;
    private String Lminap;
    private int Uangmuka;
    private int Totalbayar;
    

    // Constructor
    public Checkout(int Notacheckout, int Noreg, int Tglcheckout, int Jamcheckout
    ,String Lminap,int Uangmuka,int Totalbayar) {
       this.Notacheckout=Notacheckout;
        this.Noreg = Noreg;
        this.Tglcheckout = Tglcheckout;
        this.Jamcheckout = Jamcheckout;
        this. Lminap= Lminap;
        this.Uangmuka = Uangmuka;
        this.Totalbayar= Totalbayar;
    }

    // Getter dan Setter
    public int getNotachekout() {
        return Notacheckout;
    }

    public void setNotacheckout(int Notcheckout) {
        this.Notacheckout = Notacheckout;
    }

    public int getNoreg() {
        return Noreg;
    }

    public void setNoreg(int Noreg) {
        this.Noreg =Noreg ;
    }

    public int getTglcheckout() {
        return Tglcheckout;
    }

    public void setTglcheckout(int Tglcheckout) {
        this.Tglcheckout = Tglcheckout;
    }

    public int getJamcheckout() {
        return Jamcheckout;
    }

    public void setJamcheckout(int Jamcheckout) {
        this.Jamcheckout = Jamcheckout;
    }
     public String getLminap() {
        return Lminap;
    }

    public void setLminap(String Lminap) {
        this.Lminap = Lminap;
    }
      public int Uangmuka() {
        return Uangmuka;
    }

    public void setUangmuka(int Uangmuka) {
        this.Uangmuka = Uangmuka;
    }
      public int Totalbayar() {
        return Totalbayar;
    }

    public void setTotal(int Totalbayar) {
        this.Totalbayar = Totalbayar;
    }
           

    // Method
    public void tampilkanInfoCheckout() {
        System.out.println("Notacheckout : " + Notacheckout);
        System.out.println("No reg : " + Noreg);
        System.out.println("Tgl checkout : " + Tglcheckout);
        System.out.println("Jam checkout : " + Jamcheckout);
        System.out.println("Lm inap : " + Lminap);
        System.out.println("Uang muka : " + Uangmuka);
        System.out.println("Total bayar : " + Totalbayar);
    }
    
}
