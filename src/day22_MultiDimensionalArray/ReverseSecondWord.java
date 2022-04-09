package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
       String word= "I love Java";
   String[] sentence=  word.split(" ");
   String result="";
        for (int i = sentence[1].length()-1; i >= 0; i--) {
            result+=sentence[1].charAt(i);
        }
        System.out.println(result);
        sentence[1]= result;
        System.out.println(Arrays.toString(sentence));

        String reversedSentence="";
        for (String s : sentence) {
            reversedSentence+=s+" ";

        }
        System.out.println("reversedSentence = " + reversedSentence);



    }
}
