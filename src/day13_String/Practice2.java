package day13_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string");
        String s= scan.next();
       int countLetter= s.length();
        char s1= s.charAt(countLetter-1);
        char s2= s.charAt(countLetter-2);
        char s3= s.charAt(countLetter-3);
        if(countLetter==0){
            System.out.println("string is empty");} else if(countLetter>3){
            System.out.println(s3+""+s2+""+s1);}
        else{
            System.out.println(s);}
    }
}
/*Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */