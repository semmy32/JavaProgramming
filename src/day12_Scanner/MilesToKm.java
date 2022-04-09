package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter miles: ");
        int mile= scan.nextInt();
        double km= mile*1.609;
        System.out.println(mile+ " miles equal to "+ km+" kilometers");
        scan.close();



    }
}
/*Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */