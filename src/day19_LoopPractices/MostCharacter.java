package day19_LoopPractices;

import java.util.Scanner;

public class MostCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a phrase");
       String str= scan.nextLine();
       int fre1=0;
       String result="";
        for (int j = 0; j < str.length(); j++) {
            int frequency=0;
            char ch= str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==ch){
                    frequency++;
                }

            }
            if(frequency>fre1){
                result=""+ch;
                fre1=frequency;
            }

        }

        System.out.println("result = " + result);
        System.out.println("fre1 = " + fre1);




    }
}
//Write a program that can find the character that has the highest frequency from a string