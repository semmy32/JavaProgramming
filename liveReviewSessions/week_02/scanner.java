package week_02;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Write the number here");
        int num= scan.nextInt();
       if(num%2 ==0) {
           System.out.println("This number is EVEN");
       } else {
           System.out.println("This number is ODD");}


    }
}
