import java.util.Scanner;

// while loop: keeps asking until the user guesses the secret number.
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 100) + 1;   // 1..100
        int guess = 0;      // 0 so the loop condition is initially true
        int attempts = 0;

        System.out.println("========================================");
        System.out.println("         NUMBER GUESSING GAME");
        System.out.println("========================================");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?\n");

        while (guess != secretNumber) {
            attempts++;
            System.out.print("Attempt " + attempts + " - Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.\n");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.\n");
            } else {
                System.out.println("\nCongratulations! You guessed it!");
                System.out.println("The number was: " + secretNumber);
                System.out.println("You took " + attempts + " attempt(s).");
            }
        }

        scanner.close();
    }
}
