package day09_NestedIf;

public class TernariesInfo {
    public static void main(String[] args) {
      int n= 100;
      if(n%2 ==0){
          System.out.println("Even");} else {
          System.out.println("Odd");}
        System.out.println("-----------------------------------------");



      String result1= (n%2 ==0)? "Even" : "Odd";
        System.out.println(result1);
        System.out.println("---------------------------");


        int age= 45;
       String result2= (age >= 18)? "Eligible to go Military Service" : "Not eligible to go Military Service";
        System.out.println(result2);


        System.out.println("----------------------------");


        int number=100;
        if(number>0){
            System.out.println("positive");}
        else if(number <0){
            System.out.println("negative");}
            else {
            System.out.println("zero");}
        System.out.println("------------------------------------");

       String result3= (number>0)? "Positive" :(number<0)? "negative" : "zero";
        System.out.println(result3);


    }
}
