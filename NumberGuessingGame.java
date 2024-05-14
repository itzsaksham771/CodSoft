//                                Number Guessing Game
//                                      TASK 1
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();
            attempts++; 

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number!");
                break; 
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }

            if (attempts >= 10) {
                System.out.println("Sorry, you've reached the maximum number of attempts.");
                break;
            }
        }
        System.out.println("Your score: " + attempts + " attempts");

        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.next().toLowerCase();
        if (playAgain.equals("yes")) {
            main(args); 
        } else {
            System.out.println("Thank you for playing!");
        }
        scanner.close();
    }
}