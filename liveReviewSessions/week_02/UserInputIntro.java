package week_02;

import java.util.Scanner;
public class UserInputIntro {
    public static void main(String[] args) {
      //output goes to console----print or println
        String name= "";
        System.out.println("output");

        //How can I receive input for my Java class
        // 1. Create your scanner object (object name can be anything)
        Scanner input= new Scanner(System.in);

        //2. prompt the user for putting input
        System.out.println("Put your name: ");  //this is printed out to console

        //3. get the input
        name = input.next();// reads the data from console and assigns the value to my variable

        //4. Use the value that I read
        System.out.println("name = " + name);





    }
}
