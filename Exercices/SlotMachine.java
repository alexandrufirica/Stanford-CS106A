import acm.program.*;
import acm.util.*;

public class SlotMachine extends ConsoleProgram{
	
	public void run() {
		String answer = readLine ("Would you like instructions? ");
		askYesNoQueston(answer);
		
		while (curentStake > 0){
			String answer2 = readLine ("You have " + curentStake + "$. Would you like to play? ");
			if ( answer2.equals("yes")){
				play();
				if (curentStake == 0){
					println ("You're out of money!"); break;
				}
			}else if ( answer2.equals("no")){
				println ("Good bye!"); break;
			}else { 
				println ("Invalid answer, yes / no requested.");
				answer2 = readLine ("You have " + curentStake + "$. Would you like to play? ");
			}
		}
	}

	private void play(){
		if (curentStake > 0){
			curentStake = newStake;
			SlotChoose randomSlot = selectSlot();
			println (randomSlot);
			curentStake = curentStake - ROLL_COST;
			if ( rank1.equals("CHERRY")){
				newStake += 2;
			}else if (rank1.equals("LEMON")){
				newStake = curentStake;
			}
			if (rank1.equals("CHERRY")){
				if ( rank2.equals("CHERRY")){
					newStake += 5;
				}else if (rank1.equals("LEMON") || rank2.equals("LEMON") || rank3.equals("LEMON")){
					newStake = curentStake;
					}
			}
			
			if(rank1.equals("CHERRY")){
				if(rank2.equals("CHERRY")){
					if ( rank3.equals("CHERRY")){
						newStake += 7;
					}else if (rank1.equals("LEMON") || rank2.equals("LEMON") || rank3.equals("LEMON")){
						newStake = curentStake;
						}
				}	
			}
			
			if ( rank1.equals("ORANGE")){
				if ( rank2.equals("ORANGE")){
					if ( rank3.equals("ORANGE") || rank3.equals("BAR")){
						newStake += 10;
					}
				}
			}
			
			if ( rank1.equals("PLUM")){
				if ( rank2.equals("PLUM")){
					if ( rank3.equals("PLUM") || rank3.equals("BAR")){
						newStake += 14;
					}
				}
			}
			
			if ( rank1.equals("BELL")){
				if ( rank2.equals("BELL")){
					if ( rank3.equals("BELL") || rank3.equals("BAR")){
						newStake += 20;
					}
				}
			}
			
			if ( rank1.equals("BAR")){
				if ( rank2.equals("BAR")){
					if (rank3.equals("BAR")){
						newStake += 250;
					}
				}
			}
			
			
		}	
			
			
					
		
	}
	
	
	private  SlotChoose selectSlot () {
		 String rank1 = slot1();
		 String rank2 = slot2();
		 String rank3 = slot3();
		 String answerWin = winOrLose();
		 return (new SlotChoose( rank1, rank2, rank3, answerWin));
		
	}
	
	
	private String slot1(){
		
		n1 = rgen.nextInt(1, 6);
		switch (n1) {
			case 1 : rank1 = "CHERRY"; break;
			case 2 : rank1 = "LEMON"; break;
			case 3 : rank1 = "ORANGE"; break;
			case 4 : rank1 = "PLUM"; break;
			case 5 : rank1 = "BELL"; break;
			case 6 : rank1 = "BAR"; break;
			default : rank1 = "-"; break;
		}
		return rank1;
		
	}
	
	private String slot2(){
	
		n2 = rgen.nextInt(1, 6);
		switch (n2) {
			case 1 : rank2 = "CHERRY"; break;
			case 2 : rank2 = "LEMON"; break;
			case 3 : rank2 = "ORANGE"; break;
			case 4 : rank2 = "PLUM"; break;
			case 5 : rank2 = "BELL"; break;
			case 6 : rank2 = "BAR"; break;
			default : rank2 = "-"; break;
		}
		return rank2;
	}

	private String slot3(){
	
		n3 = rgen.nextInt(1, 6);
		switch (n3) {
			case 1 : rank3 = "CHERRY"; break;
			case 2 : rank3 = "LEMON"; break;
			case 3 : rank3 = "ORANGE"; break;
			case 4 : rank3 = "PLUM"; break;
			case 5 : rank3 = "BELL"; break;
			case 6 : rank3 = "BAR"; break;
			default : rank3 = "-"; break;
		}
		return rank3;
	
	}
	
	private String winOrLose(){
		if ( newStake > curentStake){
		answerWin = "You win.";
		}else{
		answerWin = "You lost.";
		}
		
		
		return answerWin;
		
	}
	
	private String askYesNoQueston (String answer){
		if (answer.equals ("yes")){
			println ("This is a slot machine game, you have 50$ to play.");
			println ("Every roll cost 1$. Have fun! ");
		}else if (answer.equals ("no")){
			println("Have fun!");
		}else{	
				println ("Invalid answer, yes / no requested.");
				answer = readLine ("Would you like instructions? ");
		}
		
		return answer;
	}
	
	private int curentStake = INITIAL_STAKE;
	private int newStake = curentStake;
	private String rank1;
	private String rank2;
	private String rank3;
	private String answerWin;
	private int n1;
	private int n2;
	private int n3;
	
	private static final int ROLL_COST = 1;
	private static final int INITIAL_STAKE = 50;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
