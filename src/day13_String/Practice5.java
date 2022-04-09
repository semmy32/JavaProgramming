package day13_String;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter username");
        String user= scan.next();
        scan.nextLine();
        System.out.println("Enter your password");
        String pass= scan.nextLine();
        String username= "Cydeo";
        String password= "WoodenSpoon";
        if(user.equals(username)&& pass.equals(password) ){
            System.out.println("Logged in");} else{
            System.out.println("Incorrect username or password");}
     scan.close();



    }
}
/*You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method*/