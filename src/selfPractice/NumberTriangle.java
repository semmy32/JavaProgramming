package selfPractice;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <6 ; j++) {
                System.out.println(j);
                j+=i+4;


            }

        }
    }
}
/*          1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15*/