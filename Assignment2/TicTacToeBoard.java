/*
 * File: TicTacToeBoard.java
 * -------------------------
 * This program draws a Tic-Tac-Toe board as an illustration
 * of the GLine class.  The version uses explicit coordinate
 * values which makes the program difficult to extend or
 * maintain.  In Chapter 3, you will learn how to constants
 * and expressions to calculate these coordinate values.
 */

import acm.graphics.*;
import acm.program.*;

public class TicTacToeBoard extends GraphicsProgram {

	public void run(){
		addBoard ( getWidth() / 2, getHeight() / 2);
	}
	
	private void addBoard( double cx, double cy){
		board(cx ,cy);
		
	}
	
	private void board(double cx, double cy) {
		double x = cx- BOARD_SIZE / 2 ;
		double y = cy - BOARD_SIZE / 2 ;
		GLine line1 = new GLine(130, 60, 220, 60);
		GLine line2 = new GLine(130, BOARD_SIZE, 220, BOARD_SIZE);
		GLine line3 = new GLine(160, 30, 160, 120);
		GLine line4 = new GLine(190, 30, 190, 120);
		add (line1);
		add (line2);
		add (line3);
		add (line4);
	}
	private static final double BOARD_SIZE = 90;
}
