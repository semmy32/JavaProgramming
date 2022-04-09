package udemyPractice;

public class Udemy1 {
    public static void main(String[] args) {

        int count=1;
        for (int i=1; i <=40 ; i++) {

            System.out.print(i+" ");
            if(count==3){
                System.out.print(" Quack. ");
                count=0;
            }
            count++;

        }


    }}

//Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”