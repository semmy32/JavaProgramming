package day17_WhileDoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please write your age");
        int age= scan.nextInt(); // valid age: 1-120
        while(!(age>0 && age<=120)){
            System.err.println("Invalid age, enter again");
        age=scan.nextInt();
        }
        System.out.println("Are you a US citizen? y/n");
        String citizen= scan.next().toLowerCase();
        while(!(citizen.equals("yes")|| citizen.equals("no"))){
            System.err.println("Invalid answer enter again");
            citizen=scan.next();
        }
        if(age>=18 && citizen.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");}




}}
