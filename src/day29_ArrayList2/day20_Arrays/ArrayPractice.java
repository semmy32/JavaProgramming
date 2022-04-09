package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
       char[] letters= new char[26];

        for (char i = 'A', j=0;  i<='Z' && j<letters.length ; i++, j++) {
            letters[j]=i;

        }System.out.println(Arrays.toString(letters));

        for (int i = 0, j='A'; i < letters.length; i++, j++) {
            letters[i]=(char) j;

        }

        System.out.println(Arrays.toString(letters));
        char ch='A';
        for (int k = 0; k < letters.length ; k++) {
            letters[k]=ch++;      /* or we can write for(int k=0; k<letters.length; i++, ch++ ){
                                      letters[k]=ch;*/

        }
        System.out.println(Arrays.toString(letters));


    }
}
