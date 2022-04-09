package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Write your fav football team in TR");
        String football= scan.next();
        System.out.println("Write your fav fruit");
        String fruit= scan.next();
        char f1= football.charAt(0);
        char f2=fruit.charAt(0);
        String initial= f1+ "."+f2;
        System.out.println(initial.toUpperCase());



    }
}
/*write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
*/