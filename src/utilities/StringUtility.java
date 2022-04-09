package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the string
   public static void printEachCharacter(String str){
       for (int i = 0; i <str.length() ; i++) {
           System.out.println(str.charAt(i));
       }

   }

   //returns the given string and returns the reversed string
   public static String reverse(String str){
       String result="";
       for (int i = str.length()-1; i >=0 ; i--) {
           result+=str.charAt(i);
       }

       return result;
   }

   // checks if the given string is palindrome, returns boolean
   public static boolean isPalindrome(String str) {
       return reverse(str).equalsIgnoreCase(str);
   }
       //checks if the given string is anagram, returns boolean

    public static boolean anagram(String str1, String str2) {// "acb", "bca"
       char[] ch1=str1.toCharArray();
       char [] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

   }

   //removes the duplicates from given string, returns String. "aaaaabbccd"----->"abcd"
public static String removeDuplicates(String str){
    String result="";
    for (int i = 0; i <str.length(); i++) {
        char each=str.charAt(i);

        if(!result.contains(""+each)){
            result+= each;
        }
    }
    return result;


}

    public static boolean isStrongPassword (String password){

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char[] chars= password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2=true;
            } else if(Character.isLowerCase(each)){
                r3=true;
            }else if(Character.isDigit(each)){
                r5=true;
            } else{ // special char
                r4=true;
            }
        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);

        return isStrongPassword;
    }



}
