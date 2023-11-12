package library_practice;
import java.util.Scanner;
import java.util.Iterator;

public class ticTacToe 
{

	public static void main(String[] args) 
	{
		char board[][] = new char[3][3];
		for(int row = 0 ; row < board.length ; row++)
		{
			for(int col = 0 ; col < board.length ; col++)
			{
				board[row][col]=' ';
			}

		}

		char player  = 'X';
		boolean gameOver = false;
		Scanner scanner = new Scanner(System.in);

		while(!gameOver)
		{
			printBoard(board);
			System.err.print("Player "+player+" \nEnter your position : ");
			int row1 = scanner.nextInt();
			int col1 = scanner.nextInt();
			System.out.println();

			if(row1<4 && col1<4)
			{
				int row = row1-1;
				int col = col1-1;
				if(board[row][col] == ' ')
				{
					board[row][col] = player;
					gameOver = haveWon(board,player);
					if(gameOver)
					{
						System.out.println("Player "+player+" has won the game");
					}
					else
					{
						player = (player == 'X')?'O':'X';
					}

				}
				else
				{
					System.out.println("Invalid move try again..");
				}
			}
			else
			{
				System.out.println("Please enter positions from 1 to 3 only");
			}
		}

		printBoard(board);
	}
	public static boolean haveWon(char board[][],char player)
	{
		for(int row  = 0 ; row < board.length ; row++)
		{
			if(board[row][0]== player && board[row][1]== player && board[row][2]== player)
			{
				return true;
			}
		}
		for(int col = 0 ; col <board.length ; col++)
		{
			if(board[0][col]==player && board[1][col]==player && board[2][col]==player)
			{
				return true;
			}
		}

		if(board[0][0] == player && board[1][1] == player && board[2][2] == player )
		{
			return true;
		}
		else if(board[0][2] == player && board[1][1] == player && board[2][0] == player )
		{
			return true;
		}
		else
		{
			return false; 
		}

	}
	public static void printBoard(char board[][])
	{
		int count = 1;
		for(int row = 0 ; row < board.length ; row++)
		{
			for(int col = 0 ; col < board.length ; col++)
			{
				
					System.out.print(board[row][col]+" |");
				
			}
			int n = row+1;
			System.out.println("  --> Row : "+n+", columns : "+1+","+2+","+3);
		}

	}

}
