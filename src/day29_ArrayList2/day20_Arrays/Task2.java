package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
  int []num=new int[100];
  int num1=100;
        for (int i =0; i < num.length; i++) {
            num[i]= num1--;
        }
        System.out.println(Arrays.toString(num));


    }
}
//create an array that has the numbers 100 to 1
