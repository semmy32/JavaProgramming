package day21_ArrayPart2;

public class Initials {
    public static void main(String[] args) {
       String [] classMates= {"Naciye Aslan", "Dilek Baba", "Hanife Gok", "İsmail Tura","Tuba Ozkan","Mustafa Kara", "Tolgonay Djsk"};
        for (String name : classMates) {
            String in= name.charAt(0) +"."+ name.charAt(name.indexOf(" ")+1);
            System.out.println(in);

        }



    }
}
