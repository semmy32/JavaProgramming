package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
      String word= "Civic";
      String reversed="";
        for (int i = word.length()-1; i >=0; i--) {
            reversed+= word.charAt(i);
        }
        boolean isPalindrome= word.equalsIgnoreCase(reversed);
        System.out.println(isPalindrome);



    }
}
/* Java!= avaJ (not palindrome)
Anna==> annA
first reverse after equalsIgnoreCase
 */
