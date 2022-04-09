package day05;

public class ShippingAddress {

    public static void main(String[] args) {
        String fullName = "Semmy Gen";
        int doorNumber = 15;
        String streetName = "Stafford Grove";
        String cityName = "Milton Keynes";
        String postCode = "MK1 8ET";
        System.out.println(fullName + "\n" + doorNumber + " " + streetName + "\n" + cityName + ", " + postCode );
        String shippingAddress = fullName + "\n" + doorNumber + " " + streetName + "\n" + cityName + ", " + postCode;

        System.out.println(shippingAddress);

    }
}
