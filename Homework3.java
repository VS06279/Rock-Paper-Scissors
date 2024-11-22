//Vikrant Suryadevara
import java.util.Scanner;
import java.util.Random;
public class Homework3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean PlayAgain = true;
		
//make a while loop here, this will connect to the end where the program asks the user if they want to play again. If the suer selects yes, it will come back to here
		while(PlayAgain) {
		System.out.println("Welcome to Rock Paper Scissors! When typing your input, make sure you type in a number and not a letter. Whoever wins 2 rounds out of 3 rounds wins!");
		int Wins = 0;
		int Losses = 0;
		for ( int i=0; i <3; i++) {	
	System.out.println(); //We put a blank print line here in order to give space between each line in the output so it can be more readable/accessible to the user.
	System.out.println("Pick between Rock (input 0 for Rock), Paper (input 1 for Paper), or Scissors (input 2 for Scissors).");
	Random Computer = new Random();
	int Number = Computer.nextInt(3); //there is a 3 in the parentheses because the computer will only input numbers from [0,2]. The 3 is a "boundary number" that is not counted.
	int choice = scanner.nextInt();
	String decision = " ";
	String ComputerDecision = " ";
	if (choice < 0 || Number > 2 || choice >= 3) {
		System.out.println("There has been an error in the system! Please try again!");
	}

	switch(choice) //this is the User input's choices
	{
		case 0:
			decision = "Rock";
			break;
		case 1:
			decision = "Paper";
			break;
		case 2:
			decision = "Scissors";
			break;
		}
	switch (Number) { //this is the Computer's input choices
	case 0:
		decision = "Rock";
		break;
	case 1:
		decision = "Paper";
		break;
	case 2:
		decision = "Scissors";
		break;
		}
	
	//gives the results of the rock-paper-scissors match
		//this is for when the both the user and computer pick the same option.
		if(choice == Number) {
		System.out.println("It's a tie! Both the computer and the player wins this round!");
		//this is the results for when computer wins for all possibilities
		} else if (choice == 0 && Number == 1) {
			System.out.println("Rock Vs Paper = Paper wins!");
			System.out.println("the Computer gains one point");
			Losses++;
		} else if(choice == 1 && Number ==2) {
			System.out.println("Paper vs Scissors = Scissors wins!");
			System.out.println("the Computer gains one point");
			Losses++;
		} else if(choice == 2 && Number == 0) {
			System.out.println("Scissors vs Rock = Rock wins!");
			System.out.println("the Computer gains one point");
			Losses++;
			//this is the results for when the user wins for all possibilities 
		} else if (choice == 1 && Number == 0) {
			System.out.println("Paper Vs Rock = Paper wins!");
			System.out.println("the User gains one point");
			Wins++;
		} else if (choice == 2 && Number == 1) {
			System.out.println("Scissors vs Paper = Scissors wins!");
			System.out.println("the User gains one point");
			Wins++;
		} else if(choice == 0 && Number == 2) {
			System.out.println("Rock vs Scissors = Rock wins!");
			System.out.println("the User gains one point");
			Wins++;
		}
		//Stops the game and goes to the ending if the user wins 3 rounds
		if (Wins ==3) {
            break;
        }	
	}
		//the code that determines who won the 3 rounds (recall that this is a best out of two)
		if(Wins ==2) {
			System.out.println();
			System.out.println("Congratulations! You have won! Would you like to play again? type in Yes or No, the answers are NOT case sensitive.");
			} else if (Losses == 2) {
				System.out.println();
				System.out.println("You lost! Do you want to play again? type in Yes or No, the answers are NOT case sensitive.");
			} else if(Wins == Losses) {
				System.out.println();
				System.out.println("It's a tie! Both the computer and the User wins!");
			}
		System.out.println("Do you want to play again? type in Yes or No, the answers are NOT case sensitive.");
		scanner.nextLine(); //I had to put this in here since without this. The program will almost always give the "Invalid input. Terminating the program." output.
		String playAgain = scanner.nextLine();
		if(playAgain.equalsIgnoreCase("Yes")) {
			System.out.println();
			System.out.println("Starting a new game!");
		} else if(playAgain.equalsIgnoreCase("No")) {
			PlayAgain = false;
			System.out.println("Terminating the program!");
		} else {
			System.out.println("Invalid input. Terminating the program.");
			PlayAgain = false;
		}
		
	}
  }	
}