import acm.program.*;
import javax.swing.*;
import java.awt.event.*;

public class FirstButton extends ConsoleProgram {
	
	public void init(){
		setFont ("Courier-24");
		
		add(new JButton ("HI"), SOUTH);
		addActionListeners();
		
	}
	
	public void actionPerformed (ActionEvent e){
		String cmd = e.getActionCommand();
		if(cmd.equals("HI")){
			println("Hello there");
		}
	}

}
