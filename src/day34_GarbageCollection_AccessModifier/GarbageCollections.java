package day34_GarbageCollection_AccessModifier;
import day32_Constructors2.Car;
import day30_CustomClasses.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollections {
    public static void main(String[] args) {

    String str= "Wooden Spoon";// wooden spoon will be eligible for garbage collector now.
    str=null;
        System.out.println(str);

        Car car1= new Car("toyota");
        System.out.println(car1);
        car1=null;    //now this object is eligible to garbage collector.

        System.out.println("----------------------------------------");

        Dog dog1= new Dog();
        dog1.name= "lessi";

        dog1=new Dog();  //now first dog(lessi) is eligible for garbage collection
        dog1.name= "Max";
        System.out.println(dog1);

        System.out.println("------------------------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(20);

        ArrayList<Integer> list2= list1;
       list2.addAll(Arrays.asList(30,40,50));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1== list2);
        System.out.println("----------------------------------------------------");


    }
}
