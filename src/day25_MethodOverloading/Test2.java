package day25_MethodOverloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("****************************");
        double[] arr2 = {1.2, 2.3, 3.4, 4.5, 5.6};
        ArraysUtility.printEachElement(arr2);
        System.out.println("*****************************");

        char[] arr3 = {'A', 'L', 'I', 'A', 'S', 'K'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("***************************");

        String[] arr4 = {"Semra", "Ali", "Mutlu", "Yuvamiz", "Daim", "Olsun"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("***************************");
        int[] a1={1,2,3,4,67,54};
       boolean r1= ArraysUtility.contains(a1,54);
        System.out.println("r1 = " + r1);
    }

}
