package day09_IfStatement2;



public class Calculator {
    public static void main(String[] args) {


        double num1= 108.0;
        double num2= 3.0;
        char mathOperator='/';
        double output = num1 + mathOperator + num2;

        if(mathOperator == '+'){
        System.out.println(num1 + num2);}
        else if (mathOperator == '/'){
        System.out.println(num1 / num2);}
        else if (mathOperator == '*'){
        System.out.println(num1 * num2);}
        else {
        System.out.println(num1 - num2);}

        System.out.println(output);







    }
}
/*char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30              */