package day10_SwitchStatement;

public class NumberToWords {

    public static void main(String[] args) {
        int n= 0;
        String result= (n>=0 && n<=9)?
                (n==0)? "Zero" :(n==1)? "One" :(n==2)? "Two" :(n==3)? "Three" :(n==4)? "Four"
                :(n==5)?"Five":(n==6)? "Six" :(n==7)?"Seven" :(n==8)?"Eight" :"Nine"

        : "Invalid number";
        System.out.println(result);


    }
}
// : (condition)?================> for else if