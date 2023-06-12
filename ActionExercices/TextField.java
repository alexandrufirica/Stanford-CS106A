import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class TextField extends ConsoleProgram {
	
	public void init(){
		setFont("Courier-24");
		
		tf = new JTextField(10);
		add(new JLabel ("Name : "), SOUTH);
		add (tf, SOUTH);
		tf.addActionListener(this);
		
	}
	
	public void actionPerformed ( ActionEvent e) {
		if ( e.getSource()== tf){
			println("Hello " + tf.getText() + "!" );
		}
	}

	private JTextField tf;
}
