package day39_Recap.shape;

public class ShapeObjects {
    public static void main(String[] args) {
      Circle circle = new Circle(5.5);
        System.out.println(circle);
        Square square= new Square(13);
        System.out.println(square);

        System.out.println("-------------------");
      /*  Square squ= new Square(-5);
        System.out.println(squ); */

        Rectangle rect=new Rectangle(10,3);  // because of it terminated the program
        System.out.println(rect);                          // this object will not executed

      square.setSide(10);    // we can change the side with setSide method.
      System.out.println(square);





    }
}
