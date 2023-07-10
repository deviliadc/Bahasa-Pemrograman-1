package Percabangan;
public class konversinilai {
    public static void main(String[] args) {
        
        int nilai = 78;
        if(nilai>=0 && nilai<40){
            System.out.println("Nilai E");
        }
        else if(nilai>=40 && nilai<50){
            System.out.println("Nilai D");
        }
        else if(nilai>=50 && nilai<60){
            System.out.println("Nilai C");
        }
        else if(nilai>=60 && nilai<80){
            System.out.println("Nilai B");
        }
        else if(nilai>=80 && nilai<=100){
            System.out.println("Nilai A");
        }
        else{
            System.out.println("Nilai Salah");
        }
    }
}