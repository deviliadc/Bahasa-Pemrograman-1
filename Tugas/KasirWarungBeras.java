package Tugas;
import java.util.Scanner;
public class KasirWarungBeras {
    public static void main(String[]rgs){
        Scanner sc    = new Scanner(System.in);

        int harga_beras_per_kg, kg_beras_yang_dibeli, harga_awal, uang_diterima, kembalian;
        double total_harga, diskon;
        
        System.out.println("**Warung Beras**");
        
        //input
        //Masukkan Harga Beras
        System.out.print("Harga Beras per Kg      : Rp ");
        harga_beras_per_kg = sc.nextInt();
        //Jumlah Beras Yang Dibeli dalam Kg
        System.out.print("Beras Yang Dibeli (kg)  : ");
        kg_beras_yang_dibeli = sc.nextInt();

        //proses
        harga_awal = (harga_beras_per_kg * kg_beras_yang_dibeli);
        diskon = (harga_awal* 0.05);
        total_harga = (harga_awal - diskon);
        
        //output
        //Total Harga Sebelum Diskon
        System.out.println("Harga                   : Rp "+harga_awal);
        //Total Harga Setelah Diskon
        System.out.println("Total Harga             : Rp "+total_harga);
        //Jumlah Uang Diterima
        System.out.print("Uang Diterima           : Rp ");
        uang_diterima = sc.nextInt();
        //Kembalian
        kembalian = (int) (uang_diterima - total_harga);
        System.out.println("Kembalian               : Rp "+kembalian);
        
        System.out.println("Terima Kasih Telah Berbelanja di Toko Kami");
        
    }
}
