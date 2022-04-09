package day21_ArrayPart2;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
       String str1="acdb";
       String str2= "dbca";
       char [] ch1= str1.toCharArray();
       char [] ch2=str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        System.out.println("----------------------------------");

        Arrays.sort(ch1); //{a,b,c,d}
        Arrays.sort(ch2); //{a,b,c,d}
        boolean isAnagram= Arrays.equals(ch1,ch2);
        System.out.println("isAnagram = " + isAnagram);





    }
}
