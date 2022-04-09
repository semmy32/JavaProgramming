package day21_ArrayPart2;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
       String str="java";
       char [] chr=str.toCharArray();
        System.out.println(Arrays.toString(chr));
       for(char each: chr){
           System.out.println(each);
       }

    }
}
