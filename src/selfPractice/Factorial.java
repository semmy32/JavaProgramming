package selfPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int count=1;
            for (int i=n; i>0; i--) {
                count*=i;
                System.out.print(i+" * ");
            }
            System.out.println("\b\b");
            System.out.println(count);


        }

    }



