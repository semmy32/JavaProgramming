package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaBBccDeeeFgg";
        String result="";
        for (int i = 0; i <str.length(); i++) { //i: index number of string.
            char ch=str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result+= str.charAt(i);

            }

        }
        System.out.println(result);



    }
}
