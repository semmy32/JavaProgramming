package day21_ArrayPart2;

import java.util.Arrays;

public class MergetwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5
        String [] both= new String[3+5]; //8

        int i=0;
        for (String each : group1) {
            both[i++]=each;
        }

        for (String each : group2) {
            both[i++]=each;

        }
        System.out.println(Arrays.toString(both));

    }
}
