package selfPractice;

import java.util.Scanner;

public class ReplitLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result="";
        while(count>1){
            result+=word;
            count--;
            result+=separator;
        }
        System.out.print(result);
        if(count==1){
            System.out.println(word);
        }

    }
}
