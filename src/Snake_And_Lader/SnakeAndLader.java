package Snake_And_Lader;

public class SnakeAndLader {

	public static void main(String[] args) {
		//Welcome message.
		System.out.println("Welcome to Snake and Lader simulator...");
		//game played with single player at start position 0.
		int player0=0;
		System.out.println("Starting position of player0 is: "+player0);
		/*
		 * The Player rolls the die to get a number between 1 to 6.
		 */
		int rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
		System.out.println("Role die is: " + rollDie);
		}
}
