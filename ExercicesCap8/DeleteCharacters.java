import acm.program.*;

public class DeleteCharacters extends ConsoleProgram {

	public void run(){
		while (true){
			println ( "This program remove the specified character from a text");
			String line = readLine("Enter text line: ");
			String ch = readLine ("Enter what character want to remove: ");
			if ( line.length() == 0 ) break;
			println(removeAllOccurences(line, ch));
		}
	}

		private String removeAllOccurences ( String line, String ch){
		while (true){
			int pos = line.indexOf(ch);
			int pes = line.indexOf(ch) + ch.length();
			if (pos>= 0) {
				line = line.substring(0,pos) + line.substring(pes);
			} else break;
		}
		return line;
	}

}
