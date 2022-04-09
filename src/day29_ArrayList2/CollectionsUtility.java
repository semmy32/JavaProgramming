package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);

        System.out.println("------------------------------------");
        ArrayList< Character> list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("-----------------------------------------------");

 String [] names= {"Mary", "monica", "Mihri", "Musti", "Sumeyra"," Hasan", "Beril"};
 ArrayList<String> list3=new ArrayList<>(Arrays.asList(names));
 list3.removeIf(p-> p.startsWith("M")); //or p-> p.charAt(0)=='M'
        System.out.println(list3);
   names=list.toArray(new String[0]); // Sometimes we need to convert arraylist to array, we do like his way

    }
}
