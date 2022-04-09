package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {
    public static int[] reverse(int [] arr3){
       int []result= {};
        for (int i = arr3.length - 1; i >= 0; i--) {
         result= ArraysUtility.addElement(result,arr3[i]);
        }
        return result;
    }
}
