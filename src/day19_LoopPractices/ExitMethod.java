package day19_LoopPractices;

import java.util.Scanner;

public class ExitMethod {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=scan.nextInt();

        System.out.println("Enter a math operator");
        char operator= scan.next().charAt(0);
        if(!(operator=='+' || operator=='-')){
            System.out.println("Invalid math operator "+ operator);
            System.exit(0);
        }

        System.out.println("Enter a number");
        int num2= scan.nextInt();
        scan.close();
        if(operator=='+'){
        System.out.println("Result is= "+(num1+num2));}
        else {
            System.out.println("Result is "+ (num1-num2));}

    }}
