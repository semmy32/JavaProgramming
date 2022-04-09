package utilities;

import java.util.Arrays;

public class ArraysUtility {
    // prints each element array in separate lines
    public static void printEachElement(int [] array){
        for (int each : array) {
            System.out.println(each);
            
        }
    }

    //prints each element of double array in separate line
    public static void printEachElement(double [] array){
        for (double each : array) {
            System.out.println(each);

        }
    }

    //prints each element of char array in separate lines
    public static void printEachElement(char [] array){
        for (char each : array) {
            System.out.println(each);

        }
    }

    //prints each element of String array in separate lines
    public static void printEachElement(String [] array){
        for (String each : array) {
            System.out.println(each);

        }
    }
    
    //returns the max number of integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    
    //checks if the given integer contained in the given array, contains method, return boolean
    public static boolean contains(int[] array, int number){
        boolean result=false;
        for (int each : array) {
            if(each==number){ //if any element is matching with the given element
                result=true;
            }
            
        }
        return result;
        
        
    }

    public static boolean contains(double[] array, double number){
        boolean result=false;
        for (double each : array) {
            if(each==number){
                result=true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char number){
        boolean result=false;
        for (char each : array) {
            if(each==number){
                result=true;
            }

        }
        return result;
    }

    public static boolean contains(String[] array, String number){
        boolean result=false;
        for (String each : array) {
            if(each==number){
                result=true;
            }
        }
        return result;
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

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
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

    public static int frequencyOfElement(int[] array, int element){
//returns the frequency of the given element from the given array
        int count=0;
        for (int each : array) {
            if(each==element){
                count++;  }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element){
//returns the frequency of the given element from the given array
        int count=0;
        for (double each : array) {
            if(each==element){
                count++;  }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element){
//returns the frequency of the given element from the given array
        int count=0;
        for (String each : array) {
            if(each.equals(element)){
                count++;  }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){
//returns the frequency of the given element from the given array
        int count=0;
        for (char each : array) {
            if(each==element){
                count++;  }
        }
        return count;
    }

    // returns the uniq elements from the array
    public static int [] uniqueElements(int[] array){
        int[] result={}; //new int[0]
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is 1, element is unique
                result= ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    public static double [] uniqueElements(double[] array){
        double[] result={};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is 1, element is unique
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static char [] uniqueElements(char[] array){
        char[] result={};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is 1, element is unique
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static String [] uniqueElements(String[] array){
        String[] result={};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is 1, element is unique
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static int[] removeElement(int[] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }
        int[] result= new int[array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if(i==index){ // if the element is matching with the element at the given index
                continue;
            }
            result[j++]=array[i];
        }
        return result;

    }

    public static double [] removeElement(double[] array, int index){
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

    public static char[] removeElement(char[] array, int index){
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

    public static int [] mergeArray(int[] arr1, int [] arr2){
        int [] result= {};
        for (int each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static double [] mergeArray(double[] arr1, double [] arr2){
        double [] result= {};
        for (double each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static char [] mergeArray(char[] arr1, char [] arr2){
        char [] result= {};
        for (char each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static String [] mergeArray(String[] arr1, String [] arr2){
        String [] result= {};
        for (String each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static int [] reverseArray(int [] arr){
        int [] result= new int[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }

    public static double [] reverseArray(double [] arr){
        double [] result= new double[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }

    public static char [] reverseArray(char [] arr){
        char [] result= new char[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }

    public static String [] reverseArray(String [] arr){
        String [] result= new String[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }

    //replace the element of the index at given array
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

    /*This method allows us to replace one element to another. we check array if old value repeats,
     then method changes all of them to new value
     */
    public static int [] replaceAll(int [] array, int oldValue,int newValue){
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    public static double [] replaceAll(double [] array, double oldValue,double newValue){
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    public static char [] replaceAll(char [] array, char oldValue,char newValue){
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    public static String [] replaceAll(String [] array, String oldValue,String newValue){
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }

    // If we want to remove duplicates from an array, we use this method
    public static int [] removeDuplicates(int [] array){
        int result[]={};
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double [] removeDuplicates(double [] array){
        double result[]={};
        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char [] removeDuplicates(char [] array){
        char result[]={};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String [] removeDuplicates(String [] array){
        String result[]={};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }





}
