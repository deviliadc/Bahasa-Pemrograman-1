package Tugas;
import java.util.Scanner;
public class WarungSedrehana_SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilih, jumlah, harga;
        double diskon, hargaakhir;
        
        System.out.println("===========Warung Sederhana==========");
        System.out.println("============Menu Makanan=============");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        //input pilihan menu
        System.out.print("Pilih Menu = ");
        pilih = s.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("==========Pilihan Menu Sate==========");
                System.out.println("1. Sate Ayam    = 1.500 per tusuk");
                System.out.println("2. Sate Kambing = 3.000 per tusuk");
                System.out.print("Pilihan = ");
                pilih = s.nextInt();
                if(pilih==1){
                    System.out.print("Jumlah Tusuk = ");
                    jumlah = s.nextInt();
                    harga = jumlah * 1500;
                    System.out.println("Harga = "+harga);
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
                    }else{
                        System.out.println("=====================================");
                        System.out.println("    Anda Tidak Mendapatkan Diskon");
                        System.out.println("=====================================");
                        System.out.println("Harga Akhir = "+harga);
                    }
                }else{
                    System.out.print("Jumlah Tusuk = ");
                    jumlah = s.nextInt();
                    harga = jumlah * 1500;
                    System.out.println("Harga = "+harga);
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
                        System.out.println("Harga Akhir     = "+hargaakhir);
                    }else{
                        System.out.println("=====================================");
                        System.out.println("    Anda Tidak Mendapatkan Diskon");
                        System.out.println("=====================================");
                        System.out.println("Harga Akhir = "+harga);
                    }
                }
                break;
            case 2 :
                System.out.println("==========Pilihan Menu Pecel=========");
                System.out.println("1. Lauk Ayam    = 13.000 per porsi");
                System.out.println("2. Lauk Empal   = 15.000 per porsi");
                System.out.print("Pilih Lauk = ");
                pilih = s.nextInt();
                if(pilih==1){
                    System.out.print("Jumlah Porsi = ");
                    jumlah = s.nextInt();
                    harga = jumlah * 13000;
                    System.out.println("Harga = "+harga);
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
                    }else{
                        System.out.println("=====================================");
                        System.out.println("    Anda Tidak Mendapatkan Diskon");
                        System.out.println("=====================================");
                        System.out.println("Harga Akhir = "+harga);
                    }
                }else{
                    System.out.print("Jumlah Porsi = ");
                    jumlah = s.nextInt();
                    harga = jumlah * 15000;
                    System.out.println("Harga = "+harga);
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
                        System.out.println("Harga Akhir     = "+hargaakhir);
                    }else{
                        System.out.println("=====================================");
                        System.out.println("    Anda Tidak Mendapatkan Diskon");
                        System.out.println("=====================================");
                        System.out.println("Harga Akhir = "+harga);
                    }
                }
                break;
            case 3 :
                System.out.println("========Pilihan Menu Penyetan========");
                System.out.println("1. Lauk Tahu/Tempe = 5.000 per porsi");
                System.out.println("2. Lauk Telur      = 7.000 per porsi");
                System.out.println("3. Lauk Ayam       = 10.000 per porsi");
                System.out.print("Pilihan = ");
                pilih = s.nextInt();
                switch(pilih){
                    case 1 :
                        System.out.print("Jumlah Porsi = ");
                        jumlah = s.nextInt();
                        harga = jumlah * 7000;
                        System.out.println("Harga = "+harga);
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
                        }else{
                            System.out.println("=====================================");
                            System.out.println("    Anda Tidak Mendapatkan Diskon");
                            System.out.println("=====================================");
                            System.out.println("Harga Akhir = "+harga);
                        }
                        break;
                    case 2 :
                        System.out.print("Jumlah Porsi = ");
                        jumlah = s.nextInt();
                        harga = jumlah * 5000;
                        System.out.println("Harga = "+harga);
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
                        }else{
                            System.out.println("=====================================");
                            System.out.println("    Anda Tidak Mendapatkan Diskon");
                            System.out.println("=====================================");
                            System.out.println("Harga Akhir = "+harga);
                        }
                        break;
                    case 3 :
                        System.out.print("Jumlah Porsi = ");
                        jumlah = s.nextInt();
                        harga = jumlah * 10000;
                        System.out.println("Harga = "+harga);
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
                        }else{
                            System.out.println("=====================================");
                            System.out.println("    Anda Tidak Mendapatkan Diskon");
                            System.out.println("=====================================");
                            System.out.println("Harga Akhir = "+harga);
                        }
                        break;
                    }
                break;
            default :
                System.out.println("=====================================");
                System.out.println("=========Menu Tidak Tersedia=========");
            }
    }
}
