package day32_Constructors2;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default constructor!");
    }
    public ConstructorCalls(int a){
        this(); //we don't write anything in the paranthesis
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
     this(10);
        System.out.println("Constructor with string argument");
    }

    public static void main(String[] args) {
      ConstructorCalls obj1= new ConstructorCalls();
        System.out.println("------------------------------");

        ConstructorCalls obj2= new ConstructorCalls(10);
        System.out.println("--------------------------------");

        ConstructorCalls obj3= new ConstructorCalls("Java");
    }

}
