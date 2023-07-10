package Tugas;
import java.util.Scanner;
public class Searching_Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array
        String makanan[] = new String[10];
        int harga[] = new int[10];
        int pilih = 0;
        String pembelian[] = new String[5];
        String belimakan[] = new String[5];
        int beliharga[] = new int[5];
        int porsi [] = new int [10];
        int total [] = new int[10];
        int totalbeli = 0, totalbeli1 = 0 , totalbeli2 = 0;
        int jumlahbeli = 0;
        
        //inisialisasi array
        makanan[0]="Sate Ayam    ";harga[0]=12000;
        makanan[1]="Sate Sapi    ";harga[1]=15000;
        makanan[2]="Sate Kambing ";harga[2]=20000;
        makanan[3]="Soto Madura  ";harga[3]=12000;
        makanan[4]="Soto Lamongan";harga[4]=14000;
        makanan[5]="Gado-gado    ";harga[5]=10000;
        makanan[6]="Rawon        ";harga[6]=13000;
        makanan[7]="Bakso        ";harga[7]=8000;
        makanan[8]="Pecel        ";harga[8]=7000;
        makanan[9]="Penyetan     ";harga[9]=9000;
        
        System.out.println("----------------------------------------------");
        System.out.println("\t\t Warung Makan");
        do{
            System.out.println("----------------------------------------------");
            System.out.println("1. Daftar Makanan");
            System.out.println("2. Cari Makanan");
            System.out.println("3. Cari Harga");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            System.out.println("----------------------------------------------");
            switch(pilih){
                case 1 :
                    //urutkan berdasarkan nama
                    //pakai bubble sort
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 9; j++) {
                            if(makanan[j] .compareToIgnoreCase (makanan[j+1]) > 0){
                                String t = makanan[j];
                                makanan[j] = makanan[j+1];
                                makanan[j+1] = t;
                                
                                int h = harga[j];
                                harga[j] = harga[j+1];
                                harga[j+1] = h;
                            }
                        }
                    }
                    System.out.println("Daftar Menu");
                    System.out.println("No Menu\t\t\tHarga");
                    for (int i = 0; i < 10; i++) {
                        System.out.println((i+1)+". "+makanan[i]+"\t"+harga[i]);
                    }
                    break;
                case 2 :
                    System.out.print("Cari = ");
                    String cari = sc.next();
                    String carimakan[] = new String[10];
                    int cariharga[] = new int[10];
                    int idx=0;
                    System.out.println("Daftar Menu");
                    System.out.println("No Menu\t\t\tHarga");
                    for (int i = 0; i < makanan.length; i++) {
                        if(makanan[i].indexOf(cari)>=0){
                            carimakan[idx] = makanan[i];
                            cariharga[idx] = harga[i];
                            idx++;
                            System.out.println(idx+". "+makanan[i]+"\t"+harga[i]);
                        }
                    }
                    //transaksi
                    System.out.print("Pilih Menu = ");
                    pilih = sc.nextInt();
                    belimakan[jumlahbeli] = carimakan[pilih-1];
                    beliharga[jumlahbeli] = cariharga[pilih-1];
                    System.out.print("Porsi = ");
                    porsi[jumlahbeli] = sc.nextInt();
                    total[jumlahbeli] = beliharga[jumlahbeli] * porsi[jumlahbeli];
                    totalbeli1 = totalbeli1 + total[jumlahbeli];
                    jumlahbeli++;
                    break;
                case 3 :
                    System.out.print("Harga Bawah = ");
                    int range1 = sc.nextInt();
                    System.out.print("Harga Atas = ");
                    int range2 = sc.nextInt();
                    int cariharga2[] = new int[10];
                    String carimakan2[] = new String[10];
                    int idx2 = 0;
                    
                    System.out.println("Daftar Menu");
                    System.out.println("No Menu\t\t\tHarga");
                    for (int i = 0; i < makanan.length; i++) {
                        if (harga[i]>=range1 && harga[i]<=range2){
                        carimakan2[idx2] = makanan[i];
                        cariharga2[idx2] = harga[i];
                        idx2++;
                        System.out.println(idx2+". "+makanan[i]+"\t"+harga[i]);
                        }
                    }
                    //transaksi
                    System.out.print("Pilih Menu = ");
                    pilih = sc.nextInt();
                    belimakan[jumlahbeli]=carimakan2[pilih-1];
                    beliharga[jumlahbeli]=cariharga2[pilih-1];
                    System.out.print("Porsi = ");
                    porsi[jumlahbeli] = sc.nextInt();
                    total[jumlahbeli] = beliharga[jumlahbeli] * porsi[jumlahbeli];
                    totalbeli2 = totalbeli2 + total[jumlahbeli];
                    jumlahbeli++;
                    break;
                case 4 :
                    System.out.println("\t\tTerima kasih..");
                    break;
            }
        }while(pilih!=4);
        //cetak daftar beli
        System.out.println("----------------------------------------------");
        System.out.println("Daftar Beli");
        System.out.println("No Menu \t\tHarga\tPorsi\tTotal");
        for (int i = 0; i < jumlahbeli; i++) {
            System.out.println((i+1)+". "+belimakan[i]+"\t"+beliharga[i]+"\t"+porsi[i]+"\t"+total[i]);
            totalbeli = totalbeli1 + totalbeli2;
        }
        System.out.println("Total Pembelian = Rp. "+totalbeli);
    }
}
