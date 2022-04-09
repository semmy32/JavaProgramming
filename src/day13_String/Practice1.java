package day13_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("enter a sentence");
        String sentence= scan.nextLine();
        sentence.length();
        char first= sentence.charAt(0);
        char last= sentence.charAt( sentence.length()-1);
        System.out.println(first+" "+last);
 scan.close();
    }
}
/*write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence*/