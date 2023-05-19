 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;
import data.*;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class Hotel {

     public static void main(String[] args) {


        // Membuat objek dari class Admin
        Admin admin = new Admin(1,"anune","madrid52");

        // Membuat objek dari class Checkin
        Checkin checkin = new Checkin(1,3,1,"terkonfirmasi","02:00","50000","diterima");

        // Membuat objek dari class Checkout
        Checkout checkout = new Checkout(1, 1, 15, 12, "Lminap", 50000, 100000);

        // Membuat objek dari class Kamar
        Kamar kamar = new Kamar(340, 04, 04, "Kosong");

        // Membuat objek dari class Pemakaian fasilitas
        Pemakaianfasilisa pemakaianfasilisa = new Pemakaianfasilisa(1, "vip", "vip", 100000);

        // Membuat objek dari class Pemesanan
        Pemesanan pemesanan = new Pemesanan(01, 340, "14 september 2002", 50000);
 
        
        // Membuat objek dari class Tamu
        Tamu tamu = new Tamu(340," Hatmi", "Pengangguran", "Tanjung jaro");
        
        // Menampilkan informasi objek
        admin.tampilkanInfoAdmin();
        checkin.tampilkanInfoCheckin();
        checkout.tampilkanInfoCheckout();
        kamar.tampilkanInfoKamar();
        pemakaianfasilisa.tampilkanInfoPemakaian();
        pemesanan.tampilkanInfoPemesanan();
        tamu.tampilkanInfoTamu();
    }
    
}
