import acm.program.*;
import acm.graphics.*;
import java.awt.*;
 
public class OlympicRings extends GraphicsProgram {
	
	public void run(){
		logo();
	}
	
	public void logo(){
		ringBlue();
		ringBlack();
		ringRed();
		ringYellow();
		ringGreen();
	}
	
	public void ringBlue(){
		GOval blue = new GOval(200, 100, 100, 100);
		blue.setColor(Color.BLUE);
		add(blue);
		
	}
	
	public void ringBlack(){
		GOval black = new GOval (320, 100, 100, 100);
		black.setColor(Color.BLACK);
		add(black);
	}
	
	public void ringRed(){
		GOval red = new GOval (440, 100, 100, 100);
		red.setColor(Color.RED);
		add(red);
	}
	
	public void ringYellow(){
		GOval yellow = new GOval (260, 170, 100, 100);
		yellow.setColor(Color.YELLOW);
		add(yellow);
	}
	
	public void ringGreen(){
		GOval green = new GOval (380, 170, 100, 100);
		green.setColor(Color.GREEN);
		add(green);
	}
	
}
