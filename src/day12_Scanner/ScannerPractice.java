package day12_Scanner;

import java.util.Scanner;/*in replit it is java.util.*; this is wild imports everything
from the package. Btw it is not efficient, we should use spesific import statement */

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Give a value to radius: ");
        int r= scan.nextInt();
        scan.close(); //if I am sure that the scanner process is finished,I put here close method.
        double area= 3.14* r*r;
        double perimeter= 2*3.14*r;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);



    }
}
