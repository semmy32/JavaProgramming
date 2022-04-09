package day14_StringContinue;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter your email");
        String email= scan.nextLine();

        if(email.contains("_")){
           email= email= email.substring(email.indexOf("_")+1,email.indexOf("@"))+
                    "_"+ email.substring(0,email.indexOf("_"))+ email.substring(email.indexOf("@"));
            System.out.println(email);
        }else {
            System.out.println(email);}


    }
}
/*Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
*/