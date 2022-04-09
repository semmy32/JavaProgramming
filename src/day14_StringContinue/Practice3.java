package day14_StringContinue;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scan= new Scanner(System.in);
        String word= scan.next();
        scan.close();
        if(word.startsWith("x")){
            System.out.println(word.substring(1));}

    }
}
/*Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/