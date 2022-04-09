package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;

public class Months {
    public static void main(String[] args) {

        String month[]= {"january", "february","march", "april",
                "may", "june", "july", "august", "september", "october", "november","december" };

        /*int num= 4; // num should be 1-12
        System.out.println( month[num] ); //don't forget that index number starts from 0.*/

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);


            System.out.println("--------------------------------");
            for (int j = month.length-1; j>=0; j--) {
                System.out.println(month[j]);

            }

        }

    }
}
