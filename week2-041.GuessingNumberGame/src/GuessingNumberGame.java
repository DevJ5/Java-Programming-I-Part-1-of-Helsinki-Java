
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int numberOfGuesses = 0;
        int guess = -1;
        while(guess != numberDrawn) {
            System.out.println("Guess the number: ");
            guess = Integer.parseInt(reader.nextLine());
            numberOfGuesses++;
            if (guess < numberDrawn) System.out.println("The number is greater, guesses made " + numberOfGuesses);
            else if (guess > numberDrawn) System.out.println("The number is lesser, guesses made " + numberOfGuesses);
            else System.out.println("Congratulations, your guess is correct!");
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
