package day21_ArrayPart2;

public class AverageNumber {
    public static void main(String[] args) {
       int [] numbers= {10,20,30,40,50,60};
       double sum=0;
       for(int num:numbers){
           sum+=num;
       }
       double avarage=0;
       avarage=sum/ numbers.length;
        System.out.println("avarage = " + avarage);


    }
}
