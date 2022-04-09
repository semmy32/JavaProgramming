package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        int countJava=0;

        for(int i=0; i<str.length(); i++){
           if(str.substring(i).startsWith("Java")){
               countJava++;
        }}
        System.out.println("countJava = " + countJava);
    }
}
/*write a program that can return the frequency of the  word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2*/
