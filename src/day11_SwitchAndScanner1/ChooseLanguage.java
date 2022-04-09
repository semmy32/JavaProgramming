package day11_SwitchAndScanner1;

public class ChooseLanguage {
    public static void main(String[] args) {
       int number= 1;
       String result= "";

       if(number>=1&& number<=5)
           if(number==1){
               result="Hello, thank for your call";
           } else if (number==2){
               result="Hola, gracias para llamar";
           }else if (number==3){
               result="Merhaba, aradiginiz icin tesekkurler";
           }else if (number==4){
               result="Privet, spasibo za vash zvonok";
           }else {
               result="Merci ,pour votre appel";
           }
        System.out.println(result);




    }
}
/*Creata a class called ChooseLanguage, Given an integer variable named selection
that has a number between 1~5, Write a program that can select the language based
 on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel*/
