package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Replitx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for(int i=0; i<7; i++){
            System.out.println("Enter score for judge"+(i+1));
            score[i]=input.nextFloat();
        }
        System.out.println("Enter difficulty: ");
        double dif= input.nextDouble();
         Arrays.sort(score);
       score= Arrays.copyOfRange(score,1,6);
       float total=0;
        for (int i = 0; i < score.length; i++) {
            total+=score[i];
        }
       total*= dif*0.6;
        System.out.printf("Total: %.2f", total);

    }
}
