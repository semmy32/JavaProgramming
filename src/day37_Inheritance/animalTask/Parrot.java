package day37_Inheritance.animalTask;

public class Parrot extends Animal{
    public Parrot(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }
    public void sing(){
        System.out.println(name+" is singing");
    }
}
