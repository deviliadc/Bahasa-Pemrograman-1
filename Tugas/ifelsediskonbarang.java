package Tugas;
import java.util.Scanner;
public class ifelsediskonbarang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int barang, harga, pembelian, bayar = 0, uang_diterima, kembalian;
        double diskon, diskon1, diskon2, diskon3, diskon4, diskon5;
        //input
        System.out.println("~~~~~~~Toko Luar Biasa~~~~~~");
        System.out.println("============================");
        System.out.print("Harga           : ");
        harga = s.nextInt();
        System.out.print("Jumlah Barang   : ");
        barang = s.nextInt();
        
        pembelian = harga * barang;
        System.out.println("Total Harga     : "+pembelian);
        System.out.println("============================");
        
        //proses
        if (pembelian < 100000){
            System.out.println("Anda Mendapatkan Diskon 0%");
            diskon = pembelian * 0;
            bayar = (int) (pembelian - diskon);
        }
        else if (pembelian >= 100001 && pembelian <= 200000){
            System.out.println("Anda Mendapatkan Diskon 5%");
            diskon = pembelian * 0.05;
            bayar = (int) (pembelian - diskon );
        }
        else if (pembelian >= 200001 && pembelian <= 300000){
            System.out.println("Anda Mendapatkan Diskon 10%");
            diskon = pembelian * 0.1;
            bayar = (int) (pembelian - diskon );
        }
        else if (pembelian >= 300001 && pembelian <= 400000){
            System.out.println("Anda Mendapatkan Diskon 15%");
            diskon = pembelian * 0.15;
            bayar = (int) (pembelian - diskon );
        }
        else if (pembelian >= 400001 && pembelian <= 500000){
            System.out.println("Anda Mendapatkan Diskon 20%");
            diskon = pembelian * 0.2;
            bayar = (int) (pembelian - diskon );
        }
        else if (pembelian >500000){
            System.out.println("Anda Mendapatkan Diskon 25%");
            diskon = pembelian * 0.25;
            bayar = (int) (pembelian - diskon );
        }
        
        //output
        System.out.println("============================");
        System.out.println("Total Bayar     : "+bayar);
        System.out.print("Uang Diterima   : ");
        uang_diterima = s.nextInt();
        kembalian = (int) (uang_diterima - bayar);
        if (kembalian == 0){
            System.out.println("Uang Pas");
        }
        else {
            System.out.println("Kembalian       : "+kembalian);
        }
        
        System.out.println("~~~~~~~~Terima Kasih~~~~~~~~");
    }
    
}
