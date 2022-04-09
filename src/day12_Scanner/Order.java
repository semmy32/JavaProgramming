package day12_Scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the product name");
        String product= scan.nextLine();
        System.out.println("enter the price ");
        double price=scan.nextDouble();
        System.out.println("enter the quantity");
        int quantity= scan.nextInt();
        System.out.println("enter their first name");
        String firstName= scan.next();
        scan.close();
        System.out.println(firstName+ ", your order for "+quantity+" "+product+
                " has been placed. Your total is "+(quantity*price));


    }
}/*PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been placed. Your total is 7.5.*/

