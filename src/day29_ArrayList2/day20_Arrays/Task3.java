package day29_ArrayList2.day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
     String [] items= new String[5];
     int [] prices= new int[5];
        Scanner scan=new Scanner(System.in);
        int totalPrice=0;
        String result="";

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item");
            items[i]= scan.next();
            System.out.println("enter price");
            prices[i]=scan.nextInt();
            totalPrice+=prices[i];
        }
        for (int i = 0; i< 5; i++) {
            System.out.println(items[i]+ " -- "+prices[i]);

        }
        System.out.println(totalPrice);


        }
}

/*Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
*/