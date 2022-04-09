package day34_GarbageCollection_AccessModifier;
import static utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("---------------------------------");
       //find the sum of 10 and 200, we import just sum static method

        int r1=sum(10,200);
        int r2= sum(13,22);

        int r3= subtract(98,33);
        int r4= max(99,-1);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

    }


}
