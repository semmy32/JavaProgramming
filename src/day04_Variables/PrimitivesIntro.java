package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // age:38 years old
        byte age = 38;
        //weight: 160 pounds
      //  byte weight = 160; 160 is out of byte range

        short weight = 160; // 160 is within the range of short
        // salary: 100000 $ is out of the range short,
        int salary = 100_000; // preferred data type for integer numbers,
        // which is the most used primitive type for numbers in java world.

        long asset = 3_000_000_000L; // we use l or L for long primitive java type.
        //  If I don't add "l" computer thinks it as int, computer takes all numbers as int version.

        // for decimal numbers, we occasionally use "double".
        double tax = 0.26;
        System.out.println("weight = " + weight);

        //#
         char ch1 = '#';
         char ch2 = 35;
         char ch3 = 500;
        System.out.println("ch3 = " + ch3);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch1 = " + ch1);

       // boolean: true/false
       boolean result = 100 > 300;
        System.out.println("result = " + result);
        //DATA TYPE + VARIABLE NAME + DATA
        char ch5 = 's';
        char ch6 = 'n';
        char ch7 = 'e';
        char ch8 = 'w';
        System.out.println("ch5 = " + ch5);
        System.out.println("ch6 = " + ch6);
        System.out.println("ch7 = " + ch7);
        System.out.println("ch8 = " + ch8);

        /* int: for integers
        char: for single characters ' '
        double: for decimal numbers
        boolean: for true/false
        String : for non primitives " "
         */



    }
}

