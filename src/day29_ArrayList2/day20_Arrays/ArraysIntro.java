package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String myGroup[] = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";   /*every element in the array is defined as index number,
        for ex index 0 is assigned for first name. Btw we write in first Array object the number of elements in braces.*/

        System.out.println(Arrays.toString(myGroup));



    }
}
