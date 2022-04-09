package selfPractice;

import java.util.Scanner;

public class JavaPythonEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence = scan.nextLine();
        int countJava=0;
        int countPython=0;

        for(int i=0; i<=sentence.length()-4; i++){
            if(sentence.substring(i,i+4).startsWith("java")){
                countJava++; }}
            for(int j=0; j<=sentence.length()-6; j++){
                if(sentence.substring(j,j+6).startsWith("python")){
                countPython++;
            }

        }
        if(countJava==countPython){System.out.println("true"); }
        else {System.out.println("false");}
    }
}




