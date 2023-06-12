import acm.program.*;
import acm.graphics.*;
import java.awt.*;
 
public class OlympicRings2 extends GraphicsProgram {
	
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
		GOval blue1 = new GOval(201, 101, 98, 98);
		GOval blue2 = new GOval(199, 99, 102, 102);
		blue.setColor(Color.BLUE);
		blue1.setColor(Color.BLUE);
		blue2.setColor(Color.BLUE);
		add(blue);
		add(blue1);
		add(blue2);
		
	}
	
	public void ringBlack(){
		GOval black = new GOval (320, 100, 100, 100);
		GOval black1 = new GOval (321, 101, 98, 98);
		GOval black2 = new GOval (319, 99, 102, 102);
		black.setColor(Color.BLACK);
		black1.setColor(Color.BLACK);
		black2.setColor(Color.BLACK);
		add(black);
		add(black1);
		add(black2);
	}
	
	public void ringRed(){
		GOval red = new GOval (440, 100, 100, 100);
		GOval red1 = new GOval (441, 101, 98, 98);
		GOval red2 = new GOval (439, 99, 102, 102);
		red.setColor(Color.RED);
		red1.setColor(Color.RED);
		red2.setColor(Color.RED);
		add(red);
		add(red1);
		add(red2);
	}
	
	public void ringYellow(){
		GOval yellow = new GOval (260, 170, 100, 100);
		GOval yellow1 = new GOval (261, 171, 98, 98);
		GOval yellow2 = new GOval (259, 169, 102, 102);
		yellow.setColor(Color.YELLOW);
		yellow1.setColor(Color.YELLOW);
		yellow2.setColor(Color.YELLOW);
		add(yellow);
		add(yellow1);
		add(yellow2);
	}
	
	public void ringGreen(){
		GOval green = new GOval (380, 170, 100, 100);
		GOval green1 = new GOval (381, 171, 98, 98);
		GOval green2 = new GOval (379, 169, 102, 102);
		green.setColor(Color.GREEN);
		green1.setColor(Color.GREEN);
		green2.setColor(Color.GREEN);
		add(green);
		add(green1);
		add(green2);
	}
	
}
