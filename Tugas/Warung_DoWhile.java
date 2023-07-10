package Tugas;
import java.util.Scanner;
public class Warung_DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilih, jumlah, uang, kembalian;
        int harga, harga1 = 0, harga2 = 0, harga3 = 0;
        int  total1 = 0, total2 = 0, total3 = 0;
        double diskon, hargaakhir = 0;
        
        System.out.println("========== Warung Sederhana =========");
        do{
            System.out.println("\n============Menu Makanan=============");
            System.out.println("1. Sate");
            System.out.println("2. Pecel");
            System.out.println("3. Penyetan");
            System.out.println("4. Selesai");
            System.out.print("Pilih Menu : ");
            pilih = s.nextInt();
            switch (pilih){
                case 1 :
                    System.out.println("---------Pilihan Menu Sate-----------");
                    System.out.println("1. Sate Ayam    = 1.500 per tusuk");
                    System.out.println("2. Sate Kambing = 3.000 per tusuk");
                    System.out.print("Pilihan = ");
                    pilih = s.nextInt();
                    if (pilih==1){
                        System.out.print("Jumlah Tusuk = ");
                        jumlah = s.nextInt();
                        harga1 = jumlah * 1500;
                        System.out.println("Harga = "+harga1);
                    }
                    else if(pilih==2){
                        System.out.print("Jumlah Tusuk = ");
                        jumlah = s.nextInt();
                        harga2 = jumlah * 3000;
                        System.out.println("Harga = "+harga2);
                    }
                    else{
                        System.out.println("=========Menu Tidak Tersedia=========");
                    }
                    total1 = harga1 + harga2;
                    break;
                    
                case 2:
                    System.out.println("----------Pilihan Menu Pecel---------");
                    System.out.println("1. Lauk Ayam    = 13.000 per porsi");
                    System.out.println("2. Lauk Empal   = 15.000 per porsi");
                    System.out.print("Pilihan = ");
                    pilih = s.nextInt();
                    if (pilih==1){
                        System.out.print("Jumlah Porsi = ");
                        jumlah = s.nextInt();
                        harga1 = jumlah * 13000;
                        System.out.println("Harga = "+harga1);
                    }
                    else if(pilih==2){
                        System.out.print("Jumlah Porsi = ");
                        jumlah = s.nextInt();
                        harga2 = jumlah * 15000;
                        System.out.println("Harga = "+harga2);
                    }
                    else{
                        System.out.println("=========Menu Tidak Tersedia=========");
                    }
                    total2 = harga1 + harga2;
                    break;
                    
                case 3 :
                    System.out.println("--------Pilihan Menu Penyetan--------");
                    System.out.println("1. Lauk Tahu/Tempe = 5.000 per porsi");
                    System.out.println("2. Lauk Telur      = 7.000 per porsi");
                    System.out.println("3. Lauk Ayam       = 10.000 per porsi");
                    System.out.print("Pilihan = ");
                    pilih = s.nextInt();
                    switch(pilih){
                        case 1 :
                            System.out.print("Jumlah Porsi = ");
                            jumlah = s.nextInt();
                            harga1 = jumlah * 5000;
                            System.out.println("Harga = "+harga1);
                            break;
                        case 2 :
                            System.out.print("Jumlah Porsi = ");
                            jumlah = s.nextInt();
                            harga2 = jumlah * 7000;
                            System.out.println("Harga = "+harga2);
                            break;
                        case 3 :
                            System.out.print("Jumlah Porsi = ");
                            jumlah = s.nextInt();
                            harga3 = jumlah * 10000;
                            System.out.println("Harga = "+harga3);
                            break;
                    }
                    total3 = harga1 + harga2 + harga3;
                    break;
            }
        }while(pilih!=4);
        
        System.out.println("-------------------------------------");
        harga = (total1 + total2 + total3);
        System.out.println("Total Yang Harus Dibayar = "+harga);
        System.out.println("Apakah Anda Member ?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilihan = ");
        pilih = s.nextInt();
        if(pilih == 1){
            System.out.println("=====================================");
            System.out.println("      Anda Mendapatkan Diskon 5%");
            System.out.println("=====================================");
            diskon = harga * 0.05;
            hargaakhir = harga - diskon;
            System.out.println("Harga Akhir = "+hargaakhir);
        }else if(pilih==2){
            System.out.println("=====================================");
            System.out.println("    Anda Tidak Mendapatkan Diskon");
            System.out.println("=====================================");
            hargaakhir = harga;
            System.out.println("Harga Akhir = "+hargaakhir);
        }else{
            System.out.println("Input Yang Anda Masukkan Salah");
        }
        System.out.print("Uang Diterima = ");
        uang = s.nextInt();
        kembalian = (int) (uang - hargaakhir);
        if (uang == hargaakhir) {
            System.out.println("Uang Pas");
        }else if(uang > hargaakhir){
            System.out.println("Kembalian Anda = "+kembalian);
        }else if (uang < hargaakhir){
            System.out.println("Uang Anda Kurang");
        }
        
        System.out.println("============Terima Kasih=============");
    }
}
