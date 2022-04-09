package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
       int [] num= new int[100];
        for (int i = 0; i < num.length; i++) {
          num[i]=i+1;
        }
        System.out.println(Arrays.toString(num));



    }
}
//create an array that has the numbers 1 to 100