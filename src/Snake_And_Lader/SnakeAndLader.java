package Snake_And_Lader;

public class SnakeAndLader {

	public static void main(String[] args) {
		final int noPlay = 0;
		final int lader = 1;
		int count = 0;
		//Welcome message.
		System.out.println("Welcome to Snake and Lader simulator...");
		//game played with double player at start position 0.
		int player0=0;
		System.out.println("Starting position of player0 is: "+player0);
		int player1=0;
		System.out.println("Starting position of player1 is: "+player1);
		/*
		 * checks for a Option. They are No Play,Ladder or Snake.	
		 */		
		while (player0 !=100 && player1 != 100)
		{
			if(count %2 == 0)
			{
				System.out.println("Player0 turn...");
				int rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
				int checkOption= (int) (Math.floor(Math.random() * 10) % 3);
				switch(checkOption) {		
				case noPlay:
					System.out.println("No play. Player position is: "+player0);
					break;
				case lader:
					player0 += rollDie;
					/*
					 * In case the player position go above 100, the player stays in the same previous position
					 */
					if(player0 >= 101) {
						player0 -= rollDie;
					}
					System.out.println("Congrats you got lader. Roll die is: "+rollDie +" Position is: "+player0);
					break;
				default:
					player0 -= rollDie;
					/*
					 * player position moves below 0, then the player restarts from 0th position.
					 */
					if (player0 <= 0 )
					{
						player0 = 0;
					}								
					System.out.println("Attecked by snake. Roll die is: "+rollDie +" Position is: "+player0);
					}
				/*
				 * Counting number of times the dice was played to win the game
				 */
				count++;
			}
			else {
				System.out.println("Player1 turn...");
				int rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
				int checkOption= (int) (Math.floor(Math.random() * 10) % 3);
				switch(checkOption) {		
				case noPlay:
					System.out.println("No play. Player position is: "+player1);
					break;
				case lader:
					player1 += rollDie;
					/*
					 * In case the player position go above 100, the player stays in the same previous position
					 */
					if(player1 >= 101) {
						player1 -= rollDie;
					}
					System.out.println("Congrats you got lader. Roll die is: "+rollDie +" Position is: "+player1);
					break;
				default:
					player1 -= rollDie;
					/*
					 * player position moves below 0, then the player restarts from 0th position.
					 */
					if (player1 <= 0 )
					{
						player1 = 0;
					}								
					System.out.println("Attecked by snake. Roll die is: "+rollDie +" Position is: "+player1);
					}
				/*
				 * Counting number of times the dice was played to win the game
				 */
				count++;
			}
			System.out.println();
		}	
		if(player0 == 100)
			System.out.println("player0 own the game...");
		else
			System.out.println("Player1 own the game...");
		System.out.println("Total Dice count is: "+count);
	}
}
