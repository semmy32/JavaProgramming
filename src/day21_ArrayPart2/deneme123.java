package day21_ArrayPart2;

import java.util.Scanner;

public class deneme123 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String email = scan.next();
        if(email.contains("_")) {
            int name = email.indexOf('_');
            String first = email.substring(0, name);
            String last = email.substring(name + 1, email.lastIndexOf('@'));
            String browser = email.substring(email.lastIndexOf('@'));
            System.out.println(last+"_"+first+browser);
        } else {
            System.out.println(email);
                }
            }
        }


