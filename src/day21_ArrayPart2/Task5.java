package day21_ArrayPart2;

public class Task5 {
    public static void main(String[] args) {
        int[] num= {1,2,12,34,23,209,22,32,11};
        int countOdd=0;
        int countEven=0;
        for (int each: num) {
            if(each%2==0){
                countEven++;
            } else{
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);


    }
}
/* Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop


 */