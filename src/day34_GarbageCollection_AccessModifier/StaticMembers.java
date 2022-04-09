package day34_GarbageCollection_AccessModifier;

public class StaticMembers {  //Outer classes can not be static, inner class can be
    static class class1{   //static class can be applied with nested class

    }


    public static int num=100;
    public static void method(){

    }
    static {
        System.out.println("Work smart and hard!");
    }

    public static void main(String[] args) {
        System.out.println(num);
    }


}
