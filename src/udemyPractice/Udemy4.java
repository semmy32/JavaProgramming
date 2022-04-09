package udemyPractice;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Udemy4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int random= ThreadLocalRandom.current().nextInt(1,101);
        int guess;
        int count=0;
        do {
            System.out.println("Enter your guess");
            guess = scan.nextInt();
            if (guess < random) {
                System.out.println("HIGHER");
            } else if (guess > random) {
                System.out.println("LOWER");
            } else {
                System.out.println("CORRECT! NUMBER IS " + random);
            }
            count++;
        }
        while(guess!=random);
        System.out.println("You made "+count+" guesses");


    }
}
/*Create a game where the program picks a random number from 1 to 100 and the player has to guess it.
Each time the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high.
If the player correctly guesses the number, print “CORRECT”, then end the game.

You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.

int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);



Exercise 6

Modify the program in Exercise 5 so that once the game is won, it informs the player how many guesses it took them.*/