package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        for(String each:words){
            String firstAndLast="";
            firstAndLast+= each.charAt(0);
            firstAndLast+=each.charAt(each.length()-1);
        }

    }
}
