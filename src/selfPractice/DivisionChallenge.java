package selfPractice;

import java.util.Scanner;

public class DivisionChallenge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int count=0;
        do{ num1-=num2;
            count++;}
        while(num1>num2 &&num2>0);
        System.out.println("num1 divided by num2 is: "+count+ " remainder is: "+num1);


    }
}
