package Percabangan;
import java.util.Scanner;
public class cekwisuda {
    public static void main(String[] args) {
        //syarat lulus : ipk >= 2,75 dan poin >=250
            Scanner s = new Scanner(System.in);
            double ipk;
            int poin;
            //input data
            System.out.print("Masukkan IPK  = ");
            ipk = s.nextDouble();
            System.out.print("Masukkan Poin = ");
            poin = s.nextInt();
            //proses seleksi kelulusan
            if(ipk>=2.75 && ipk<=4){
                if(poin>=250){
                    //lulus
                    System.out.println("Lulus");
                    System.out.println("Poin Cukup");
                }
                else if(poin<=20){
                    System.out.println("Belum Lulus");
                    System.out.println("Poin Kurang");
                }
            }
            else if(ipk<2.75 && ipk>=0){
                if(poin>=250){
                    //lulus poin
                    System.out.println("Belum Lulus");
                    System.out.println("IPK Kurang");
                }else{
                System.out.println("Belum Lulus");
                System.out.println("IPK Kurang");
                }
            }
    }
    
}