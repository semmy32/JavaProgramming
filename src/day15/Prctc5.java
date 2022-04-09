package day15;

import java.util.Scanner;

public class Prctc5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a word");
        String str= scan.next();
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if(ch>='0' && ch<='9'){
                sum+= ch-48;}
        }
        System.out.println(sum);

    }
}
/*Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...*/