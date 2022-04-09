package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabccdeef";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int count=0; //represents the frequency of the char
            for (int j = 0; j <str.length() ; j++) {//compares the character that outer loop picked, with each characters of the str
                char each=str.charAt(j); //each charac of str
                if(each==ch){
                    count++;}

                }
            if(count==1){
                result+=ch;
            }
            }
        System.out.println(result);
        }

    }

