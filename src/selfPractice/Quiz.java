package selfPractice;

public class Quiz {
    public static void main(String[] args) {
        boolean A=true, B=!false;
        if(B) {
            System.out.println("B");
        } else if(A){
            System.out.println("A");}
        else{
            System.out.println("C");}


        System.out.println("-------------------");


        boolean X=true;
        boolean Y= !X==false;
        boolean Z=Y;
        if(X){
            System.out.println("Hello");}
        if(Y){
            System.out.println("today");}
        if(Z){
            System.out.println("we are");}
        System.out.println("-----------------------------------------");


        int x=10;//x= 10
        int y= x++; //y=10
        System.out.println(y++ + " "+ x++ + " "+ y);

        System.out.println("-------------------------------");


        int timeSeconds= 400;
        int hours= timeSeconds/3600;
        int min= (timeSeconds%3600)/ 60;
        int seconds= timeSeconds%60;
        System.out.println("hours = " + hours);
        System.out.println("min = " + min);
        System.out.println("seconds = " + seconds);



    }
}
