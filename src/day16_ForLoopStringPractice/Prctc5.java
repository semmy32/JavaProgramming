package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Prctc5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("print cat and dog words");
        String word= scan.nextLine();
        int countCat=0;
        int countDog=0;
        word=word.replace(" ","");
        for (int i = 0; i <word.length()-3; i++) {
            if(word.substring(i, i+3).equalsIgnoreCase("cat")){
                countCat++;
            }else if(word.substring(i, i+3).equalsIgnoreCase("dog")){
                countDog++;
            }}
            if(countCat==countDog){
                System.out.println("true");
        }else {
                System.out.println("false");}



    }
}
/*write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true*/