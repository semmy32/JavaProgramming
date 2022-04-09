package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {
        String name = "Semra";
        int age = 19;
        String citizen = "UK";
        boolean isEligible = age >= 18 && citizen == "USA";
        //                     true            false
        System.out.println(name + " is eligible to vote: " + isEligible);
        // && means BOTH expressions should be TRUE


        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 25;
        int income = 40000;
        boolean isEligibleForLoan = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for loan:  " + isEligibleForLoan);


        String name3 = "Musti";
        int age3 = 33;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && ( gender =='M' || gender == 'F'); //WE USE () HERE TO EXPRESS OR || SENTENCE
        System.out.println( name3 + " is eligible to register: " + isEligible3);


        String name4 = "Steve";
        String countryOfBirth = "UK";
        boolean marriedToUScitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUScitizen == true;
        System.out.println( name4 + " is eligible to US citizen: " + isEligible4);

        String student = "Anna";
        int familyIncome = 60000;
        double gpa = 3.5;
        boolean isEligible5 = familyIncome <= 100000 && gpa >= 3;
        System.out.println(student + " is eligible for scholarship: " + isEligible5);
        System.out.println("------------------------------------");

        boolean result2 = true;
        boolean result3 = ! result2;
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("------------------------------------");
        int score = 58;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);














    }
}
