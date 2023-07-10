package Looping;
import java.util.Scanner;
public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilih, setor, tarik, transfer, rekening;
        int saldo=100000;
        do{
            System.out.println("\nMenu ATM");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih= s.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Nominal Setor = ");
                    setor = s.nextInt();
                    saldo = saldo+setor;
                    System.out.println("Saldo = "+saldo);
                    break;
                case 2:
                    System.out.print("Nominal Tarik = ");
                    tarik = s.nextInt();
                    if(saldo>=tarik){
                        saldo = saldo-tarik;
                    }
                    else{
                        System.out.println("Saldo Tidak Cukup");
                    }
                    System.out.println("Saldo = "+saldo);
                    break;
                case 3:
                    System.out.print("Rekning Tujuan = ");
                    rekening = s.nextInt();
                    System.out.print("Nominal Transfer = ");
                    transfer = s.nextInt();
                    if(saldo>=transfer){
                        saldo = saldo-transfer;
                        System.out.println("Transfer Sukses");
                    }
                    else{
                        System.out.println("Saldo Tidak Cukup");
                    }
                    System.out.println("Saldo = "+saldo);
                    break;
                case 4:
                    System.out.println("Terima Kasih...");
                    break;
            }
        }while(pilih!=4);
    }
}
