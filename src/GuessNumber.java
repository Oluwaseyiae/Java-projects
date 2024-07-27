import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to the Guess game!");
            System.out.println("You have 5 trials, once you exhust the five trials without any wins, the game will end.");


            System.out.print("Are you ready to start? (Yes/ No): ");
            String ready = sc.nextLine().toLowerCase();


            if (ready.equals("yes")){
                Random rand = new Random();
                int number = rand.nextInt(100) + 1;
                int trials = 5;
                boolean hasWon = false;

                for (int i = 0; i < trials; i++){
                    System.out.print("Enter a number between 1 and 100: ");
                    int guess = sc.nextInt();
                    sc.nextLine();

                    // Check if the guess is within the valid range
                    if (guess < 1 || guess > 100) {
                        System.out.println("The number is out of range! Please enter a number between 1 and 100.");
                        i--; // Do not count this trial
                        continue; // Skip the rest of the loop and ask for input again
                    }

                    if (guess == number){
                        System.out.println("You got it! The guess is " + guess);
                        hasWon = true;
                        break;
                    } else{
                        System.out.println("Incorrect guess. Try again");
                    }

                    if (i == trials - 1) {
                        System.out.println("You could not find it! The correct number was " + number);
                    }
                }
            } else if(ready.equals("no")){
                System.out.println("Come back later");
                playAgain = false; // End the loop
            } else {
                System.out.println("Enter a correct input");
            }

            if (!ready.equals("no")) {
                System.out.print("Do you want to play again? (Yes/ No): ");
                String response = sc.nextLine().toLowerCase();
                if (response.equals("no")) {
                    playAgain = false; // End the loop
                }
            }
        }

        sc.close();
    }
}
