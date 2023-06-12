import acm.program.*;

public class Card2 extends ConsoleProgram{
	
	private String rank ;
	private String suit;
	
	public Card2 ( String rank, String suit)
	{
		this.rank= rank;
		this.suit= suit;
	}
	
	public String toString (){
		
		return ( rank + " of " + suit );
	}

}
