package Looping;
public class LoopFor {
    public static void main(String[] args) {
        int angka;
        int jumlah=0;
        int kali=1;
        for (angka = 1; angka < 10; angka++){
            System.out.print(angka+" ");
            jumlah = jumlah+angka;
            kali = kali*angka;
        }
        System.out.println("\nHasil Jumlah : "+jumlah);
        System.out.println("Hasil Kali : "+kali);
    }
}
