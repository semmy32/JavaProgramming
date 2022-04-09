package day34_GarbageCollection_AccessModifier;

public class AccessModifiers {
    public static int publicData=100;
    static int defaultData= 200;// no access modifier
    private static int privateData= 300;

    public static void method1(){
        System.out.println("public");}

        static void method2 (){
        System.out.println("Default");}

    private static void method3(){
        System.out.println("Private");

    }

}
