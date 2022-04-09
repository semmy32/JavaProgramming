package day10_SwitchStatement.replitTasks;

import java.util.Scanner;

public class NewClass {

        public static void main(String[] args) {
            //DO NOT CHANGE
            int propertyPrice = 0;
            int numberOfBedrooms, garageSpots;
            float metroAccessibility, schoolScore, highwayAccessibility;
            boolean backyard, smoking, garage;
            String houseType;
            Scanner scan = new Scanner(System.in);
            System.out.println("*****************************************");
            System.out.println("* Welcome to the RealEstate calculator! *");
            System.out.println("*****************************************");
            //WRITE YOUR CODE HERE
            System.out.println("Enter your property type:");
            houseType=scan.next();
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms=scan.nextInt();
            System.out.println("Do you have a backyard?");
            backyard=scan.nextBoolean();
            System.out.println("Do you have garage?");
            garage=scan.nextBoolean();
            System.out.println("How many spots?");
            garageSpots=scan.nextInt();
            System.out.println("How close is metro station?");
            metroAccessibility= scan.nextFloat();
            System.out.println("How close is highway?");
            highwayAccessibility= scan.nextFloat();
            System.out.println("What's the rating of nearest school?");
            schoolScore=scan.nextFloat();
            System.out.println("Does any of your family members smoke?");
            smoking=scan.nextBoolean();
            int priceGarage=1,
                    priceMetroAccess=1,
                    priceHighwayAccess=1,
                    priceSchoolRating=1;


            if(garageSpots<=10){priceGarage=garageSpots*20000;}else {System.out.println("Pardon, it's not public parking!");}
            if(metroAccessibility<1){priceMetroAccess=10000;}else{priceMetroAccess=5000;}
            if(highwayAccessibility<1){priceHighwayAccess=15000;} else if(highwayAccessibility<5){priceHighwayAccess=8000;}else{priceHighwayAccess=4000;}
            if(schoolScore>=8 && schoolScore<=10) {priceSchoolRating= 45000;}else if(schoolScore>=4){priceSchoolRating=20000;} else{priceSchoolRating=5000;}

            propertyPrice= priceGarage+ priceHighwayAccess+priceMetroAccess+ numberOfBedrooms*30000+priceSchoolRating;


            if(houseType.equals("Townhouse")|| houseType.equals("Single Family Home")){
                if(backyard){propertyPrice+=5000;}}

            if(smoking){
                propertyPrice-=5000;
            }

            System.out.println(propertyPrice);



        }
    }

