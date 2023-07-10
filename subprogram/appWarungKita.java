package subprogram;
import java.util.Scanner;
public class appWarungKita {
    //variable global
    static int harga[] = new int[10];
    
    static int hitungharga(int hargasatuan, int jumlah)//header
    {
        //body
        int harga = hargasatuan * jumlah;
        return harga;
    }
    static String[] sort(String[] menu){
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu.length-1; j++) {
                if(menu[j].compareToIgnoreCase(menu[j+1])>0){
                    String t = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = t;
                    
                    int h = harga[j];
                    harga[j] = harga[j+1];
                    harga[j+1] = h;
                }
            }
        }
        return menu;
    }
    static String[][] search(String[] menu, int harga[], String cari){
        String[][] hasil = new String[10][2];
        int idx = 0;
        for (int i = 0; i < menu.length; i++) {
            if(menu[i].indexOf(cari)>=0){
                hasil[idx][0] = menu[i];
                hasil[idx][1] = String.valueOf(harga[i]);
                idx++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String makanan[] = new String[10];
        String minuman[] = new String[5];
        //int harga[] = new int[10];
        
        //inisialisasi array
        minuman[0]="Es Teh       ";
        minuman[1]="Es Jeruk     ";
        minuman[2]="Air Putih    ";
        minuman[3]="Teh Hangat   ";
        minuman[4]="Jeruk Hangat ";
        
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
        
        int pilih=0;
        do{
            System.out.println("MENU");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Snack");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.println("1. Daftar Makanan");
                    System.out.println("2. Cari Makanan");
                    System.out.print("Pilih = ");
                    int pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1 :
                            String[] urut = sort(makanan);
                            System.out.println("Daftar Menu");
                            for (int i = 0; i < 10; i++) {
                                System.out.println((i+1)+". "+urut[i]);
                            }
                            System.out.println("");
                            break;
                        case 2 :
                            System.out.print("Cari = ");
                            String c = sc.next();
                            String hasilcari[][] = search(makanan,harga,c);
                            System.out.println("Hasil Pencarian");
                            for (int i = 0; i < hasilcari.length; i++) {
                                if(hasilcari[i][0]!=null){
                                    System.out.print((i+1)+". "+hasilcari[i][0]+" ");
                                    System.out.println(Integer.parseInt(hasilcari[i][1]));
                                } 
                            }
                            System.out.println("");
                            break;
                    }
                    break;
                case 2 :
                    System.out.println("1. Daftar Minuman");
                    System.out.println("2. Cari Minuman");
                    System.out.print("Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1 :
                            String[] urut = sort(minuman);
                            System.out.println("Daftar Minuman");
                            for (int i = 0; i < urut.length; i++) {
                                System.out.println((i+1)+". "+urut[i]);
                            }
                            System.out.println("");
                            break;
                        case 2 :
                            break;
                    }
                    break;
                case 3 :
                    break;
                case 4 :
                    System.out.println("Terima Kasih..");
                    break;
            }
        }while(pilih!=4);
    }
}
