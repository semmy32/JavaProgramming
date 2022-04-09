package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

       int num1 = 100;
       double num2 = 15.0;
       // 10 divide by 3 is equal to 3 with a remainder of 1
        double division = num1 / num2;   //division variable contains the result of num1 divided by num2
        double remainder = num1 % num2;
        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);
        System.out.println(num1 + " is divided by " + num2 + " is equal to " + division + " and has a remainder to " + remainder);

        System.out.println(25 % 5);
        System.out.println("----------------------------------------------");





    }
}
