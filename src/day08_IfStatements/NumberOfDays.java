package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {
        int number= 5;
        boolean has28days = number == 2; //for the month that has 28 days
        boolean has30days = number == 4 || number == 6 || number == 9 || number == 11; //for months have 30 days
        boolean has31days = !has28days && !has30days;

        if (has28days){  // if the month has 28 days
            System.out.println(" 28 days");
        }
        if(has30days){  // if the month has 30 days
            System.out.println(" 30 days");
        }
        if (has31days){ //if the month has 31 days
            System.out.println(" 31 days");
        }





    }
}
