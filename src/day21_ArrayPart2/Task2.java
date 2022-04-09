package day21_ArrayPart2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
     int [] num={1,2,3,4,5};
        int [] rev=new int[5];
        for (int i = num.length - 1, j=0; i >= 0; i--, j++) {
            rev[j]=num[i];

        }
        System.out.println("Reversed array = "+ Arrays.toString(rev));
    }
}
/*
	5.  Write a program that can reverse an array of integers and returns it as new array
            ex:
            array = {1,2,3,4,5};

            output:
            reversedArray = {5,4,3,2,1};

 */