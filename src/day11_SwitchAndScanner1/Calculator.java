package day11_SwitchAndScanner1;

public class Calculator {
    public static void main(String[] args) {

      double n1=150.0;
      double n2= 10.5;
      char operator= '-';
      boolean valid= operator=='+' || operator== '-' || operator=='*' || operator== '/';
      if(valid) {
          switch (operator) {
              case '+':
                  System.out.println(n1 + n2);
                  break;
              case '-':
                  System.out.println(n1 - n2);
                  break;
              case '*':
                  System.out.println(n1 * n2);
                  break;
              default:
                  System.out.println(n1 / n2);
          }
      } else{
          System.out.println("Invalid operator");
      }











    }
}
