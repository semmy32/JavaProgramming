package day14_StringContinue;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println("enter a word");
        String word= new Scanner(System.in).nextLine();
        char ch=word.charAt(0);
        if(ch>='0' && ch<='9'){
            System.out.println("first character is digit");}
        else if(ch>='a' && ch<='z'){
            System.out.println("first character is lowercase letter");}
        else if(ch>='A' && ch<='Z'){
            System.out.println("first character is uppercase letter");}
        else {
            System.out.println("first character is special character");}

    }
}
/*Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"*/