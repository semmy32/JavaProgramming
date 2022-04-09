package day09_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int grade=8;
        String location="",
                teacherInCharge="";
        int numberOfGroups=1;

        if (grade>=1 && grade<=6) {
            switch (grade) {
                case 1:
                    location = "Apple orchard";
                    numberOfGroups = 3;
                    teacherInCharge = "Ms Smith";
                    break;
                case 2:
                    location = "Zoo";
                    numberOfGroups = 7;
                    teacherInCharge = "Mr Lee";
                    break;
                case 3:
                    location = "Aquarium";
                    numberOfGroups = 5;
                    teacherInCharge = "Ms Wilson";
                    break;
                case 4:
                    location = "Movie theater";
                    numberOfGroups = 2;
                    teacherInCharge = "Ms Reyes";
                    break;
                case 5:
                    location = "Museum";
                    numberOfGroups = 5;
                    teacherInCharge = "Ms Lela";
                    break;
                default:
                    location = "Six Flags";
                    numberOfGroups = 8;
                    teacherInCharge = "Mr Watt";

                    System.out.println("grade = " + grade);
                    System.out.println("location = " + location);
                    System.out.println("numberOfGroups = " + numberOfGroups);
                    System.out.println("teacherInCharge = " + teacherInCharge);

            }
        }else {
            System.out.println("Invalid grade");}








    }
}
/*Create a class called FieldTrip. Your school goes on a Field trip each year.
 The place you go will be based on your grade. Given a variable gradeNumber (1-6)
 figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

 */