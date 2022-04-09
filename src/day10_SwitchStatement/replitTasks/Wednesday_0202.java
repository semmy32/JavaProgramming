package day10_SwitchStatement.replitTasks;

import java.util.Scanner;

public class Wednesday_0202 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int budget= 100, hat= 25, blanket= 60,
                charger=25, Headphones= 30, Laptop= 200, Pants=50, Pillow =40, Smartphone=1000, Socks=5, USBcable=10;

        String result="";
        String item= scan.nextLine();

        switch(item){
            case "hat":
            result= "Thank you for your purchase!\nYour current balance is: " +(budget-hat)+ "$";
            break;
            case "blanket":
                result= "Thank you for your purchase!\nYour current balance is: "+ (budget-blanket)+"$";
                break;
            case "charger":
                result= "Thank you for your purchase!\nYour current balance is: "+ (budget-charger)+"$";
                break;
            case "headphones":
                result= "Thank you for your purchase!\nYour current balance is: "+ (budget-Headphones)+"$";
                break;
            case "laptop":
                result= "Sorry, not enough funds on your gift card!";
                break;
            case "pants":
                result= "Thank you for your purchase!\nYour current balance is: " + (budget-Pants)+"$";
                break;
            case "pillow":
                result="Thank you for your purchase!\nYour current balance is: "+ (budget-Pillow)+"$";
                break;
            case "socks":
                result="Thank you for your purchase!\nYour current balance is: "+ (budget-Socks)+"$";
                break;
            case "USB cable":
                result= "Thank you for your purchase!\nYour current balance is: "+ (budget-USBcable)+"$";
                break;
            case "smartphone":
                result= "Sorry, not enough funds on your gift card!";

            default: result= "Invalid item!";
        }



    }



}
/*Similar to Vending Machine
Let's say I've got a 100$ gift card and you want to buy something in your online store .
 Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop -
200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
copied!
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!*/