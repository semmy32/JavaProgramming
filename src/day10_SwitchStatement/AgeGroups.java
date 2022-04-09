package day10_SwitchStatement;

public class AgeGroups {
    public static void main(String[] args) {
    int age=1;
    String term="";
    if(age>=1 && age <=150){
        if(age<21){
            term=" Teenager";
        } else if(age>=21 && age<55){
            term="Adult";
        }else { term="Senior";}

    }
    else{
        term= "Invalid";
    }
        System.out.println("term = " + term);




    }
}
/*Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */