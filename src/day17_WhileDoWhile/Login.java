package day17_WhileDoWhile;

import java.util.Scanner;

public class Login
{
    public static void main(String[] args) {
       String userName= "Cydeo";
       String passWord= "Cydeo123";
        System.out.println("Log in your username and password");
        Scanner scan= new Scanner(System.in);
        String user= scan.next();
        String password= scan.next();
        if(user.equals(userName) && password.equals(passWord)){
            System.out.println("Logged in");
        } else {

            int attempt=3;
            while(!(user.equals(userName) && password.equals(passWord)) && attempt>0){
                System.out.println(" Rewrite your username and password");
                user= scan.next();
                password= scan.next();
                attempt--;}
                if(user.equals(userName) && password.equals(passWord)){
                    System.out.println("Logged in");
            }else {
                    System.out.println("Your account locked!");
        }
}   scan.close();
    }}
