import java.util.*;

public class SnakesLadders {

	// Constant Variables
	final static int Max_Count_Board = 100;
	final static int NO_PLAY = 0;
	final static int PLAY_LADDER = 1;
	final static int SNAKE_EATS = 2;

	// Player Rolls the dice
	public static int rollDice() {
		int n = 0;
		Random r = new Random();
		n = r.nextInt(7);
		return (n == 0 ? 1 : n);
	}

	//Random generating OPtions
	public static int chance() {
		int n = 0;
		Random r = new Random();
		n = r.nextInt(3);
		return (n == 0 ? 0 : n);
	}

	// Checks the Options and updates the position
	public static void useCases1to6() {
		int currentPosition = 0, noOfRolls = 0;

		int dice_number;

		int chance;
		while (currentPosition != 100) {
			// PLayer rolls the die then checks the option
			dice_number = rollDice();
			System.out.println("Dice value is :" + dice_number);
			noOfRolls++;
			chance = chance();
			System.out.println("Chance is " + chance);
			switch (chance) {
			case 0:
				break;
			case 1:
				currentPosition = currentPosition + dice_number;
				if (currentPosition > 100) {
					System.out.println("PLayer position went above 100!!");
					currentPosition = currentPosition - dice_number;
				}

				break;
			case 2:
				currentPosition -= dice_number;
				if (currentPosition < 0) {
					System.out.println("PLayer position went below 0!!");
					currentPosition = 0;
				}
				break;
			default:
				break;
			}

			System.out.println("Current Position is: " + currentPosition);
		}

		System.out.println("Dice was rolled " + noOfRolls + " times!!");

	}

	public static void twoPlayer() {

	}

	public static void main(String args[]) {
		System.out.println("Snakes and ladders");
//		gamePlay();
		useCases1to6();

		twoPlayer();
	}

}
