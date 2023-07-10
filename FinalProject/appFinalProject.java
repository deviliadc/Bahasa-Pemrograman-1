package FinalProject;
import java.util.Scanner;
public class appFinalProject {
    //variable global
    static String Menu[] = new String[15];
    static int Harga[] = new int[15];
    static int jumlah = 8;
    static int total[] = new int[15];
    static int pemasukan = 0;
    static int terlaris[] = new int [15];
    
    static String[] sort(String[] menu){
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah-1; j++) {
                if(menu[j].compareToIgnoreCase(menu[j+1])>0){
                    String m = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = m;

                    int h = Harga[j];
                    Harga[j] = Harga[j+1];
                    Harga[j+1] = h;
                }
            }
        }
        return menu;
    }
    static int mCari(String menu[], int harga[], String kata){
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah-1; j++) {
                if(menu[j]!=null && menu[j+1]!=null && menu[j].compareToIgnoreCase(menu[j+1])>0){
                    String m = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = m;
                    
                    int h = harga[j];
                    harga[j] = harga[j+1];
                    harga[j+1] = h;
                }
            }
        }
        int idx = 0;
        for (int i = 0; i < jumlah - 1; i++) {
            if(menu[i].indexOf(kata)>=0){
                idx = i+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int user = 0; 
        int start = 0;
        int kasir = 0, admin = 0, owner = 0;
        int pilih = 0, pilih2 = 0, pilih3 = 0, pilih4 = 0;
        int porsi[] = new int[15];
        
        Menu[0] = "Ayam Geprek"; Harga[0] = 17000;
        Menu[1] = "Nasi Goreng"; Harga[1] = 12000;
        Menu[2] = "Rendang    "; Harga[2] = 15000;
        Menu[3] = "Rica-rica  "; Harga[3] = 14000;
        Menu[4] = "Nasi Pecel "; Harga[4] = 7000;
        Menu[5] = "Soto       "; Harga[5] = 8000;
        Menu[6] = "Mi Goreng  "; Harga[6] = 10000;
        Menu[7] = "Penyetan   "; Harga[7] = 13000;
        
        String menu[] = new String[15];
        int harga[] = new int[15];
        
        do{
            System.out.println("=================================================");
            System.out.println("\t\t   PILIH USER");
            System.out.println("=================================================");
            System.out.println("1. Kasir");
            System.out.println("2. Admin");
            System.out.println("3. Owner");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            user = sc.nextInt();
            switch(user){
                case 1 :
                    System.out.println("-------------------------------------------------");
                    System.out.println("\t\t      KASIR");
                    System.out.println("-------------------------------------------------");
                    do{
                        int banyak = 0;
                        int totalakhir = 0;
                        int uang = 0;
                        int kembalian = 0;
                        
                        System.out.println("\nMulai pesanan?");
                        System.out.println("1. Iya");
                        System.out.println("2. Tidak");
                        System.out.print("Pilih = ");
                        start = sc.nextInt();
                        switch(start){
                            case 1 :
                                do{
                                System.out.println("\n1. Daftar Menu");
                                System.out.println("2. Cari Menu");
                                System.out.println("3. Selesai");
                                System.out.print("Pilih = ");
                                pilih = sc.nextInt();
                                switch(pilih){
                                    case 1 :
                                        System.out.println("\n============== RUMAH MAKAN BINTANG ==============");
                                        System.out.println("-------------------------------------------------");
                                        System.out.println("\t\t   Daftar Menu");
                                        System.out.println("-------------------------------------------------");
                                        String[] urut = sort(Menu);
                                        System.out.println("No Menu \t\tHarga");
                                        for (int i = 0; i < jumlah; i++) {
                                            System.out.println((i+1)+". "+urut[i]+" \t\tRp."+Harga[i]);
                                        }
                                        System.out.println("-------------------------------------------------");
                                        do{
                                            System.out.println("\t\t     Pesanan");
                                            System.out.print("Pilih = ");
                                            pilih2 = sc.nextInt();
                                            System.out.print("Porsi = ");
                                            porsi[banyak] = sc.nextInt();
                                            menu[banyak] = Menu[pilih2-1];
                                            harga[banyak] = Harga[pilih2-1];
                                            total[banyak] = porsi[banyak] * harga[banyak];
                                            terlaris[pilih2-1] = terlaris[pilih2-1] + porsi[banyak];
                                            banyak++;
                                            do{
                                                System.out.println("\nIngin Memesan Lagi?");
                                                System.out.println("1. Iya");
                                                System.out.println("2. Tidak");
                                                System.out.print("Pilih = ");
                                                start = sc.nextInt();
                                                if(start!=2 && start > 2){
                                                    System.out.println("\n\t\t<< Pilihan Tidak Ada >>");
                                                }
                                            }while(start!=2 && start > 2);
                                        }while(start!=2);
                                        break;
                                    case 2 :
                                        System.out.println("-------------------------------------------------");
                                        System.out.print("Cari Menu = ");
                                        String nama = sc.next();
                                        int nomor = mCari(Menu,Harga,nama);
                                        if(nomor!=0){
                                            System.out.println("Menu berada di urutan : "+nomor);
                                        }
                                        else if(nomor==0){
                                            System.out.println("\n\t\t << Menu Tidak Ada >>");
                                        }
                                        System.out.println("\n\t      << Pencarian Selesai >>");
                                        break;
                                    case 3 :
                                        //Struk pembelian
                                        if(pilih2!=0){
                                            System.out.println("\n============== RUMAH MAKAN BINTANG ==============");
                                            System.out.println("\t\t  Struk Pembelian");
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("No Menu\t\tHarga\t\tPorsi\tTotal");
                                            for (int i = 0; i < banyak; i++) {
                                                System.out.print((i+1)+". "+menu[i]+"\tRp."+harga[i]);
                                                System.out.println(" \t"+porsi[i]+"\tRp."+total[i]);
                                                totalakhir = totalakhir + total[i];
                                            }
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("Total Pembelian\t\t\t\tRp."+totalakhir);
                                            pemasukan = pemasukan + totalakhir; //Digunakan untuk pemasukan OWNER
                                            do{
                                                System.out.print("Uang Tunai\t\t\t\tRp.");
                                                uang = sc.nextInt();
                                                if(uang >= totalakhir){
                                                    kembalian = uang - totalakhir;
                                                    System.out.println("Kembalian\t\t\t\tRp."+kembalian);
                                                }
                                                if(uang == totalakhir){
                                                    System.out.println("Uang Pas");
                                                }
                                                if(uang < totalakhir){
                                                    System.out.println("Uang Anda Tidak Cukup");
                                                }
                                            }while(uang < totalakhir);
                                            System.out.println("-------------------------------------------------");
                                        }
                                        break;
                                    }
                                    if(pilih > 3){
                                        System.out.println("\n\t\t<< Pilihan tidak ada >>");
                                    }
                                    }while(pilih!=3);
                                case 2 :
                                    break;
                            }
                            if(start > 2){
                                System.out.println("\n\t\t<< Pilihan tidak ada >>");
                            }
                        }while(start!=2);
                        System.out.println("\n\t<< Anda Keluar Dari Menu Kasir >>");
                        System.out.println("");
                        break;
                case 2 :
                    System.out.println("-------------------------------------------------");
                    System.out.println("\t\t     ADMIN");
                    System.out.println("-------------------------------------------------");
                    do{
                        System.out.println("Apakah Anda Ingin Masuk Sebagai Admin?");
                        System.out.println("1. Iya");
                        System.out.println("2. Tidak");
                        System.out.print("Pilih = ");
                        start = sc.nextInt();
                        switch(start){
                            case 1 :
                                do{
                                    System.out.println("\n1. Tampilkan Menu");
                                    System.out.println("2. Tambah Menu");
                                    System.out.println("3. Ubah Menu");
                                    System.out.println("4. Hapus Menu");
                                    System.out.println("5. Selesai");
                                    System.out.print("Pilih = ");
                                    admin = sc.nextInt();
                                    switch(admin){
                                        case 1 :
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("\t\t    Daftar Menu");
                                            System.out.println("-------------------------------------------------");
                                            String[] urut = sort(Menu);
                                            System.out.println("No Menu \t\tHarga");
                                            for (int i = 0; i < jumlah; i++) {
                                                System.out.println((i+1)+". "+urut[i]+" \t\tRp."+Harga[i]);
                                            }
                                            break;
                                        case 2 :
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("\t\t   Tambah Menu");
                                            System.out.println("-------------------------------------------------");
                                            System.out.print("Nama Menu : ");
                                            Menu[jumlah] = sc.next();
                                            System.out.print("Harga : ");
                                            Harga[jumlah] = sc.nextInt();
                                            jumlah++;
                                            System.out.println("\n\t<< Menu berhasil ditambahkan >>");
                                            break;
                                        case 3 :
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("\t\t    Ubah Menu");
                                            System.out.println("-------------------------------------------------");
                                            System.out.print("Menu Yang Diubah : ");
                                            String nama = sc.next();
                                            int indeks = mCari(Menu, Harga, nama);
                                            if(indeks!=0){
                                                System.out.println("Menu Berada Pada Urutan : "+indeks);
                                                System.out.print("Menu Baru : ");
                                                String menubaru = sc.next();
                                                System.out.print("Harga : ");
                                                int hargabaru = sc.nextInt();
                                                Menu[indeks-1] = menubaru;
                                                Harga[indeks-1] = hargabaru;
                                                System.out.println("\n\t   << Menu berhasil diubah >>");
                                            }
                                            if(indeks==0){
                                                System.out.println("\n\t    << Menu Tidak Ada >>");
                                            }
                                            break;
                                        case 4 :
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("\t\t  Hapus Menu");
                                            System.out.println("-------------------------------------------------");
                                            boolean ketemu = false;
                                            int idx = -1;
                                            System.out.print("Nama Menu : ");
                                            nama = sc.next();
                                            for (int i = 0; i < jumlah; i++) {
                                                if(Menu[i].compareToIgnoreCase(nama)>=0){
                                                    ketemu = true;
                                                    idx = i;
                                                    break;
                                                }
                                            }
                                            if(ketemu==false){
                                                System.out.println("\n\t    << Menu Tidak Ada >>");
                                            }
                                            else{
                                                for (int i = idx; i < jumlah-1; i++) {
                                                    Menu[i] = Menu[i+1];
                                                    Harga[i] = Harga[1+1];
                                                }
                                                System.out.println("\n\t<< Menu berhasil dihapus >>");
                                                jumlah--;
                                            }
                                            break;
                                        }
                                        if(admin > 5){
                                            System.out.println("\n\t     << Pilihan tidak ada >>");
                                        }
                                }while(admin!=5);
                                break;
                            case 2 :
                                System.out.println("\n\t  << Anda Keluar Dari Menu Admin >>\n");
                                break;
                            }
                        if(start > 2){
                            System.out.println("\n\t     << Pilihan tidak ada >>\n");
                        }
                    }while(start!=2);
                    break;
                case 3 :
                    System.out.println("-------------------------------------------------");
                    System.out.println("\t\t     OWNER");
                    System.out.println("-------------------------------------------------");
                    do{
                        System.out.println("Apakah Anda Ingin Masuk Sebagai Owner?");
                        System.out.println("1. Iya");
                        System.out.println("2. Tidak");
                        System.out.print("Pilih = ");
                        start = sc.nextInt();
                        switch(start){
                            case 1 :
                                do{
                                    System.out.println("\nSilahkan Pilih Menu Dibawah");
                                    System.out.println("1. Laporan Pemasukan");
                                    System.out.println("2. 5 Menu Terlaris");
                                    System.out.println("3. Selesai");
                                    System.out.print("Pilih = ");
                                    owner = sc.nextInt();
                                    System.out.println("");
                                    switch(owner){
                                        case 1 :
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("\t    Laporan Total Pemasukan");
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("Total Pemasukan = Rp."+pemasukan);
                                            System.out.println("-------------------------------------------------");
                                            break;
                                        case 2 :
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("\t\t  5 Menu Terlaris");
                                            System.out.println("-------------------------------------------------");
                                            String menu2[] = Menu;
                                            for (int i = 0; i < jumlah-1; i++) {
                                                for (int j = i+1; j < jumlah; j++) {
                                                    if(terlaris[i]<terlaris[j]){
                                                        int t = terlaris[j];
                                                        terlaris[j] = terlaris[i];
                                                        terlaris[i] = t;
                                                        
                                                        String u = menu2[j];
                                                        menu2[j] = menu2[i];
                                                        menu2[i] = u;
                                                    }
                                                }
                                            }
                                            for (int i = 0; i < 5; i++) {
                                                System.out.println((i+1)+". "+menu2[i]+"\t"+terlaris[i]);
                                            }
                                            break;
                                    }
                                    if(owner > 3){
                                        System.out.println("\n\t     << Pilihan tidak ada >>");
                                    }
                                }while(owner!=3);
                                break;
                            case 2 :
                                System.out.println("\n\t<< Anda Kembali Ke Halaman Utama >>\n");
                                break;
                        }
                        if(start > 2){
                            System.out.println("\n\t     << Pilihan tidak ada >>");
                            System.out.println("");
                        }
                    }while(start!=2);
                    break;
            }
            if(user>4){
                System.out.println("\n\t     << Pilihan tidak ada >>");
                System.out.println("");
            }
        }while(user != 4);
        System.out.println("\n\t\t<< Program Berhenti >>");
    }
}