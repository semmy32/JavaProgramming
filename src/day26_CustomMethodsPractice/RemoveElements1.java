package day26_CustomMethodsPractice;

public class RemoveElements1 {

    //removes the index from element
    public static int[] removeElement(int[] array, int index){
        if(index<0 || index> array.length-1 ){
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









    /*2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}
			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */

}
