package Looping;
import java.util.Scanner;
public class LoopWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pin;
        pin=1;
        while(pin!=1234){
            System.out.print("Enter PIN = ");
            pin=s.nextInt();
        }
        System.out.println("PIN Benar");
    }
    
}

