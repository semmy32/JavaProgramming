package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(); //if I don't add element, now it has 0 element.
        students.add("Semra");
        students.add("Harun");
        students.add("Mustafa");
        students.add("Ali");
        students.add(1, "Seda"); //when I add with index number, elements shifted.
        students.add(5, "Havva");//if I insert index number for ex 15, it gives compile error

        System.out.println(students);

        System.out.println(students.size()); //we use size method to find the size of arrayList.
        int lastIndex = students.size() - 1;

        String s = students.get(4); // get method gives us the element selected with index number.
        System.out.println(s);
        System.out.println("-----------------------------------------");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("--------------------------------------");

        ArrayList<String> list= new ArrayList<>(); //set method replace the element with new one. we write element's who changed index number
        list.add("Java");
        list.add("Phyton");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript");
        System.out.println(list);

        System.out.println("*****************************");
           ArrayList<String> employees= new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ceylin");
        employees.add("Sermin");

        employees.remove(3); //it removes the element whom we write index number
        System.out.println(employees);
        boolean r1= employees.remove("Ceylin"); /* it removes String element (non primitive) from list. If it is object'
        then we can assign it as a boolean */
        System.out.println(employees);


    }
}
