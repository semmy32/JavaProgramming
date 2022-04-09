package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       /* System.out.println("Enter true or false: ");
        boolean result= scan.nextBoolean(); */
        System.out.println("Enter your full name: ");
        String fullname= scan.nextLine();
        System.out.println("Enter your programming language: ");
        String progLanguage= scan.nextLine();
        System.out.println("Enter your age: ");
        int age= scan.nextInt();

        scan.nextLine();  //I MUST WRITE THIS NEXTLINE TO CAPTURE "ENTER" KEY, OTHERWISE I COULDN2T PROVIDE SCHOOLNAME
        System.out.println("Enter your school name: ");
         String schoolName= scan.nextLine();

        System.out.println("fullname = " + fullname);
        System.out.println("progLanguage = " + progLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);




    }
}
