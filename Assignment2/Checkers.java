import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Checkers extends GraphicsProgram{
	
	public void run (){
		board( getWidth(), getHeight() );
		checkersRed();
		checkersBlack();
	}
	
	private void board (double cx, double cy){
		double sqSize = (double) getHeight() / N_ROWS;
		for ( int i = 0; i < N_ROWS; i++){
			for ( int j =0; j < N_COLUMNS; j++){
				double x =  ((j * sqSize) + getWidth()/4) - sqSize;
				double y =  i * sqSize;
				GRect sq = new GRect ( x , y, sqSize, sqSize);
				sq.setFilled((i+j) % 2 != 0);
				sq.setColor(Color.GRAY);
				add(sq);
				
			}
		}
	}
	
	private void checkersRed () {
		double sqSize = (double) getHeight() / N_ROWS;
		for ( int i = 0; i < 3; i++){
			for ( int j = 0; j < N_COLUMNS; j++){
				double x =  ((j * sqSize) + getWidth()/4) - sqSize;
				double y =  i * sqSize;
				if ((i+j) % 2 != 0){
				GOval ovalR = new GOval ( x + 10, y + 10, sqSize -20, sqSize-20);
				ovalR.setFilled ((i+j) % 2 != 0);
				ovalR.setColor(Color.RED);
				add(ovalR);
				}
			}
		}
	}
	
	private void checkersBlack () {
		double sqSize = (double) getHeight() / N_ROWS;
		for ( int i = 0; i < 3; i++){
			for ( int j = 0; j < N_COLUMNS; j++){
				double x =  ((j * sqSize) + getWidth()/4) - sqSize;
				double y =  (i * sqSize) + 5 * sqSize;
				if ((i+j) % 2 != 1){
				GOval ovalR = new GOval ( x + 10, y + 10, sqSize -20, sqSize-20);
				ovalR.setFilled ((i+j) % 2 != 1);
				ovalR.setColor(Color.BLACK);
				add(ovalR);
				}
			}
		}
	}
	
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
}
