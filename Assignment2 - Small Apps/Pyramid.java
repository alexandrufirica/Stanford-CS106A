/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 12;
	
/** Coordinate bottom */
	private static final int BOTTOM = 460;
	
	public void run() {
		brickLine( getWidth() / 4, getHeight() /2 );
		lineUp ( getWidth() / 4, getHeight() /2 );
		lineUp2 ( getWidth() / 4, getHeight() /2 );
		lineUp3 ( getWidth() / 4, getHeight() /2 );
		lineUp4 ( getWidth() / 4, getHeight() /2 );
		lineUp5 ( getWidth() / 4, getHeight() /2 );
		lineUp6 ( getWidth() / 4, getHeight() /2 );
		lineUp7 ( getWidth() / 4, getHeight() /2 );
		lineUp8 ( getWidth() / 4, getHeight() /2 );
		lineUp9 ( getWidth() / 4, getHeight() /2 );
		lineUp10 ( getWidth() / 4, getHeight() /2 );
		lineUp11 ( getWidth() / 4, getHeight() /2 );
	}

	private void  lineUp(double cx, double cy){
			for ( int j = 1; j <= BRICKS_IN_BASE - 1 ; j++){
				addBrick( cx + (0.5 * BRICK_WIDTH) + (j * BRICK_WIDTH) , cy - BRICK_HEIGHT);
			}
	}
	
	private void lineUp2(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 2 ; i++){
			addBrick ( cx + BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 2 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp3(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 3 ; i++){
			addBrick ( cx + 1.5 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 3 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp4(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 4 ; i++){
			addBrick ( cx + 2 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 4 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp5(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 5 ; i++){
			addBrick ( cx + 2.5 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 5 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp6(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 6 ; i++){
			addBrick ( cx + 3 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 6 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp7(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 7 ; i++){
			addBrick ( cx + 3.5 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 7 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp8(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 8 ; i++){
			addBrick ( cx + 4 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 8 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp9(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 9 ; i++){
			addBrick ( cx + 4.5 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 9 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp10(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 10 ; i++){
			addBrick ( cx + 5 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 10 * BRICK_HEIGHT);
		}
	}
	
	private void lineUp11(double cx, double cy){
		for (int i = 1; i <= BRICKS_IN_BASE - 11 ; i++){
			addBrick ( cx + 5.5 * BRICK_WIDTH + (i * BRICK_WIDTH)  , cy - 11 * BRICK_HEIGHT);
		}
	}
	
	private void brickLine(double cx, double cy){
		for ( int i = 1; i <= BRICKS_IN_BASE; i++){
			addBrick(cx + i * BRICK_WIDTH, cy);
		}
	}
	
	private void addBrick (double cx, double cy){
		brick (cx + BRICK_WIDTH, cy);
	}
	
	private void brick (double cx, double cy) {
		double x = cx - BRICK_WIDTH;
		double y = cy - BRICK_HEIGHT;
		GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
	}
	
}

