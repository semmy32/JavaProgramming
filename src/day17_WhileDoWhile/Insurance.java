package day17_WhileDoWhile;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int startingPriceLiability=0;
        int startingPriceFullcoverage=0;
        double totalPrice=100;
        System.out.println("Enter your name");
        String name=scan.nextLine();
        System.out.println("Enter your gender");
        String gender= scan.next().toLowerCase();
        while(!(gender.equals("woman")|| gender.equals("man"))){
            System.out.println("Invalid entry, enter your gender");
            gender=scan.next();
        }

        System.out.println("Enter your age");
        int age=scan.nextInt();
        while(!(age>0 && age<=120)){
            System.out.println("Invalid entry, enter your age");
            age= scan.nextInt();
        }

        
        System.out.println("How many miles do you drive in a day?");
        int mile= scan.nextInt();
        while(!(mile>5)){
            System.out.println("Invalid entry, enter your mile");
            mile= scan.nextInt();}


        System.out.println("Do you want full coverage insurance? yes/no");
        String fullCoverage=scan.next().toLowerCase();
        while(!(fullCoverage.equals("yes")|| fullCoverage.equals("no"))){
            System.out.println("Invalid entry, answer if you want full coverage insurance ");
            fullCoverage= scan.next();
        } if(fullCoverage.equals("yes")) {
            startingPriceFullcoverage+=(age<25)? 160 :120;
        startingPriceFullcoverage+=(mile<=10)? 20 :(mile<=50)? 40 :70;}


        System.out.println("Do you want liability insurance? yes/no");
        String liability=scan.next().toLowerCase();
        while(!(liability.equals("yes")|| liability.equals("no"))){
            System.out.println("Invalid entry, answer if you want liability insurance ");
            liability= scan.next();
        }
        if(liability.equals("yes")){startingPriceLiability+= (age<25)? 90 :50;
        startingPriceLiability+= (mile<=10)? 10 :(mile<=50)? 30 :50;}

        System.out.println("Do you had any accidents or claims in past 5 years (Yes/No)");
        String accident=scan.next().toLowerCase();
        while(!(accident.equals("yes") || accident.equals("no"))){
            System.out.println("Invalid entry, answer question");
            accident= scan.next();
        }if(accident.equals("yes")){
            totalPrice+=(totalPrice*0.15);   }else{totalPrice-=totalPrice*0.10;}
        System.out.println("Do your car has an anti-theft device (Yes/No)");
        String antiTheft= scan.next();
        while(!(antiTheft.equals("yes") || antiTheft.equals("no"))){
            System.out.println("Invalid entry, answer question");
            antiTheft= scan.next();}
        if(antiTheft.equals("yes")){
            totalPrice-=totalPrice*0.05;
        }
        System.out.println("Are you married? yes/no");
        String married= scan.next().toLowerCase();
        while(!(married.equals("yes")|| married.equals("no"))){
            System.out.println("Invalid entry, enter your married status");
            married=scan.next();
        }if(married.equals("yes")){ totalPrice-=totalPrice*0.10; }
         totalPrice+=startingPriceFullcoverage+startingPriceLiability;
        System.out.println("totalPrice = " + (totalPrice-100));
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        
        scan.close();
    }
}
/*Create a class called InsuranceQuote, write a program that can calculate the insurance cost
 of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
*/