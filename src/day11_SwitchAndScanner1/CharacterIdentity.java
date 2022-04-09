package day11_SwitchAndScanner1;

public class CharacterIdentity {
    public static void main(String[] args) {
    char num= 50;
     if(num>=33 && num<=126){
         if(num>=33 && num<=47 || num>=58 && num<=64 ||num>=91 && num<=96 || num>=123 && num<=126){
         System.out.println("Special Character");}
     else if(num>=48 && num<=57){
             System.out.println("Digit Character");
         } else {
             System.out.println("Alphabetic character");}








     }





    }
}
/*Create a class called Character Identity, and write a program that
can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
*/
