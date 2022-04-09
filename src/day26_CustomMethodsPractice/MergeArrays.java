package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1= {1,2,3,4};
        int[] a2= {5,6};
      int[] result=  merge(a1,a2);
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------");
        String [] ass={"A","B","C"};
        String [] boss={"D", "E","F","G"};
       String [] coss=mergeArray(ass,boss);
        System.out.println(Arrays.toString(coss));
    }
    // merge given two arrays and returns the new array
    public static int [] mergeArray(int[] arr1, int [] arr2){
        int [] result= {};
        for (int each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    public static double [] mergeArray(double[] arr1, double [] arr2){
        double [] result= {};
        for (double each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    public static char [] mergeArray(char[] arr1, char [] arr2){
        char [] result= {};
        for (char each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    public static String [] mergeArray(String[] arr1, String [] arr2){
        String [] result= {};
        for (String each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static int[] merge(int[] arr1, int [] arr2){
        int [] result= new int[arr1.length+ arr2.length];
        int i=0;
        for (int each : arr1) {
        result[i++]= each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
        return result;

    }
}
