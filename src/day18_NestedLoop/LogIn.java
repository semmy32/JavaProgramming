package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username");
        String user=scan.next();
        System.out.println("Enter your password");
        String pass=scan.next();
        if(user.equals("Cydeo")&& pass.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            for (int i = 0; i <3; i++) {
                System.out.println("Invalid username or password");
                System.out.println("Enter username");
                 user=scan.next();
                System.out.println("Enter your password");
                pass=scan.next();
                if(user.equals("Cydeo")&& pass.equals("Cydeo123")){
                    System.out.println("Logged in");
                    break; }}


            if(!(user.equals("Cydeo")&& pass.equals("Cydeo123"))){
                System.err.println("Your account blocked!");}}
        }
    }

