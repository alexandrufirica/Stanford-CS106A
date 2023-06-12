import acm.program.*;	
import java.util.*;

public class UniqueNames extends ConsoleProgram {
	
	public void run(){
		ArrayList<String> nameList = new ArrayList<String>();
		while (true){
			String name = readLine ("Enter name: ");
			if (name.equals("")) break;
			if ( !nameList.contains(name)){
				nameList.add(name);
			}
		}
		println ("Unique name list contains: ");
		printList(nameList);
	}
	
	public void printList (ArrayList list){
		for ( int i = 0; i <= list.size(); i++){
			println (list.get(i));
		}
	}

}
