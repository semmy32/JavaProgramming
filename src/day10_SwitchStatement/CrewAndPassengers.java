package day10_SwitchStatement;

import java.util.Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int crew= 15;
       int passenger=5;
        System.out.println("Write total person number");
       int total= scan.nextInt();

     if(total==50 || total==75 ||total==100) {
         switch (total){
             case 100:
                 crew=30;
                 passenger= total- crew;
                 break;
             case 75:
                 crew=25;
                 passenger= total- crew;
                 break;
             default:
                 crew=20;
                 passenger= total- crew;

         }
         System.out.println("Total: " + total+ " ====> "+crew+ " crew, "+passenger+" passengers");
     }



    }
}
/*Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


 */