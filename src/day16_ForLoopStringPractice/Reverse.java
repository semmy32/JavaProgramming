package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
       String str= "Wooden Spoon";
       // index     0123456...
       String result="";// contain the reversed version of str
      /*  result+=str.charAt(str.length()-1); //  n index=11(length-1)
        result+= str.charAt(10); //o
        result+= str.charAt(9);  //o
        result+= str.charAt(8);  //p
        result+= str.charAt(7);  //S
        result+= str.charAt(6);  //' '
        result+= str.charAt(5);  //n
        result+= str.charAt(4);  //e
        result+= str.charAt(3);  //d
        result+= str.charAt(2);  //o
        result+= str.charAt(1);  //o
        result+= str.charAt(0);  //W

       */
        for(int i = 11; i>=0; i--) { //int i= str.length()-1;
            result+= str.charAt(i); //adding each character into the result
        }
        System.out.println(result);

//DON'T FORGET TO PUT THE CODES OUT OF LOOP IF YOU DON'T WANT TO REPEAT IT!






    }
}
