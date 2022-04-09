package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int num1= 200;
        Integer n1=num1; //Autoboxing
        int num2= n1; //unboxing
        System.out.println("------------------------------");

        Integer integerValue=100;
        long longValue= integerValue;  // we can convert an object to whatever class we want.
        System.out.println("---------------------------");

        int num3= 200;
        //Long l2=num3;
        Integer num4= num3; //autoboxing

    }
}
