package day16_ForLoopStringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {
       String str= "aaabbCCcddee";
       String result="";
        for (int i = 0; i <= str.length()-1 ; i++) {
            String ch= ""+str.charAt(i); /*
            first we write char ch= str.charAt(i) but if I want to concatenation my var.type should be String */
            if(!result.contains(ch)){
                result+= ch;}
        }
        System.out.println("result = " + result);

    }
}
