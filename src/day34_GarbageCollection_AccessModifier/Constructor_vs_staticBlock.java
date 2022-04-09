package day34_GarbageCollection_AccessModifier;

public class Constructor_vs_staticBlock {  //This will executed first
    static {
        System.out.println("Static block");
    }

    public Constructor_vs_staticBlock() {    //without creating object; this method wouldn't executed!
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");   //This will executed second

        new Constructor_vs_staticBlock();
        new Constructor_vs_staticBlock();
        new Constructor_vs_staticBlock();
        new Constructor_vs_staticBlock();  /* we set same value=> "Constructor" to this object, so we can set this in static block,
        if we set different values for object, it should be instance. Now this constructor will get executed.*/


    }


}
