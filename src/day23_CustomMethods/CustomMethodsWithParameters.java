package day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);//without info in paranthesis it gives compile error
        ageOfPerson(1984);
    }
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println( number+" is even number");
        }else {
            System.out.println( number+" is even number");}
    }
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is "+age);
    }
}
