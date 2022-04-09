package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name= scan.nextLine();
        System.out.println("Enter your building number: ");
        int buildNumber= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Street name");
        String street= scan.nextLine();
        System.out.println("Enter your city name: ");
        String city= scan.nextLine();
        System.out.println("Enter your state name: ");
        String state= scan.next();
        System.out.println("Enter your zipcode: ");
        String zipcode= scan.next();
        scan.close();
        String address= name+ " "+ buildNumber+ " "+ street+ " "+city+ " "+state+" "+zipcode;
        System.out.println("address = " + address);






    }


}



