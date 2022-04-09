package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Prctc2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        System.out.println("Enter a character");
        char ch=scan.next().charAt(0);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
              count++;
            }
        }
        System.out.print(count);

    }
}
/*Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
*/