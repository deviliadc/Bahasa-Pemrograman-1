package Tugas;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, faktor;
        System.out.println("- N BILANGAN PRIMA PERTAMA -");
        System.out.print("Masukkan niali N = ");
        n = s.nextInt();
        System.out.print("Deret Bilangan Prima = ");
        int a = 2;
        while(n != 0){
            faktor = 0;
            for (int i = 1 ; i <= a; i++) {
                if (a%i==0){
                    faktor++;
                }
            }
            if (faktor==2){
                System.out.print(a+" ");
                n--;
            }
        a++;
        }
        System.out.println("");
    }
}
