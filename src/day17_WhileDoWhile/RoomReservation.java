package day17_WhileDoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
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
            room= scan.nextLine().toLowerCase();
            while(!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))){
                System.out.println("Invalid room type, please enter room type");
                room= scan.nextLine();
            }
            switch (room){
                case "king bed":
                    price=120;
                    break;

                case "queen bed":
                price= 100;
                break;
                case "single bed":
                price=80;

            }


        }
        System.out.println("You selected "+room+ " and its price is $"+price);
}}
/*
Create a class called RommReservation, write a program for the room reservation,
 your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */