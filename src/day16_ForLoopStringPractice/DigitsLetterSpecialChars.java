package day16_ForLoopStringPractice;

public class DigitsLetterSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School !@#$½Wooden Spoon";
        String digits = "";
        String letters = "";
        String specialCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //ch: each character that we have in str
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                letters += ch;
            }else{
                if(ch!= ' '){ //if the special character is not a space. if we don't write this condition space is a char also
                    specialCharacters += ch;}
            }}
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);
        }
    }
