//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 2
//=======================================
import java.util.*;

// This program creates a Tic Tac Toe game for players

public class TicTac {
	//In this method the board for the game is printed
	public static void printGame(String[][] input ) {
		//The outer loop controls the rows for the array(which stores the x's and o's)
		 for(int i = 0; i< input.length; i++){
			 System.out.println("-------------");
			 //The inner loop controls the columns for the array. I use print statements to print the array row values side by side.
			 for(int j = 0; j<input[i].length; j++) {
				 System.out.print(": " + input[i][j] + " ");
				 //The right edge of the board has a border that is printed. I use this constraint because the code in the loop causes a "fence post" problem.
				 if(j == 2) {
					 System.out.print(":");
				 }
			 }
			 System.out.println();
		 }
		 //The bottom edge of the board is printed
		 System.out.println("-------------");
	}
	//This method checks to see if there is a winner. If a line of x's or o's is present in the board, there is a winner.
	public static boolean checkScore(boolean x, String[][] array) {
		if(array[0][0] == "x" && array[0][1] == "x" && array[0][2]=="x") {
			x = true;
		}
		else if (array[1][0] == "x" && array[1][1] == "x" && array[1][2]=="x"){
			x = true;
		}
		else if (array[2][0] == "x" && array[2][1] == "x" && array[2][2]=="x") {
			x = true;
		}
		else if (array[0][0] == "x" && array[1][0] == "x" && array[2][0]=="x") {
			x = true;
		}
		else if (array[0][1] == "x" && array[1][1] == "x" && array[2][1]=="x") {
			x = true;
		}
		else if (array[0][2] == "x" && array[1][2] == "x" && array[2][2]=="x") {
			x = true;
		}
		else if(array[0][0] == "x" && array[1][1] == "x" && array[2][2]=="x") {
			x = true;
		}
		else if (array[0][2] == "x" && array[1][1] == "x" && array[2][0]=="x") {
			x = true;
		}
		
		if(array[0][0] == "o" && array[0][1] == "o" && array[0][2]=="o") {
			x = true;
		}
		else if (array[1][0] == "o" && array[1][1] == "o" && array[1][2]=="o"){
			x = true;
		}
		else if (array[2][0] == "o" && array[2][1] == "o" && array[2][2]=="o") {
			x = true;
		}
		else if (array[0][0] == "o" && array[1][0] == "o" && array[2][0]=="o") {
			x = true;
		}
		else if (array[0][1] == "o" && array[1][1] == "o" && array[2][1]=="o") {
			x = true;
		}
		else if (array[0][2] == "o" && array[1][2] == "o" && array[2][2]=="o") {
			x = true;
		}
		else if(array[0][0] == "o" && array[1][1] == "o" && array[2][2]=="o") {
			x = true;
		}
		else if (array[0][2] == "o" && array[1][1] == "o" && array[2][0]=="o") {
			x = true;
		}
		
		//The boolen returns true is there is a winner found.
		return x;
	}
	public static void main(String[] args) {
		//The 2d array gameBoard is set to the size 3x3 and set to the values of "-" for every index
		String[][] gameBoard = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
		boolean winnerFound = false;
		//The strings player1 and player2 determine what letter is used for the players
		String player2 = "o";
		String player1 = "x";
		//I set the variable last turn to playerTwo because the program starts by giving the turn to player1
		String lastTurn = player2;
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to play TicTacToe game! We have the following empty board.");
		printGame(gameBoard);
		//The game is played until a winner is found
		while(winnerFound == false) {
			int rowIndex = 0;
			int columnIndex = 0;
			//The player chooses the row and column index of their play
			System.out.print("Enter the row index: ");
			rowIndex = console.nextInt();
			System.out.print("Enter the column index: ");
			columnIndex = console.nextInt();
			//The if else statement determines which player is able to play
			if(lastTurn == player2) {
				gameBoard[rowIndex][columnIndex] = player1;
				lastTurn = player1;
			} 
			else {
				gameBoard[rowIndex][columnIndex] = player2;
				lastTurn = player2;
			}
			printGame(gameBoard);
			//After a player places their marker, the program checks to see if there is a winner
			winnerFound = checkScore(winnerFound, gameBoard);
		}
		//After the while loop is finished, a winner would have been found
		System.out.println("We have a winner! Congrats!");
	}
}
