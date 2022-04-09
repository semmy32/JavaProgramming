package day17_WhileDoWhile;

public class BrancStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if(i=='C'){
                continue;
            }

            System.out.print(i+ " ");//A B D E   "C" is skipped

        }


    }
}
