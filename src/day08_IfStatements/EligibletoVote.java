package day08_IfStatements;

public class EligibletoVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age= 37;
        String citizen = "USA";
        // eligible
        // noneligible

        boolean isEligible = age >= 21 && citizen == "USA";
        if(isEligible){
            System.out.println( name +" is eligible to vote ");
        }
        if(!isEligible){
            System.out.println(name + " is not eligible");
        }





    }
}
