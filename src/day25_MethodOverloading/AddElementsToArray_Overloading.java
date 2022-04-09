package day25_MethodOverloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
   int[] numbers={1,2,3,4,5,6};
  numbers= addElement(numbers,7);
  char [] chars={'A','B','C','D'};
  chars=addElement(chars,'E');
  String [] names={"Semra", "Ali", "Mustafa", "Harun"};
  names=addElement(names,"Havva");
        System.out.println(Arrays.toString(names));

    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
}
