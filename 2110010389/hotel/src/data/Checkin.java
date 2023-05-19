/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


/**
 *
 * @author ACER
 */
public class Checkin {
    private int Noreg;
    private int Notamu;
    private int Nokamar;
    private String Tglcheckin;
    private String Jamcheckin;
    private String Uangmuka;
    private String Statusnota;
    

    // Constructor
    public Checkin(int reg, int tamu, int kamar, String checkin, String jcheckin, String muka,String nota) {
        this.Noreg = reg;
        this.Notamu = tamu;
        this.Nokamar = kamar;
        this.Tglcheckin = checkin;
        this. Jamcheckin= jcheckin;
        this.Uangmuka = muka;
        this.Statusnota = nota;
    }

    // Getter dan Setter
    public int getNoreg() {
        return Noreg;
    }

    public void setnoREG(int reg) {
        this.Noreg = reg;
    }

    public int getNokamar() {
        return Nokamar;
    }

    public void setNokamar(int kamar) {
        this.Nokamar =kamar ;
    }

    public String getTglcheckin() {
        return Tglcheckin;
    }

    public void setTglcheckin(String checkin) {
        this.Tglcheckin = checkin;
    }

    public void setJamcheckin(String jcheckin) {
        this.Jamcheckin = jcheckin;
    }
        
         public String getJamcheckin(String jcheckin) {
        return Jamcheckin;
    }

    public void setUangmuka(String muka) {
        this.Uangmuka = muka;
    }
        
         public String getUangmuka(String muka) {
        return Uangmuka=muka;
    }
    public void setStatusnota(String nota) {
        this.Statusnota = nota;
    }
         public String getStatusnota(String nota) {
        return Statusnota=nota;
    }
    
         
         

    // Method
    public void tampilkanInfoCheckin() {
        System.out.println("No reg : " + Noreg);
        System.out.println("No tamu : " + Notamu);
        System.out.println("no kamar : " + Nokamar);
        System.out.println("Tgl checkin : " + Tglcheckin);
        System.out.println("Jam checkin : " + Jamcheckin);
        System.out.println("Uang muka : " + Uangmuka);
        System.out.println("Status nota : " + Statusnota);
    }
}


