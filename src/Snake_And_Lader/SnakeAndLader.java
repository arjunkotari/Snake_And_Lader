package Snake_And_Lader;

public class SnakeAndLader {

	public static void main(String[] args) {
		final int noPlay = 0;
		final int lader = 1;
		//Welcome message.
		System.out.println("Welcome to Snake and Lader simulator...");
		//game played with single player at start position 0.
		int player0=0;
		System.out.println("Starting position of player0 is: "+player0);
		/*
		 * The Player rolls the die to get a number between 1 to 6.
		 */

		//System.out.println("Role die is: " + rollDie);
		/*
		 * checks for a Option. They are No Play,Ladder or Snake.	
		 */		
		while (player0 <=100)
		{
			int rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
			int checkOption= (int) (Math.floor(Math.random() * 10) % 3);
			switch(checkOption) {		
			case noPlay:
				System.out.println("No play. Player position is: "+player0);
				break;
			case lader:
				player0 += rollDie;
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
		}			
	}
}
