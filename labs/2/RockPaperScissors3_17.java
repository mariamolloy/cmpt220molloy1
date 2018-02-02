import java.util.Scanner;

public class RockPaperScissors3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your move: rock (0), paper (1), or scissors (2): ");
		int pMove = input.nextInt();
		String player = "";
		if (pMove == 0)
			player = "rock";
		else if (pMove == 1)
			player = "paper";
		else if (pMove == 2)
			player = "scissors";
		
		int cMove = (int)(Math.random() * 3);
		String comp = "";
		if (cMove == 0)
			comp = "rock";
		else if (cMove == 1)
			comp = "paper";
		else if (cMove == 2)
			comp = "scissors";
		
		if (pMove == cMove) {
			System.out.println("Computer is " + comp + ". " + "You are " + player + ". " + "It is a tie.");
		}
		else if (((cMove == 0) && (pMove == 2)) || ((cMove == 1) && (pMove == 0)) || ((cMove == 2) && (pMove ==1))) {
			System.out.println("Computer is " + comp + ". " + "You are " + player + ". " + "Computer wins.");
		}
		else if (((pMove == 0) && (cMove == 2)) || ((pMove == 1) && (cMove == 0)) || ((pMove == 2) && (cMove ==1))) {
			System.out.println("Computer is " + comp + ". " + "You are " + player + ". " + "Player wins.");
		}
		else {
			System.out.println("Please enter 0, 1, or 2.");
		}
		

	}

}
