package selfPractice;

import java.util.Scanner;

        public class ShopList{
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String shoppingListReport = "";
                double price;
                double totalPrice = 0;
                int count=1;
                System.out.println("Enter Item1 and its price:");
                String item=scan.next();
                price=scan.nextDouble();
                shoppingListReport+=item;
                System.out.println("Add one more item?");
               String countinue = scan.next();

                if(countinue.equalsIgnoreCase("yes")){
                    for(int i=1; i<10; i++){
                        count+=i;
                        System.out.println("Enter Item"+count+" and its price:");
                        item=scan.next();
                        price=scan.nextDouble();
                        shoppingListReport+=item;
                        System.out.println("Add one more item?");
                        countinue = scan.next();

                    }}

                System.out.println(shoppingListReport);

            }}

