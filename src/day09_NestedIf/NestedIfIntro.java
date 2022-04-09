package day09_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
      int score= 95;

      if(score>0 && score<=100){
          if(score >=60){
              System.out.println("score = " + score+ " You passed");}

          else{System.out.println("Failed");}

      } else {
          System.out.println("Invalid score"); }

        System.out.println("---------------------------------------");


      int age= 22;
      boolean hasID= false;

      if(hasID) {
          if(age>=21){
              System.out.println("Eligible to buy alcohol");}
              else {
              System.out.println("Not eligible to buy alcohol"); }
          }
      else {
          System.out.println("You should take your ID with you");
      }

        System.out.println("---------------------------");


      int number= 7;


      if( number>=1 && number<=7 ){
          if(number==1){
              System.out.println("Monday");}
          else if (number==2){ System.out.println("Tuesday");}

          else if (number==3){ System.out.println("Wednesday");}
              else if (number==4){ System.out.println("Thursday");}
          else if (number==5){ System.out.println("Friday");}
          else if (number==6){ System.out.println("Saturday");}

          else {
              System.out.println("Sunday");}
      }

    else {
          System.out.println("Invalid number");
      }






    }
}
