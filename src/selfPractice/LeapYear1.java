package selfPractice;

public class LeapYear1 {
    public static void main(String[] args) {
        int leapYear= 2038;

        boolean isLeapYear= leapYear%4 ==0;
        System.out.println(leapYear+ " is leap year: "+ isLeapYear);


    }
}
/* Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true*/