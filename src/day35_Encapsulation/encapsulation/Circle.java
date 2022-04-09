package day35_Encapsulation.encapsulation;

public class Circle {
   private int radius;
   public static double pi=3.14;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return pi * radius * radius;
    }

    public double calcPerimeter(){
      return 2 * pi *radius;
    }

    public String toString() {
        return "Circle{ " +
                " radius= " + radius +","+
                " pi number= " + pi +","+
                " perimeter= " + calcPerimeter() +","+
                " diameter= " + radius*2 +","+
                " area= " + calcArea()+
                '}';
    }

}
