package day13_String;

import java.util.Scanner;

public class LongestSentence {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string");
        String str1= scan.next();
        System.out.println("Enter another string");
        String str2= scan.next();
        if(str1.length()> str2.length()){
            System.out.println(str1);} else if(str2.length()> str1.length()) {
            System.out.println(str2);} else{
            System.out.println("They have same number of letters");}



    }
}
// write a program that asks user to enter two strings, and print out the longest string
