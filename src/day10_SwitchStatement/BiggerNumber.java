package day10_SwitchStatement;

public class BiggerNumber {
    public static void main(String[] args) {

        int n1 =21;
        int n2= 20;
        int n3 = 7;
        String rating="";


        rating= (n1<n2 && n2<n3)? "n3 is the biggest number" :(n3<n2 &&n2<n1)? "n1 is the biggest number" : "n2 is the biggest number";
        System.out.println(rating);

    }
}
/*Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY


 */