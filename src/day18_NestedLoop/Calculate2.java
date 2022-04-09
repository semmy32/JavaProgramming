package day18_NestedLoop;

import java.util.Scanner;

public class Calculate2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter a math character");
        char math=scan.next().charAt(0);
        while(!(math=='+' || math=='-' || math=='/' || math=='*')){
            System.out.println("Invalid operator, re-type again");
            math=scan.next().charAt(0);
        }
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        double result=(math=='+')? num1+num2 :(math=='-')? num1-num2 :(math=='*')? num1*num2 :num1/num2;
        System.out.println("result= "+result);
            System.out.println("do you want to continue?");
            String contin= scan.next();
            while (!(contin.equals("yes") || contin.equals("no"))){
                System.out.println("Invalid answer, try again");
                contin= scan.next();
            }
            if(contin.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }
}}
/*Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry*/