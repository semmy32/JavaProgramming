package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+ " "+model+" "+" is having a FaceTime with phone number "+phoneNumber );
    }
    public void faceTime(String email){
        System.out.println(brand+ " "+model+" "+" is having a FaceTime with e-mail "+email );
    }


}
