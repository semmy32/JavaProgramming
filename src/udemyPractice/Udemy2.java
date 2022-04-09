package udemyPractice;

import java.util.Scanner;

public class Udemy2 {
    public static void main(String[] args) {
       String p="shark50";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your password");
        p=scan.next();
        System.out.println("ACCESS APPROVED");
        while(!(p.equals("shark50"))){
            System.out.println("Invalid password try again");
            p=scan.next();
        }
    }
}
/*Write a program which asks the user for a password. Make the password “shark50”.
 Each time the user enters the password incorrectly,
 prompt them for a password again. When the user enters the password correctly, print “ACCESS APPROVED”.
 */