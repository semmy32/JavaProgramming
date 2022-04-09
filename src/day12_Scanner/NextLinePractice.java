package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("please enter your age");
        int age= scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter your full name: ");
        String fullName= scan.nextLine();
        scan.close();
        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

/*After anyone of scanner methods (next, nextInt, nextDouble etc)
I should write extra scanner nextLine to write my exact nextLine statement
 */



    }
}
