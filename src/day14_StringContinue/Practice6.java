package day14_StringContinue;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        System.out.println("enter an account number");
        String account= new Scanner(System.in).nextLine();
        char ch1= account.charAt(0);
        String result="";
        int num=account.length();

        if(ch1=='2'|| ch1=='5') {
            if((ch1=='2' && num==7) || (ch1=='5' && num==10)){
            result= account;}
        else { result="ınvalid account number" ;}

        System.out.println(result);


    }
}}
/*Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”*/