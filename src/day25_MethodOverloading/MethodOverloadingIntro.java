package day25_MethodOverloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
       int [] intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);
       double [] doubleArray= {10.5, 2.3, 4.8};
       Arrays.sort(doubleArray);
       char [] charArray= {'E','S','M','R','A'};
       Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

    }
}
