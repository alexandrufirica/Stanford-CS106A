import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NewFirstButton extends ConsoleProgram {
	
	public void init() {
		setFont("Courier-20");
		
		hiButton = new JButton("HI");
		add(hiButton, SOUTH);
		addActionListeners();
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(hiButton == e.getSource()){
			println("Hello there");
		}
		
	}
	private JButton hiButton;

}
