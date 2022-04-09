package day11_SwitchAndScanner1;

public class Ternary {
    public static void main(String[] args) {

       int num= 4;
       String result="";
       if(num>=1 && num<=9){
        result= (num==1)? "One" :(num==2)? "Two" :(num==3)? "Three" :(num==4)? "Four" :(num==5)? "Five" :(num==6)?
           "Six" :(num==7)? "Seven" :(num==8)? "Eight" :"Nine";
       }
        System.out.println("Result for " +num+ " is:"+ result);



    }
}
//Write a program that can convert numbers 0~9 to words.