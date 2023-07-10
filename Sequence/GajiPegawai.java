package Sequence;
public class GajiPegawai {
    public static void main(String[]args){
        //gaji total = gaji pokok + (masuk x 15.000) + tunjangan
        //tunjangan = gaji pokok x 5%
        int gaji_pokok = 4000000; //inisialisasi
        int jumlahmasuk;
        double tunjangan, gajitotal;
        
        System.out.println("Aplikasi Gaji Pegawai");
        jumlahmasuk = 20;
        //proses
        tunjangan = gaji_pokok * 0.05;
        gajitotal = gaji_pokok + (jumlahmasuk * 15000) + tunjangan;
        //output
        System.out.println("Gaji Pokok      :"+gaji_pokok);
        System.out.println("Uang Transport  :"+(jumlahmasuk * 15000));
        System.out.println("Tunjangan       :"+tunjangan);
        System.out.println("Gaji Pegawai    :"+gajitotal);
        
    }
    
}