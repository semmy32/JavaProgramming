package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Prctc3 {
    public static void main(String[] args) {
        System.out.println("enter two positive numbers");
        Scanner scan= new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int mult=0;
        if(num1>=0&&num2>=0){
            for (int i = 0; i < num1; i++) {
                mult += num2;
            }
            System.out.println(num1 + "*" + num2 + "=" + mult);
        }else
            System.out.println("invalid");
        scan.close();
    }
}



/*Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200*/