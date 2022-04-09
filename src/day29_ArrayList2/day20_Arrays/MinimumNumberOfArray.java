package day29_ArrayList2.day20_Arrays;

public class MinimumNumberOfArray {
    public static void main(String[] args) {
    int numbers[]= {23,9,-200, 1,0 };
    int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }

        }

        System.out.println("min = " + min);


    }
}
