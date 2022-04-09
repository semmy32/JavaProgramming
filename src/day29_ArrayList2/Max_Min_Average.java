package day29_ArrayList2;

import java.util.ArrayList;

public class Max_Min_Average {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int max=list.get(0);
        for (Integer each : list) {
            if(each>max){
                max=each;
            }
        }

        int min= list.get(0);
        for (Integer each : list) {
            if(each<min){
                min=each;
            }
        }
        int sum=0;
        for (Integer each : list) {
            sum+=each;
        }
        double average= (double)sum/list.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
