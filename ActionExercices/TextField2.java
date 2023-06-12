import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class TextField2 extends ConsoleProgram {
	
	public void init(){
		setFont("Courier-24");
		
		tf = new JTextField(10);
		
		tf.setActionCommand("name");
		
		add(new JLabel ("Name : "), SOUTH);
		add (tf, SOUTH);
		tf.addActionListener(this);
		
	}
	
	public void actionPerformed ( ActionEvent e) {
		if ( e.getActionCommand().equals("name")){
			println("Hello " + tf.getText() + "!" );
		}
	}

	private JTextField tf;
}
