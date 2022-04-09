package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
      Dog dog1=new Dog("Fox","Husky","White",'M','B',8);
        System.out.println(dog1);

        Cat cat1=new Cat("Meow", "Tekir", "Multicolor",'F','S',5);
        System.out.println(cat1);
        cat1.scratch();
        System.out.println("");

        Parrot parrot1=new Parrot("King","Macaw","Blue",'M','M',12);
        System.out.println(parrot1);
        parrot1.sing();




    }
}
