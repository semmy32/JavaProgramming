package week_01;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADAIRE APARTMENTS");
        int numberOfBedrooms= 1;
        int startingPrice= 0;
        String result="";

        switch (numberOfBedrooms){
            case 0:
                startingPrice= 1454;
                result= "Studio apartment selected. Starting price is: " + startingPrice;
                break;
            case 1:
                startingPrice=1725;
                result= "One bedroom apartment selected Starting price is: " +startingPrice;
                break;
            case 2:
                startingPrice=2899;
                result="Two bedroom apartment selected.Starting price is: " +startingPrice;
                break;
            default:
                result="This number bedroom currently unavailable";

        }
        System.out.println("result = " + result);




    }
}
/*add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
print: "Studio apartment selected"
startingPrice -> 1454

when numberOfBedrooms 1:
print: "One bedroom apartment selected"
startingPrice -> 1725

when numberOfBedrooms 2:
print: "Two bedroom apartment selected"
startingPrice -> 2899

default:
print "5 bedroom currently unavailable"

------
"Starting price $1454"*/