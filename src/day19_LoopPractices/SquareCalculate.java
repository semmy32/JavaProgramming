package day19_LoopPractices;

import java.util.Scanner;

public class SquareCalculate {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String answer="";
   do {
       System.out.println("Enter the side of the square:");
       int side = scan.nextInt();
       if (side <= 0) {
           System.err.println("Invalid Entry for the side of the square");
           System.exit(0);
       }
       System.out.println("Area of the square is " + (side * side));
       System.out.println("Perimeter of square is " + (side * 4));
       System.out.println("Would you like to calculate another Square?");
        answer = scan.next();
       while (!(answer.equals("yes") || answer.equals("no"))) {
           System.out.println("Invalid entry, re-type again");
           answer = scan.next();
       }
       if (answer.equals("no")) {
           System.out.println("Thank you for using Cydeo Square Calculator APP");
       }
   } while(answer.equals("yes"));



    }
}
/*Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after
               displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

*/