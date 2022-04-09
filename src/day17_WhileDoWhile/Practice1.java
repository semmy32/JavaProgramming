package day17_WhileDoWhile;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int sum= num1+num2;
        System.out.println("sum = " + sum);
        System.out.println("Do you want to continue?");
        String answer= scan.next();
        while(answer.equals("yes")){
            System.out.println("Enter two numbers");
            num1= scan.nextInt();
            num2= scan.nextInt();
            sum= num1+num2;
            System.out.println("sum = " + sum);
            System.out.println("Do you want to continue?");

        }
    }
}
