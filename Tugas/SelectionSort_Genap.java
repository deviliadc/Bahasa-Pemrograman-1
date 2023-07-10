package Tugas;
import java.util.Scanner;
public class SelectionSort_Genap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String barang [] = new String[5];
        int harga [] = new int[5];
        String barang2[]= new String[5];
        barang2 = barang;
        int harga2[] = new int[5];
        harga2 = harga;
        int pilih;
        
        //inisialisasi
        barang[0]="Pensil   "; harga[0]=2000;
        barang[1]="Bolpoint "; harga[1]=3000;
        barang[2]="Penghapus"; harga[2]=1000;
        barang[3]="Buku     "; harga[3]=3500;
        barang[4]="Penggaris"; harga[4]=1500;
        
        System.out.println("-- Toko Alat Tulis --");
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("    Daftar Harga");
        System.out.println("---------------------");
        System.out.println("Barang\t\tHarga");
        for (int i = 0; i < 5; i++) {
            System.out.println(barang[i]+"\t"+harga[i]);
            }
        System.out.println("---------------------");
        
        //memakai algoritma selection sort
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                if(harga2[i]<harga2[j]){
                    int temp=harga2[j];
                    harga2[j]=harga2[i];
                    harga2[i]=temp;
                    //urutan barang
                    String s = barang2[j];
                    barang2[j] = barang2[i];
                    barang2[i] = s;
                }
            }
        }
        //output
        System.out.println("Harga Barang Termahal");
        System.out.println("---------------------");
        System.out.println("Barang\t\tHarga");
        for (int i = 0; i < 5; i++) {
            System.out.println(barang2[i]+"\t"+harga2[i]);
        }
        System.out.println("---------------------");
        System.out.println("     Terima Kasih");
        System.out.println("---------------------");
    }
}
