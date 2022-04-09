package week_01;

public class AmazonFreeShippng {
    public static void main(String[] args) {
        double totalPrice = 55.5;

        if (totalPrice >= 25.0) {
            System.out.println("Free shipping eligible. Your order total is $ :  " + totalPrice);
        } else {
            System.out.println("Not eligible for free shipping");
        }
        System.out.println("Thanks for shopping with us! ");


    }

}
