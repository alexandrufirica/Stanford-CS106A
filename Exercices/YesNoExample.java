import acm.program.*;	

public class YesNoExample extends ConsoleProgram{
	
	public void run(){
		String answer = readLine("Would you like instructions? ");
		askYesNoQueston(answer);
		if (answer != "yes"){
			if(answer != "no"){
			String answer2 = readLine("Would you like instructions? ");
			askYesNoQueston(answer2);
			}
		}
		
	}

	private String askYesNoQueston (String answer){
		if (answer.equals ("yes")){
			println("true");
		}else if (answer.equals ("no")){
			println("false");
		}else{	
				println ("Invalid answer, yes / no requested.");
		}
		
		return answer;
	}
}
