package day30_CustomClasses;

public class CarObjects {
    public static void main(String[] args) {

      Car car1=new Car();

      car1.setInfo("Audi", "Q7", "Blue", 2022, 60000);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("Tesla", "Model 3", "White", 2022, 43000 );
        System.out.println(car2);

    }
}
