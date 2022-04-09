package selfPractice;

import java.util.Scanner;

public class UnitQuiz {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
      String password= scan.next();
      String encr="";
        for (int i = 0; i <password.length(); i++) {
            encr+=""+password.charAt(i)+"x";

        }
        System.out.println("encr = " + encr);
            


    }}