package selfPractice;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        String ch= "*";
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();
        for (int i = 1; i <=number ; i++) {

            System.out.println(ch);
            ch+="*";


        }
    }
}

