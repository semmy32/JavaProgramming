package selfPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a word");
        String word=scan.next();
       String subFirst= word.substring(0,(word.length()/2+1));
       String subSecond= word.substring((word.length()/2+2));
       if(subFirst.equals(subSecond)){
           System.out.println(word);}else {
           System.out.println("did not right");}




    }
}

