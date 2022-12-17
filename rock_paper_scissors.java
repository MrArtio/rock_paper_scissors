import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    // Create a Scanner object for reading input from the user
    Scanner input = new Scanner(System.in);

    // Create a Random object for generating random numbers
    Random rand = new Random();

    // Generate a random number between 1 and 3
    int computer = rand.nextInt(3) + 1;

    // Ask the user to enter their choice
    System.out.println("Enter your choice: ");
    System.out.println("1. Rock");
    System.out.println("2. Paper");
    System.out.println("3. Scissors");
    int player = input.nextInt();

    // Determine the winner based on the player's and computer's choices
    if (computer == 1) {
      // The computer chose rock
      if (player == 1) {
        // The player chose rock
        System.out.println("Tie game!");
      } else if (player == 2) {
        // The player chose paper
        System.out.println("You win! Paper beats rock.");
      } else if (player == 3) {
        // The player chose scissors
        System.out.println("You lose! Rock beats scissors.");
      }
    } else if (computer == 2) {
      // The computer chose paper
      if (player == 1) {
        // The player chose rock
        System.out.println("You lose! Paper beats rock.");
      } else if (player == 2) {
        // The player chose paper
        System.out.println("Tie game!");
      } else if (player == 3) {
        // The player chose scissors
        System.out.println("You win! Scissors beats paper.");
      }
    } else if (computer == 3) {
      // The computer chose scissors
      if (player == 1) {
        // The player chose rock
        System.out.println("You win! Rock beats scissors.");
      } else if (player == 2) {
        // The player chose paper
        System.out.println("You lose! Scissors beats paper.");
      } else if (player == 3) {
        // The player chose scissors
        System.out.println("Tie game!");
      }
    }
  }
}
