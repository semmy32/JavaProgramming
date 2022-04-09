package day18_NestedLoop;

public class Triangular {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
               if(j==i){
                   break;}

              }
        System.out.println();

    }
}}

/*package day18_NestedLoop;
public class AsteriskTwo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
                if ( (j==i) ){
                    break;
                }
            }
            System.out.println();
        }
    }
}*/






