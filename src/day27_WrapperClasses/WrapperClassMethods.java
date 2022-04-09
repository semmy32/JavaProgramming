package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="123";
      int num=  Integer.parseInt(str);
        System.out.println(num+1); //124
        System.out.println(str+1); //1231

        long max= Long.MAX_VALUE; // we can find max and min values of primitives.
        long min= Long.MIN_VALUE;
        System.out.println("min = " + min);

        char ch1=55;
        boolean b=Character.isDigit(ch1);
        System.out.println(b);

        char ch2='Z';
        Character.isLetter(ch2);
    }
}
