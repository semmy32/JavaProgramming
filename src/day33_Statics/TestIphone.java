package day33_Statics;

public class TestIphone {
    public static void main(String[] args) {

        System.out.println(Iphone.operatingSystem);

       /*When we call instance variables or methods, we call them with the object we created. But we call static variables or methods by class name and the variable/ method. For, instance methods, we use both instance and static variables; but for static methods, we use ONLY static variables. IF WE USE INSTANCE VARIABLE, WE MUST USE INSTANCE METHOD.
       Object shares what the class has, but class doesn't share what the object has.
      */

        Iphone.printOperatingSystem();





    }


}
