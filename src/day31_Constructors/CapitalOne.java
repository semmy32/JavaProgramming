package day31_Constructors;

import java.util.Scanner;

public class CapitalOne {
    public static void main(String[] args) {

       BankAccount account1= new BankAccount();
       account1.setInfo("Semra Genc",123456789);
        System.out.println(account1);

        account1.deposit(3500);
        account1.checkBalance();

        account1.withdraw(350);

        account1.checkBalance();


        BankAccount account2= new BankAccount();
        account2.setInfo("Ali Genc", 987654321);
        account2.deposit(10000);



    }
}
