package day09_NestedIf;

public class Grade {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 0 && score<=100) {
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80 ) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score");
        }
    }
}
