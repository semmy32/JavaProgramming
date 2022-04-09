package day21_ArrayPart2;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 7, 20, 1, 0};
        int max = numbers[0];
       /* for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }*/
        for(int number:numbers){
            if(number>max){
                max=number;
            }
        }
        System.out.println("max = " + max);



    }
}
