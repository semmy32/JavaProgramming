package day08_IfStatements;

import java.util.Scanner;

public class SchoolType {
    public static void main(String[] args) {
byte gradeLevel=1;
String school="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write grade level:");
        gradeLevel=scan.nextByte();
switch(gradeLevel){
    case 1: case 2: case 3: case 4: case 5:
    school="Elementary school";
    break;
    case 6: case 7: case 8:
        school="Middle school";
        break;
    case 9: case 10: case 11: case 12:
        school="High school";
        break;
    case 13: case 14: case 15: case 16:
        school="College";
        break;
    case 17: case 18:
        school="Grad School";
    default:
        school="Invalid grade";
}
        System.out.println(school);


    }
}
/*Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18*/