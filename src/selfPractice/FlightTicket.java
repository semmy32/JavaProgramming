package selfPractice;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        String from, to ="";
        double price=100.5;
        Scanner scan= new Scanner(System.in);
        from=scan.next();
        to= scan.next();
        System.out.println("From "+ from+ " to "+ to+ " is $"+price);




    }
}
//From Las Vegas to McLean is $425.5