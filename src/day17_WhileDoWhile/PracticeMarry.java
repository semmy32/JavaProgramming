package day17_WhileDoWhile;

import java.util.Scanner;

public class PracticeMarry {
    public static void main(String[] args) {
        System.out.println("Will you marry me?");
        Scanner scan= new Scanner(System.in);
        String answer= scan. next();

        while(!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid answer again");
            answer=scan.next();
            }
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations!"); }
        else if(answer.equalsIgnoreCase("no")) {
            System.out.println("Goodbye");




    }
}}
