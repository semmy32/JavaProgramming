package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        // get an output a= 15 and b = 10 WE SHOULD USE TEMPORARY VALUABLE!!!
        int c = b; // c=15;
        b = a;
        a = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }

}
