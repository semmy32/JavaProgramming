package day21_ArrayPart2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
      int [] numbers= {10,20,30,40,50};
      int [] reversed= new int[numbers.length];// to make sure that new array has enough capacity

        for(int i=numbers.length-1, j=0; i>=0; i--,j++){
            reversed[j]= numbers[i];
        }

        System.out.println(Arrays.toString(reversed));



    }
}
