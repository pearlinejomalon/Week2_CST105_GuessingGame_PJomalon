
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt(10000);
		int tries = 0;
		input = new Scanner(System.in);
		int guess;
		boolean win = false;
		
		while (win == false) {
			
			System.out.println("Enter a guess between 1 and 10000:");
			guess = input.nextInt();
			tries++;
			
			if (guess == numberToGuess) {
				win = true;
			}
			else if (guess < numberToGuess) {
				System.out.println("Higher");
			}
			else if (guess > numberToGuess) {
				System.out.println("Lower");
			}
		}
		System.out.println("You WIN. It took you " + tries + " guesses.");
	}
}
