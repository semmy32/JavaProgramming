package day16_ForLoopStringPractice;

import java.util.Locale;
import java.util.Scanner;

public class Prctc6 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String hasLicence = scan.next();

        int age = 0;
        String zipCode="";
        if (hasLicence.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else {
            System.out.println("Enter your zip code");
            zipCode = scan.nextLine();
            if (zipCode.equals("20910") || zipCode.equals("20740")) {
                premium += 60;
            } else if (zipCode.equals("22102") || zipCode.equals("22103")) {
                premium += 30;
            } else{
                premium += 50;
            }
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();
            if (vehicleOwnership.equalsIgnoreCase("owned")) {
                premium += 10;
            } else {
                premium += 20;
            }
            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();
            if (vehicleUsage.equalsIgnoreCase("Business")) {
                premium += 50;
            } else if (vehicleUsage.equalsIgnoreCase(" Pleasure ")) {
                premium += 10;
            } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += (daysDrivenToWorkOrSchool * 5);

                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool;
            }

            System.out.println("How old are you?");
            age = scan.nextInt();
            if (age < 16) {
                System.out.println("Invalid data!");
                System.exit(0);
            } else if (age >= 16 && age < 18) {
                premium *= 20;
            } else if (age >= 18 && age < 21) {
                premium *= 6;
            } else if (age >= 21 && age < 25) {
                premium *= 2;
            }
            System.out.println("How many years you've been driving?");
            int experience = scan.nextInt();
            if (experience > 0 && (age - experience >= 16)) {
                premium -= experience * 5;
            } else {
                System.out.println("Invalid data!");
                System.exit(0);
            }

            System.out.println("Have you had any accidents in the last 5 years?");
            String accident = scan.next();
            if (accident.equalsIgnoreCase("Yes")) {
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                premium += (premium * 0.2) * accidentsAmount;
            }
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();
            if (continuousInsurance.equals("No")) {
                premium *= 2;
            }
            System.out.println("What is the highest level of education you have completed?");
            scan.nextLine();
            education = scan.nextLine();
            if (education.equals("PhD") || education.equals("Masters") || education.equals("Bachelors")) {
                premium = premium - (premium * 0.05);
            } else if (education.equals("Doctors")) {
                premium = premium - (premium * 0.10);
            } else if (education.equals("Less than High School")) {
                premium = premium + (premium * 0.05);
            }
        }
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        referenceNumber = name.substring(0, 2) + age + zipCode + name.substring(name.length() - 2, name.length())
                + education;
        referenceNumber = referenceNumber.toUpperCase(Locale.ROOT);
        referenceNumber = referenceNumber.replace(" ", "");

        System.out.println("Reference number: " + referenceNumber);

    }}

