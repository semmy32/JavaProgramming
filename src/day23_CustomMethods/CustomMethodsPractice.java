package day23_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        greeting();
        helloCydeo5Times();
        evenNumbers();


    }

    public static void greeting() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }


    }
    public static void helloCydeo5Times() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo!");

        }

    }
    public static void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }
    }

}