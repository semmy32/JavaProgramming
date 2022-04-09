package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args){

   Iphone iphone=new Iphone("Iphone 12 Pro","6.7 inches", "Dark grey",1000);

   Samsung samsung=new Samsung("galaxy S19","6 inches","blue",500);

   Nokia nokia=new Nokia("Brick", "4 inches", "Black",100);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(12345678);
        iphone.text(1234567);
        iphone.faceTime(12345678);
        iphone.faceTime("semmygen@gmail.com");
        System.out.println("==================================");
        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery );
        System.out.println( Iphone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println( Nokia.hasBattery );







    }

}
