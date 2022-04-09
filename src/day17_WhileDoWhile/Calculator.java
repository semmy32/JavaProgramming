package day17_WhileDoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=scan.nextInt();
        System.out.println("enter second number");
        int num2=scan.nextInt();
        System.out.println("enter a math operator");
        char mathOp= scan.next().charAt(0);


       while (!(mathOp=='+' || mathOp== '-')){
            System.out.println("invalid operator, please re-enter");
            mathOp=scan.next().charAt(0);
        }
        System.out.println((mathOp=='+')? num1+num2 : num1-num2);



    }
}
