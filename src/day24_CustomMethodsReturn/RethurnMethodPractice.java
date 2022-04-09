package day24_CustomMethodsReturn;

public class RethurnMethodPractice {
    public static void main(String[] args) { //find the max number between 100 & 200
   int maxNumber=  max(100,200);
        System.out.println(maxNumber); //multiply max by 2

        int multiplication= maxNumber*2;
        System.out.println(multiplication);

    }
    public static int max(int a,int b){
        int result=0;
        if(a>b){
            result=a;
        }else {
            result=b;
        }

        return result;
    }






}
