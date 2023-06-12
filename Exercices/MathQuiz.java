import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram{
	
	public void run(){
		println ( " Welcome to Math Quiz!");
		for ( int i = 0; i < NO_OF_QUESTIONS; i++){
			askQuestion();
			studentAnswer();
		}
	}
	
	
	
	private void askQuestion(){
		if (rgen.nextBoolean()){
			adition();
		}else{
			substraction();
		}
	}
	
	
	private void adition(){
		 a = rgen.nextInt(MIN_RANGE, MAX_RANGE);
		 b = rgen.nextInt(MIN_RANGE, (MAX_RANGE - a));
		 answer = a + b;
		 print ( "What is " + a + " + " + b + "?" );
		 
	}	
	
	private void substraction(){
		 a = rgen.nextInt(MIN_RANGE, MAX_RANGE);
		 b = rgen.nextInt(MIN_RANGE, MAX_RANGE);
		 if ( a > b) {
			 answer = a - b;
			 print ( "What is " + a + " - " + b + "?" );
		 }else{
			 answer = b - a;
			 print ("What is " + b + " - " + a + "?" );
		 }
	}
	
	private void studentAnswer(){
		int tryNum = 1 ;
		while (true){
			response = readInt();
			if ( answer == response){
				println ( congrat());
				break;
			}else if ( tryNum < NO_OF_CHANCES){
				print ( "That's incorrect - try a different answer: ");
				tryNum++;
			}else{
				println ("No, the answer is " + answer + ".");
				break;
			}
		}
	}
	
	private String congrat(){
		
		switch(rgen.nextInt(1,5)){
		
		case 1: return "That's the answer!";
		case 2:	return "Correct!";
		case 3:	return "You got it!";
		case 4:	return "Great answer!";
		case 5:	return "You awsome!";
		default : return "" ;
		
		}
	}
	
	private int a;
	private int b;
	private int answer;
	private int response;
	
	private static final int NO_OF_QUESTIONS = 5;
	private static final int MIN_RANGE = 0;
	private static final int MAX_RANGE = 20;
	private static final int NO_OF_CHANCES = 3;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
