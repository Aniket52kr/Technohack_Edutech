package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;
class game{
	public int number;
	public int inputnumber;
	public int noOfGuesses = 0;
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	public void setNoOfGuesses(int noOfguesses) {
		this.noOfGuesses = noOfGuesses;
	}
	game(){
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	void takeuserInput() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputnumber = sc.nextInt();
	}
	boolean isCorrectNumber(int number) {
		noOfGuesses++;
		if(inputnumber == number) {
			System.out.format("Congratulations You Guessed is right.....\nIt was %d\nYou Guessed it in %d attempts",number,noOfGuesses);
			return true;
		}
		else if(inputnumber<number) {
			System.out.println("Too Low....");
		}
		else if(inputnumber>number) {
			System.out.println("Too High");
		}
		return false;
	}
}
public class NumberGuessingGame {

	public static void main(String[] args) {
		game g = new game();
		boolean b = false;
		while(!b) {
			g.takeuserInput();
			b = g.isCorrectNumber(176);
		}

	}

}
