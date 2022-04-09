package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] nums2 = new int[size * 2];
        for (int i = 0; i < size * 2; i++) {
            nums2[i] = 0;
            if (i == size * 2 - 1) {
                nums2[i] = nums[size - 1];
            }

        }

        System.out.println(Arrays.toString(nums2));
    }
}


