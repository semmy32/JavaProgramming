package selfPractice;

public class MethodsQuiz {


    public static void main(String[] args) {
        int num = 5;
        while (isAvailable(num)) {
            System.out.print(num);

        }
    }

    public static boolean isAvailable(int num) {
        return (num-- > 0) ? true : false;
    }


}
