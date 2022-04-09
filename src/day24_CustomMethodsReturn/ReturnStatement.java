package day24_CustomMethodsReturn;

public class ReturnStatement {
    //Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        if(number<1 || number >7){ //if the number is invalid
            return; //exits nameOfDay method, we can't use break because this is not loop or switch
       // in void method, we can't return any data value, we just use it for exiting the method.
        }

         if(number == 1){
             System.out.println("Monday");
         }else if(number==2){
             System.out.println("Tuesday");
         }else if(number == 3){
             System.out.println("Wednesday");
         }else if(number == 4){
             System.out.println("Thursday");
         }else if(number == 5){
             System.out.println("Friday");
         }else if(number == 6){
             System.out.println("Saturday");
         }else{
             System.out.println("Sunday");
         }


    }




}
