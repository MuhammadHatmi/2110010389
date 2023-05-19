/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


/**
 *
 * @author ACER
 */
public class Pemakaianfasilisa{
         
    private int Noreg;
    private String Kategori ;
    private String Fasilitas;
    private int Tarif;
    


    // Constructor
    public Pemakaianfasilisa (int Noreg, String Kategori, String Fasilitas, int Tarif){
        this.Noreg = Noreg ;
        this.Kategori = Kategori;
        this.Fasilitas = Fasilitas;
        this.Tarif= Tarif;
        
    }

    // Getter dan Setter
    public int getNoreg() {
        return Noreg;
    }

    public void setNoreg(int Noreg) {
        this.Noreg = Noreg;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Ketegori) {
        this.Kategori= Kategori;
    }

    public String getFasilitas() {
        return Fasilitas;
    }

    public void setFasilitas(String Fasilitass) {
        this.Fasilitas= Fasilitass;
    }

    public int getTarif() {
        return Tarif;
    }

    public void setTarif(int Tarif) {
        this.Tarif=Tarif;
    }
              

    // Method
    public void tampilkanInfoPemakaian() {
        System.out.println("No reg: " + Noreg);
        System.out.println("Kategori: " + Kategori);
        System.out.println("Fasilitas : " + Fasilitas);
        System.out.println("Tarif : " + Tarif);
        
    }
}
