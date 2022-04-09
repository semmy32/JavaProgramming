package day34_GarbageCollection_AccessModifier;

public class AccessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
     //   System.out.println(AccessModifiers.privateData); we can not reach this because this is different class.

        AccessModifiers.method1();
        AccessModifiers.method2();



    }

}
