import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        int roundNumber = 0;

        while (playAgain) {
            roundNumber++;
            int attempts = 0;
            int maxAttempts = 10;
            int numberToGuess = random.nextInt(100) + 1;

            System.out.println("\nRound " + roundNumber + ":");
            System.out.println("I have generated a number between 1 and 100. Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Your guess? ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number!");
                    totalScore += (maxAttempts - attempts + 1);
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }

            System.out.println("Your score for this round: " + (attempts < maxAttempts ? (maxAttempts - attempts + 1) : 0));
            System.out.println("Total score: " + totalScore);

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // consume the leftover newline
            String playAgainInput = scanner.nextLine().trim().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }

        System.out.println("\nThank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }
}
