package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

       //assignment : =
       String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Shining necklace ";
        System.out.println("word = " + word); /* If I reassign the same name multiple times,
        It prints the last variable that named.
        Assignment can be used to change the variable. */

        // addition assignment:
         int x = 100;

        System.out.println(x + 200); //300
        System.out.println("x = " + x);
        x += 200;
        System.out.println("x = " + x);
         String str = "wooden";
         str += " spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1); //8

        double availableBalance = 1000.5;
        //deposit = 300 $
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);
        //withdrawing 500 $
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200 $, then depositing 400 $
         availableBalance -= 200;
         availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);


        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);

        double num2= 25000;
        num2 /= 5;
        System.out.println("num2 = " + num2);

        double num3 = 100;
        // %=
        num3 %= 3;

        System.out.println("num3 = " + num3); /* burada remainder işlemi yapıyoruz ama
        aslında yazılan rakam bizim variableimizin bölündüğü rakam, yani burada 100/3'ün remainderi (kalanı) soruluyor. */

      int amount = 127; //cents
        int quarters = 127 / 25;
        int cents = 127 % 25;
        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        int y= 300;
        y %= 16;
        System.out.println("y = " + y);

        int balance = 3500;
        //insurance fee:153 $

        balance %= 153;
        System.out.println("balance = " + balance);


















    }




}
