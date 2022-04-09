package selfPractice;

public class Unit2_2 {
    public static void main(String[] args) {
       String str="Today it will be 100 degrees! ";
       int n=0;
       while(n++ <str.length()){
           if (n==8){continue;
       }else if(n==9){
               break;
           }
           System.out.println(str.charAt(++n));
    }


}}
