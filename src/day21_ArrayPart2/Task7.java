package day21_ArrayPart2;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
    int [] arr1 = {30, 10, 20};
    int[] arr2 = {15, 40, 25, 35};
    int [] arr3 = {8, 9, 17, 5, 4, 1};
    int[] comm=new int[13];
       int i=0;
        for (int each : arr1) {
            comm[i++]=each;
        }
        for (int each : arr2) {
            comm[i++]=each;
        }
        for (int each : arr3) {
            comm[i++]=each;

        }

        System.out.println(Arrays.toString(comm));

    }
}
/*Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}

 */