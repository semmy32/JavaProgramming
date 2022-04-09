package day32_Constructors2;

public class Car {
   public String brand, model,color;
   public int year, price;

   public Car(String brand){
      this.brand=brand;
   }
   public Car(String brand, String model){
      this(brand);
      this.model=model;
   }
   public Car(String brand, String model, int year){
      this(brand,model);
      this.year=year;
   }
   public Car(String brand, String model, int year, int price){
      this(brand, model, year);
      this.price=price;
   }
   public Car(String brand, String model, int year,int price, String color){
      this(brand, model, year,price);
      this.color=color;
   }

   public String toString() {
      return "Car{" +
              "brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", color='" + color + '\'' +
              ", year=" + year +
              ", price= £" + price +
              '}';
   }


}
