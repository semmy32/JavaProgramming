package day09_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
         //If we use just one condition in if statement, then we can use if statement without braces

        int number= 11;
        String month= "";

        if(number>=1 && number <=12){
            if(number==1){
                month="January";}
            else if(number==2) month="February";
            else if(number==3) month= "March";
            else if (number==4) month= "April";
            else if(number==5) month= "May";
            else if(number==6) month= "June";
            else if(number==7) month="July";
            else if(number==8) month="August";
            else if(number==9) month="September";
            else if(number==10) month="October";
            else if(number==11) month="November";
            else month= "December";

        }else {
            System.out.println("Invalid number");}

        System.out.println(month);


    }
}
