package subprogram; 
import java.util.Scanner;
public class Rekursi {
    static void m1(){
        System.out.println("ini m1...");
    }
    static void m2(){
        System.out.println("ini m2...");
        m1();
    }
    static void m3(int n){
        if(n==0) return;
        System.out.println("ini m3...");
        m3(n-1); //rekursif
    }
    static int kali(int a, int b){
        int hasil;
        if(b==1)  return a;
        hasil = a + kali (a,b-1);
        return hasil;
    }
    static int faktorial(int n){
        int hasil=0;
        if (n==0) return(1);
        hasil = n * faktorial(n-1);
        return hasil;
    }
    static int fibo(int n){
        if(n<=1) return n;
        //int x = fibo(n-1);
        //int y = fibo(n-2);
        return (fibo(n-1)+fibo(n-2)); //return (x+y);
    }
    static void towers(int n, char from, char to, char aux){
        if(n==1){
            System.out.println("move disk 1 from " + from+ " to "+to);
            return;
        }
        towers(n-1, from, aux, to);
        System.out.println("move disk "+n+" from " +from+" to "+to);
        towers(n-1,aux,to,from);
    }
    public static void main(String[] args) {
        System.out.println("Kali = " + kali(3,5));
        //3+(3*4) = 3+3+(3*3) = 3+3+3+(3*2) = 3+3+3+3(3*1) = 3+3+3+3+3
        System.out.println("Faktorial = " + faktorial(4));
        System.out.println("Fibbonaci = " + fibo(5)); //0,1,1,2,3,5
        System.out.println("Menara Hanoi");towers(3,'A','C','B'); //method callingA
    }
}
