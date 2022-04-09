package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static int [] removeElement(int[] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }
        int [] result= {};

        for (int i = 0; i < array.length; i++) {
            if(i!= index){
                result= ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;

    }
    public static double [] removeElement(double[] array, double index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }
        double [] result= {};

        for (int i = 0; i < array.length; i++) {
            if(i!= index){
                result= ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;

    }
    public static char[] removeElement(char[] array, char index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }
        char[] result= {};

        for (int i = 0; i < array.length; i++) {
            if(i!= index){
                result= ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;

    }
    public static String[] removeElement(String[] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }
        String[] result= {};

        for (int i = 0; i < array.length; i++) {
            if(i!= index){
                result= ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;

    }
}
