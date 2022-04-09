package selfPractice;

public class PrintLettersCombination {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE
        char f;
        char s;

        for(f='z'; f>='v'; f--){
            for(s='z'; s>='v'; s--){
                System.out.println(""+f+s);
            }
        }

    }
}



