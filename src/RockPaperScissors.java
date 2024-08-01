import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors game!");
        System.out.println("To play this game, you need to choose a side. You have only 5 trials.");

        //  The rules of the game:
        //1. Rock crushes Scissors (Rock wins)
        //2. Scissors cuts Paper (Scissors win)
        //3. Paper covers Rock (Paper wins)
        //4. If both players choose the same shape, the game is a tie and typically repeated.

        // Computer's choice
        String[] computer = {"rock", "paper", "scissors"};

        Random rand = new Random();
        int randomIndex = rand.nextInt(computer.length);
        String computerChoice = computer[randomIndex];

        // Game conditions
        boolean playAgain = true;
        int trials;
        int wins;
        int losses;

        while (playAgain) {
            trials = 5;
            wins = 0;
            losses = 0;

            while (trials > 0) {

                // User's input
                System.out.println("Rock Paper Scissors: ");
                String user = sc.nextLine().toLowerCase();

                // Capitalizing the first letter of both choices
                System.out.println("Computer's Choice: " + computerChoice.substring(0, 1).toUpperCase() + computerChoice.substring(1));
                System.out.println("Your Choice: " + user.substring(0, 1).toUpperCase() + user.substring(1));


                // Comparing the choices
                if (user.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if (user.equals("rock")) {
                    if (computerChoice.equals("scissors")) {
                        System.out.println("You win!");
                        wins++;
                    } else {
                        System.out.println("You lose!");
                        losses++;
                    }
                    --trials;

                } else if (user.equals("paper")) {
                    if (computerChoice.equals("rock")) {
                        System.out.println("You win!");
                        wins++;
                    } else {
                        System.out.println("You lose!");
                        losses++;
                    }
                    --trials;

                } else if (user.equals("scissors")) {
                    if (computerChoice.equals("paper")) {
                        System.out.println("You win!");
                        wins++;
                    } else {
                        System.out.println("You lose!");
                        losses++;
                    }
                    --trials;

                } else {
                    System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                }
                // Display remaining trials
                System.out.println("Trials left: " + trials);
            }

            // Display final results
            System.out.println("Game over! Thanks for playing.");
            System.out.println("You won " + wins + " times and the computer won " + losses + " times.");

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (yes/no)");
            String response = sc.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thank you for playing! Goodbye.");
        sc.close();
    }
}
