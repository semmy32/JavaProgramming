package day15;

import java.util.Scanner;

public class Prctc3 {
    public static void main(String[] args) {
      int sum=0;
      int num= new Scanner(System.in).nextInt();
        for (int i = 1; i <=num; i++) {
            sum+=i;}
        System.out.println("sum = " + sum);

    }
}
/*write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275 */