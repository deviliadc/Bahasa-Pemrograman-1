package SwitchCase;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double saldo = 5000000;
        int pin, pilih;
        
        System.out.print("Masukkan PIN : ");
        pin = s.nextInt();
        if (pin==1234){
        
        //tampilkan menu
        System.out.println("--ATM Sederhana--");
        System.out.println("1. Transfer");
        System.out.println("2. Penarikan");
        System.out.println("3. Pembayaran");
        //input pilihan
        System.out.print("Pilih = ");
        pilih = s.nextInt();
        //seleksi pilihan
        switch (pilih){
            case 1 :
                System.out.print("Rekening Tujuan = ");
                int rek = s.nextInt();
                System.out.print("Nominal = ");
                double nominal = s.nextDouble();
                if(saldo>=nominal){
                    System.out.println("Transfer Sukses");
                    saldo = saldo - nominal;
                    System.out.println("Saldo : "+saldo);
                }else{
                    System.out.println("Saldo Tidak Mencukupi");
                }
                break;
            case 2 :
                System.out.print("Nominal = ");
                nominal = s.nextDouble();
                if(saldo>=nominal){
                    System.out.println("Debet Sukses");
                    saldo = saldo - nominal;
                    System.out.println("Saldo : "+saldo);
                }else{
                    System.out.println("Saldo Tidak Mencukupi");
                }
                break;
            case 3 :
                System.out.println("    1. SPP/UKT");
                System.out.println("    2. Listrik");
                System.out.println("    3. Air");
                System.out.print("    Pilih = ");
                int pilih2 = s.nextInt();
                switch (pilih2){
                    case 1:
                        System.out.print("NPM = ");
                        int npm = s.nextInt();
                        System.out.print("SPP/UKT =");
                        nominal = s.nextDouble();
                        if(saldo>=nominal){
                            System.out.println("Pembayaran Sukses");
                            saldo = saldo - nominal;
                            System.out.println("Saldo : "+saldo);
                            }else{
                             System.out.println("Saldo Tidak Mencukupi");
                            }
                        break;
                    case 2:
                        System.out.print("Kode Pelanggan = ");
                        int kode = s.nextInt();
                        System.out.print("Biaya = ");
                        nominal = s.nextDouble();
                        if(saldo>=nominal){
                            System.out.println("Pembayaran Sukses");
                            saldo = saldo - nominal;
                            System.out.println("Saldo : "+saldo);
                            }else{
                             System.out.println("Saldo Tidak Mencukupi");
                            }
                        break;
                    case 3:
                        System.out.print("Kode Pelanggan = ");
                        kode = s.nextInt();
                        System.out.print("Biaya =");
                        nominal = s.nextDouble();
                        if(saldo>=nominal){
                            System.out.println("Pembayaran Sukses");
                            saldo = saldo - nominal;
                            System.out.println("Saldo : "+saldo);
                            }else{
                             System.out.println("Saldo Tidak Mencukupi");
                            }
                        break;
                }
                break;
            default :
                        System.out.println("Menu Tidak Ada");
        }
        }else{
            System.out.println("PIN Salah");
        }
    }
    
}