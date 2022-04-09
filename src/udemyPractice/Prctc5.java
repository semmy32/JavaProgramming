package udemyPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Prctc5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your top five foods:");
        String[] fav=new String[3];
        for (int i = 0; i < fav.length; i++) {
            System.out.println("Your "+(i+1)+". choice is: ");
            fav[i]=scan.nextLine();
        }
        System.out.println("No more memory available");
        System.out.println("your fav foods are "+ Arrays.toString(fav));




    }
}
 /*   Write a program which asks the user to enter their top five favourite foods and store their answers
  in a string array. However, create the array so it can only hold a maximum of three strings.
        After the user enters the third item, print “No more memory available.”, then print out the contents of the array.

  */