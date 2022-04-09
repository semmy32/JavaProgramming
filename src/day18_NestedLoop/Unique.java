package day18_NestedLoop;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a text to find uniq letters");
        String str=scan.nextLine();
        int count=1;
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i);
            if(str.substring(i+1).contains(ch)){
                count++;} else{
                result+=""+ch;}

        }
        System.out.println("result = " + result);


    }
}
/* Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
            then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique*/