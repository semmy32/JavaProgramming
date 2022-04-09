package day25_MethodOverloading;

public class SumOf2Numbers {
    public static void main(String[] args) {
        int sum=sumOf2Numbers(23,34);
        System.out.println("sum = " + sum);

    }
    public static int sumOf2Numbers(int num1, int num2){
        return num1+num2;
    }
}
