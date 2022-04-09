package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {
        int num1 = 25;
        int num2= -25;

        int a = 100;
        System.out.println(++a);

        int b = 1000;
        System.out.println(b++);
        System.out.println(b);
        /*
        always predecrement and preincrement operators acts immedeately,
        but post decrement/increment acts second line of sout.
         */
        int s= 100;
        System.out.println(s++);
        System.out.println(s--);
        System.out.println(s);

        int q = 30;
        System.out.println(--q); //29 q=29
        System.out.println(q--); //29  q=28
        System.out.println(q); //28  q= 28








    }
}
