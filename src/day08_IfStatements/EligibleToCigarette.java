package day08_IfStatements;

public class EligibleToCigarette {

    public static void main(String[] args) {
        String name= "Jack";
        byte age = 21;
        boolean isEligibleCigarette = age >= 18;

        if(isEligibleCigarette) { System.out.println(name + " is eligible to buy cigarette: "+isEligibleCigarette); }

        if(!isEligibleCigarette){
            System.out.println( name + " is not eligible to buy cigarette ");
        }





    }
}
