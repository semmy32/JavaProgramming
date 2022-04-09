package day37_Inheritance.animalTask;

public class Cat extends Animal{
    public Cat(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
