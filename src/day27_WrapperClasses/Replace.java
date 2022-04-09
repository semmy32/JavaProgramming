package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
       arr= replace(arr,3,30);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] replace(int [] array, int indexNumber, int newElement){
        if(indexNumber<0 || indexNumber> array.length-1){
            System.err.println("Invalid index: "+indexNumber);
            System.exit(0);
        }
        array[indexNumber]=newElement;
        return array;
    }
    public static double [] replace(double [] array, int indexNumber, double newElement){
        if(indexNumber<0 || indexNumber> array.length-1){
            System.err.println("Invalid index: "+indexNumber);
            System.exit(0);
        }
        array[indexNumber]=newElement;
        return array;
    }
    public static char [] replace(char [] array, int indexNumber, char newElement){
        if(indexNumber<0 || indexNumber> array.length-1){
            System.err.println("Invalid index: "+indexNumber);
            System.exit(0);
        }
        array[indexNumber]=newElement;
        return array;
    }
    public static String [] replace(String [] array, int indexNumber, String newElement){
        if(indexNumber<0 || indexNumber> array.length-1){
            System.err.println("Invalid index: "+indexNumber);
            System.exit(0);
        }
        array[indexNumber]=newElement;
        return array;
    }
}
