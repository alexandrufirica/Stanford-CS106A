import acm.program.*;

public class SlotChoose extends ConsoleProgram{
	
	private String rank1;
	private String rank2;
	private String rank3;
	private String answer;
	

	public SlotChoose (String rank1, String rank2, String rank3, String answer){
		
		this.rank1 = rank1;
		this.rank2 = rank2;
		this.rank3 = rank3;
		this.answer = answer;
		
	}

	public String toString (){
		
		return ( rank1 +"  " + rank2 + "  " + rank3 + " -- " + answer );
	}

}
