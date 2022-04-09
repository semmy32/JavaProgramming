package day21_ArrayPart2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] num1={1,2,3,4,5};
        int [] num2={4,5,6,7,8};


        for (int each : num1) {
            for (int value : num2) {
                if(each==value){
                    System.out.print(each+" ");
                }
                
            }

        }


    }
}
/*Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


 */