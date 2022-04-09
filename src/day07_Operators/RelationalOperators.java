package day07_Operators;

import javax.lang.model.SourceVersion;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, <, >=, <=,

        boolean result1 = 200 >40;
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2);

        boolean result4 = 200 >= 202;
        System.out.println("result4 = " + result4);

        int creditScore = 745;
        boolean isEligibleForLoan = 745 >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int score = 59;
        boolean hasFailed = score <=59;
        System.out.println("hasFailed = " + hasFailed);

        int x= 100;
        int y = 200;
        boolean equal = x == y;
        System.out.println("equal = " + equal);
        boolean result8 = 'A' == 'a';
        System.out.println("result8 = " + result8);

        boolean result9 = "Java" == "JAva";
        System.out.println("result9 = " + result9);

        boolean result10 = "Semra" == "Good Person";
        System.out.println("result10 = " + result10);
        boolean equal1 = "Semra has bad specialities" == "Semra is not perfect";

        boolean result11 = 100 != 200;
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "JAVA";
        System.out.println("result12 = " + result12);









    }
}
