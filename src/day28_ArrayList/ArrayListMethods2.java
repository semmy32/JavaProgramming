package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        Integer num=200;
        list.remove(num); // we return primitive to non primitive (object) then we can remove object like this way or we can write as a integer also
        System.out.println(list);

        list.clear();
        System.out.println(list); // it clears arraylist, now list has no element.

    }
}
