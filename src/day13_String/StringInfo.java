package day13_String;
import java.lang.String; //Any clas in this package (java.lang) is imported implicitly.So we don't write this import line
import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        scan.close();
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        String initial= f+ "."+l;
        System.out.println("initial = " + initial);
    }
}