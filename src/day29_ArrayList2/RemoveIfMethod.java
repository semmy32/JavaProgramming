package day29_ArrayList2;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);
        list.removeIf(p -> p<5);  //LAMBDA EXPRESSION
        System.out.println(list);
        System.out.println("----------------------------------");
        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each -> each%2==0);  //we can give any variable name in lambda expression, it expresses each element in arraylist
        System.out.println(list2);

        System.out.println("-----------------------------------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Mary", "Peter", "Heidi","Racecar", "Eye"));
        names.removeIf(p-> !StringUtility.isPalindrome(p));
        System.out.println(names);

    }
}
