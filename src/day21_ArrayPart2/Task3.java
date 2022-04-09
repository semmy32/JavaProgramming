package day21_ArrayPart2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] zeroAtEnd = new int[nums.length];
        int i = 0;
        for (int each : nums) {
            if (each != 0) {
                zeroAtEnd[i++] = each;
            }
        }
        System.out.println(Arrays.toString(zeroAtEnd));
    }
}
/*write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */