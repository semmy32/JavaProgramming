package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Write a word that has five letter");
        String word=scan.next();
        scan.close();
        char w1= word.charAt(0);
        char w2=word.charAt(1);
        char w3=word.charAt(2);
        char w4=word.charAt(3);
        char w5=word.charAt(4);

        if(word.length()<5){
            System.out.println("Too short");}
        else if(word.length()>5){
            System.out.println("Too long");}
        else{
            System.out.println(word+": "+w1+"-"+w2+"-"+w3+"-"+w4+"-"+w5);}


    }
}
/*Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */