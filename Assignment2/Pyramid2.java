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

public class Pyramid2 extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
/** Coordinate bottom */
	private static final int BOTTOM = 460;
	
	public void run() {
		brickLine( getWidth() / 4, getHeight() /2 );
		lineUp ( getWidth() / 4, getHeight() /2 );
		}

	private void  lineUp(double cx, double cy){
		for(double i = 1; i <= BRICKS_IN_BASE; i++){
			for ( int j = 1; j <= BRICKS_IN_BASE - i ; j++){
				addBrick( cx + ((i / 2) * BRICK_WIDTH) + (j * BRICK_WIDTH) , cy - i * BRICK_HEIGHT);
			}
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
