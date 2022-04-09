package selfPractice;



import java.util.Scanner;

public class Insurance1 {
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
        String referenceNumber = "";
        String name="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //write code here

        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String hasLicence = scan.next();
        if(hasLicence.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);}

        String zipCode="";
        System.out.println("Enter your zip code");
        zipCode = scan.next();
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
            premium += 10; } else { premium += 20; }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;}
        else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10; }
        else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0); }
        if(age>=16 && age<25){
            if (age < 18) {
                premium *= 20; }
            else if (age <= 21) {
                premium *= 6;}
            else { premium *= 2;}
        }

        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
        if (experience<=0 || (age - experience) < 16){
            System.out.println("Invalid data!");
            System.exit(0);}
        premium -= experience * 5;

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += (premium * 0.2) *accidentsAmount;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equals("No")) {
            premium *= 2; }
        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education = scan.nextLine().toUpperCase();
        if (education.equals("PHD") || education.equals("MASTERS")
                || education.equals("BACHELORS")) {
            premium-= premium * 0.05;
        } else if (education.equals("DOCTORS")) {
            premium-= premium * 0.1;
        } else {
            premium += premium * 0.05;
        }
        referenceNumber= name.substring(0,2)+ age+ name.substring(name.length()-2,name.length())
                +zipCode+ education.replace(" ","");
        referenceNumber= referenceNumber.toUpperCase();
        System.out.println(name+ ", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+ premium);
        System.out.println("Reference number: "+ referenceNumber);

    }}


/*In order to build reference number variable (referenceNumber), concatenate first 2 letters of customer's name, age,
        last 2 letters of of customer's name, zip code, and level of education without spaces. This value should be all upper case!
         */