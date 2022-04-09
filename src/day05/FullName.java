package day05;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Josh";
        String lastName = " Halloway";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("Full name of the person is " + fullName);
        int age = 45;
        System.out.println("Full name of the person is " + fullName + ".\n" + firstName + " is " + age + " years old.");
        String jobTitle = "Senior SDET";
        String companyName = "Amazon";
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ".");





    }
}
