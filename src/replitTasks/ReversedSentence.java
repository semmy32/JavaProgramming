package replitTasks;
import java.util.Scanner;
public class ReversedSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String []str= sentence.split(" ");
        for(int i=str.length-1; i>=0; i--){
            reversed+= str[i]+" ";
        }


        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
