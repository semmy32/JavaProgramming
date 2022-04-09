package day18_NestedLoop;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Write a text to find count of letters");
        String str=scan.nextLine();
        int count=1;
        String result="";
        String ch="";

        for (int i = 0; i <str.length() ; i++) {
            ch=""+str.charAt(0);
            while(str.substring(1).contains(ch)){
                count++;}
                str=str.replaceFirst(ch,"");}

            result+=ch+count;




        System.out.println(result);
    }
}
/* String result="";
        while (true){
            int count=0;
            result+=word.substring(0,1);
            String ch=word.substring(0,1);
            while (word.contains(ch)){
                count++;
                word=word.replaceFirst(ch,"");}
            result+=count;
            if (word.length()==0){
                System.out.println(result);break;}}*/
/*Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters*/