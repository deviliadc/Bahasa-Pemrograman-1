package Tugas;
import java.util.Scanner;
public class WarungMakan_Array1D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String makanan [];
        makanan = new String[5];
        int harga[] = new int[5];
        int porsi[] = new int[5];
        int hargaakhir[] = new int[5];
        int indeks = 0; //indeks array
        int pilih, banyak = 0, jumlah = 0, total = 0;
        
        System.out.println("~~~~~~~~ Warung Makan Sederhana ~~~~~~~~");
        do{
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("\t     Daftar Menu");
            System.out.println("----------------------------------------");
            System.out.println("1. Sate  [Rp. 15.000]");
            System.out.println("2. Soto  [Rp. 10.000]");
            System.out.println("3. Rawon [Rp. 12.000]");
            System.out.println("4. Pecel [Rp. 8.000]");
            System.out.println("5. Bakso [Rp. 10.000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih : ");
            pilih = s.nextInt();
            switch(pilih){
                case 1 :
                    makanan[indeks]="Sate ";
                    harga[indeks]=15000;
                    System.out.print("Jumlah Porsi : ");
                    porsi[indeks] = s.nextInt();
                    jumlah = 15000*porsi[indeks];
                    hargaakhir[indeks]=jumlah;
                    total=total+hargaakhir[indeks];
                    break;
                case 2 :
                    makanan[indeks]="Soto ";
                    harga[indeks]=10000;
                    System.out.print("Jumlah Porsi : ");
                    porsi[indeks] = s.nextInt();
                    jumlah = 10000*porsi[indeks];
                    hargaakhir[indeks]=jumlah;
                    total=total+hargaakhir[indeks];
                    break;
                case 3 :
                    makanan[indeks]="Rawon";
                    harga[indeks]=12000;
                    System.out.print("Jumlah Porsi : ");
                    porsi[indeks] = s.nextInt();
                    jumlah = 12000*porsi[indeks];
                    hargaakhir[indeks]=jumlah;
                    total=total+hargaakhir[indeks];
                    break;
                case 4 :
                    makanan[indeks]="Pecel";
                    harga[indeks]=8000;
                    System.out.print("Jumlah Porsi : ");
                    porsi[indeks] = s.nextInt();
                    jumlah = 8000*porsi[indeks];
                    hargaakhir[indeks]=jumlah;
                    total=total+hargaakhir[indeks];
                    break;
                case 5 :
                    makanan[indeks]="Bakso";
                    harga[indeks]=10000;
                    System.out.print("Jumlah Porsi : ");
                    porsi[indeks] = s.nextInt();
                    jumlah = 10000*porsi[indeks];
                    hargaakhir[indeks]=jumlah;
                    total=total+hargaakhir[indeks];
                    break;
            }
            indeks++;
        }while(pilih!=6);
        //menampilkan makanan yang dibeli
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("\t     Struk Pembelian");
        System.out.println("----------------------------------------");
        System.out.println("No Nama    Harga\tPorsi\tJumlah");
        for (int i = 0; i < indeks - 1; i++) {
            System.out.println((i+1)+". "+makanan[i]+"   Rp."+harga[i]+"\t"+porsi[i]+"\tRp."+hargaakhir[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Belanja : Rp."+total);
        System.out.println("----------------------------------------");
    }
}
