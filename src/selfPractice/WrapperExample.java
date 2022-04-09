package selfPractice;

public class WrapperExample {
    public static void main(String[] args) {

   String s="ab1cde2efg3hi4";
   int sum=0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=each;
            }
        }




    }
}
