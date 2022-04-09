package day14_StringContinue;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("enter two words");
        Scanner scan= new Scanner(System.in);
        String str1=scan.next(),
                str2= scan.next();
        if(str1.charAt(str1.length()-1)== str2.charAt(0)){
            System.out.println(str1+ (str2.substring(1)));}



    }
}/*Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight*/
