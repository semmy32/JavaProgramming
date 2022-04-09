package day13_String;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word");
        String w1= scan.next();
        System.out.println("Enter second word");
        String w2= scan.next();
        System.out.println("Enter third word");
        String w3= scan.next();
        int word1= w1.length();
        int word2= w2.length();
        int word3= w3.length();
        if(word1==word2 && word2==word3){
            System.out.println("All words are same length");}
        else if(word1==word2|| word1==word3||word2==word3){
            System.out.println("Not Same nor Different lengths");}
        else {
            System.out.println("Different lengths");}


    }
}
/*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print Not Same nor Different lengths

 */