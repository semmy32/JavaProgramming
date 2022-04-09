package day34_GarbageCollection_AccessModifier;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;

    public Circle(double radius){  //we define instance variables in constructor.
        this.radius=radius;
        //pi=3.14;
    }
    static {  //we can't write instance variable in static method, we use static variable
       pi=3.14;
       name="Circle";
       numbers=new ArrayList<>();
       numbers.add(10);
       numbers.add(13);
    }
    //if setting static variable in one step, we can do it at first initialising, if it requires more steps to initialise then we use static block to set.

}
