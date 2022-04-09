package day21_ArrayPart2;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        String [] students= {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron","Daniel"};
        String [] earlybirds= Arrays.copyOf(students,4);
        System.out.println(Arrays.toString(earlybirds)); //It starts from beginning
        //if I write like this:
        earlybirds=Arrays.copyOf(students,15);
        System.out.println(Arrays.toString(earlybirds)); // ı get "null" after first arrays' length.
        System.out.println("-----------------------------------------------------");

        char [] ch1= {'A', 'B', 'C', 'D', 'E', 'F', 'G','H'};
        char [] ch2= Arrays.copyOfRange(ch1, 2,6);
        System.out.println(Arrays.toString(ch2));



    }
}
