import java.util.Random;

public class TwoPlayers {
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
			Random r = new Random();
			return r.nextInt(3);
		}
	
		public static int ladder(int cp, int dice_no) {
			cp = cp+dice_no;
			if(cp>100) {cp = cp-dice_no; return cp;}
			return cp;
		}
		public static int snake(int cp,int dice_no) {
			cp = cp-dice_no;
			if(cp<0) {
				return 0;
			}
			return cp;
		}
		public static int checkOption(int option,int position,int dice_no) {
			if(option == 0)
				return position;
			else if(option ==1)
				return ladder(position,dice_no);
			else if(option ==2)
				return snake(position,dice_no);
			
			return 0;
		}
	
		
	public static void main(String args[]) {
		System.out.println("Two Players Snakes and Ladders!!");
		int cp1=0,cp2 =0;
		int op1, op2;
		int dice_no1, dice_no2;
		while(cp1 !=100 && cp2!=100) {
			//Assuming player 1 plays first
			dice_no1 = rollDice();
			op1 = chance();
//			cp1+=checkOption(op1,cp1,dice_no1);
			if(op1 == 1) {
				cp1=checkOption(op1,cp1,dice_no1);
				int oop1 = op1;
				while(oop1 == 1) {
					oop1 = chance();
					System.out.println("PLayer 1 is on "+cp1);
					System.out.println("Second chance for player 1: "+oop1);
					if(oop1 !=0)
						cp1=checkOption(oop1,cp1,rollDice());
				}
			}
			else if(op1!=0) {
				cp1=checkOption(op1,cp1,dice_no1);
			}
			System.out.println("PLayer 1 is on "+cp1);
			
			//Now PLayer 2 plays
			dice_no2 = rollDice();
			op2 = chance();
//			cp1+=checkOption(op1,cp1,dice_no1);
			if(op2 == 1) {
				cp2=checkOption(op2,cp2,dice_no2);
				int oop2 = op2;
				while(oop2 ==1) {
					oop2 = chance();
					System.out.println("PLayer 2 is on "+cp2);
					System.out.println("Second Chance for player 2: "+oop2);
					if(oop2!=0)
					cp2=checkOption(oop2,cp2,rollDice());
				}
			}
			else if(op2!=0) {
				cp2=checkOption(op2,cp2,dice_no2);
			}
			System.out.println("PLayer 2 is on "+cp2);

	}
		if(cp1==100)
		System.out.println("PLayer 1 wins");
		if(cp2 == 100)
		System.out.println("PLayer 2 wins");
}
}




