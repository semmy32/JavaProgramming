package day09_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
       int score= 90;
       String result= (score>=0 && score<=100)? (score>=90)? "Excellent" :(score >= 80)? "Great" :(score >= 70)?
            "Good" :(score >=60)? "Passed" : "Failed" :"Invalid Score";
        System.out.println(result);
        System.out.println("---------------------------------------------");


        String result2="";
        if (score>=0 && score<=100) {
            result2= (score>=90)? "Excellent" :(score >= 80)? "Great" :(score >= 70)?
                    "Good" :(score >=60)? "Passed" : "Failed";
        }else {
            System.out.println("Invalid score");}
        System.out.println(result2);

    }
}
/*int score = 75;
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
        }*/