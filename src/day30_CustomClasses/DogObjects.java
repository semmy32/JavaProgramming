package day30_CustomClasses;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Lucy";
        dog1.breed=" Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color= "Brown";
        System.out.println(dog1);

        Dog dog2=new Dog();
        System.out.println(dog2);//Dog{name='null', breed='null', age=0, gender= , size='null', color='null'} bcs we didn't assign value

        Dog dog3=new Dog();
        dog3.setInfo("Fox", "German Shephard", 2, 'M', "Big", "White");
        System.out.println(dog3);
        dog1.eat();
        dog3.bark();
    }
}
