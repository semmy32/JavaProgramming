package day09_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 85;

      String result= (s >= 0 && s <= 100)? (s>=60)? "Passed" :"Failed" : "invalid result";
        System.out.println(result); } }


/* if (s >= 0 && s <= 100) {
            if (s >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }


        } else {
            System.out.println("invalid result");
        }
    }
}*/
