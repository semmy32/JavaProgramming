package day07_Operators;

public class LeapYear {

    public static void main(String[] args) {

        int leapYear = 2024;
        int remainder = leapYear %= 4;

        boolean isLeapYear = remainder == 0;
        System.out.println("isLeapYear = " + isLeapYear);





    }


}
