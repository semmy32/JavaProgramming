package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //26 characters in separate indexes
        char[] alphabet = new char[26];
       /*
        alphabet[0] = 'Z'; //90
        alphabet[1] = 'Y';// 89
        alphabet[2] = 'X'; //88
        ...
        */
        char ch='Z';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch--;

        }
        System.out.println(Arrays.toString(alphabet));



    }
}

