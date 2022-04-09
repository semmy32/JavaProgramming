package day18_NestedLoop;

import java.util.Scanner;

public class RoomExtra {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
        System.out.println("Do you want to reserve a room? yes/no");
        String answer= scan.next().toLowerCase();
        int price=0;
        String room="";
        while(!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please write your answer");
            answer= scan.next();
        }
        if(answer.equals("no")){
            System.out.println("Have a nice day");}
        else {
            System.out.println("which type of room do you want to reserve?");
            scan.nextLine();
            room = scan.nextLine().toLowerCase();
            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Invalid room type, please enter room type");
                room = scan.nextLine();
            }
            switch (room) {
                case "king bed":
                    price = 120;
                    break;

                case "queen bed":
                    price = 100;
                    break;
                case "single bed":
                    price = 80;

            }
            System.out.println("How many nights do you want to stay?");
            int night = scan.nextInt();
            price *= night;
            System.out.println("Would you like to reserve another room?");
            String anotherRoom = scan.next();
            while (!(anotherRoom.equals("yes") || anotherRoom.equals("no"))) {
                System.out.println("Invalid entry, enter room change yes/no");
                anotherRoom = scan.next();
            }
            if (anotherRoom.equals("no")) {
                System.out.println("You selected " + room + " and its price is $" + price);
                break;
            }
        }
        }

    }
}
/*King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
*/