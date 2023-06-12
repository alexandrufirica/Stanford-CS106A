import acm.program.*;
import acm.util.*;


public class RandomCard2 extends ConsoleProgram{
	
	public void run () {
		println ("This program dispays the name of a card randomly.");
		println ( "");
		Card2 randomCard = selectCardRandomly();
		println (randomCard);
		
	}
	
	private Card2 selectCardRandomly (){
		String rank = selectRank();
		String suit = selectSuit();
		return ( new Card2(rank, suit));
	}
	
	
	private String selectRank () {
		int cardRank;
		cardRank = rgen.nextInt(1, 13);
		switch ( n ) {
			case 1 : return ("Ace"); 
			case 11 : return ("Jack"); 
			case 12 : return ("Queen"); 
			case 13 : return ("King"); 
			default: return "" + cardRank;
	           
		
		}
	}
	
	private String selectSuit () {
		String cardSuit;
		s = rgen.nextInt(1, 4);
		switch ( s ){
			case 1 : cardSuit = ("Clubs"); break;
			case 2 : cardSuit = ("Diamonds"); break;
			case 3 : cardSuit = ("Hearts"); break;
			case 4 : cardSuit = ("Spades"); break;
			default:
	            cardSuit = "no card";
	            break;
			}
		return cardSuit;
		}
		
	
	private int n;
	private int s;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
