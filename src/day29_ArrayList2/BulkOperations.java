package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
       //Bulk operations are only for collection types.
       Integer [] arr= {1,2,3,4,5,6,7};
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr)); //we can use asList method with non primitives
        System.out.println(list);
        System.out.println("-----------------------------------------------");

        int [] arr2={1,2,3,4,5,6,7};
        ArrayList<Integer> list2= new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println(list2);

    }
    public static ArrayList<Integer> convertArrayToArrayList(int [] array){ // if we use primitive array; then we can convert this way
        ArrayList<Integer> list= new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
