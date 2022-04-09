package day37_Inheritance.animalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, String color, char gender, char size, int age){
        super(name, breed, color, gender, size, age);
    }
    public void bark(){
        System.out.println(name+ " is barking");
    }
}
