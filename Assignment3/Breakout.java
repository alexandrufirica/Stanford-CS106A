/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
/**Animation delay or pause time between ball moves */
	private static final int DELAY = 10;
/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		setup();
		play();
	}

	private void setup(){
		brickSetup(BRICK_SEP / 2, BRICK_Y_OFFSET);
		paddleSetup();
		
	}
	
	private void play(){
		ballSetup();
		while(true){
			ballMove();
			checkForCollison();
			pause(DELAY);
		}
	}
	
	private void finish(){
		if (numBricks == 0){
			removeAll();
			GLabel finalMessage = new GLabel ("GAME OVER");
			Font myfont = new Font ("Serif", Font.BOLD, 200);
			finalMessage.setFont(myfont);
			finalMessage.setColor (Color.RED);
			double w = finalMessage.getWidth();
			double h = finalMessage.getAscent();
			add(finalMessage,( WIDTH - w) /2, (HEIGHT - h) /2 );
			
		}else if ( ball.getY() > HEIGHT - 2 * BALL_RADIUS){
			removeAll();
			GLabel finalMessage = new GLabel ("GAME OVER");
			Font myfont = new Font ("Serif", Font.BOLD, 200);
			finalMessage.setFont(myfont);
			finalMessage.setColor (Color.RED);
			double w = finalMessage.getWidth();
			double h = finalMessage.getAscent();
			add(finalMessage,( WIDTH - w) /2, (HEIGHT - h) /2 );
		}
			
	}
	
	private void brickSetup(double cx, double cy){
		for ( int i = 0; i<NBRICK_ROWS; i++){
			for ( int j = 0; j<NBRICKS_PER_ROW; j++){
				brick = new GRect (BRICK_WIDTH, BRICK_HEIGHT );
				brick.setFilled(true);
				add(brick,((WIDTH / 2) - ((NBRICKS_PER_ROW / 2) * BRICK_WIDTH)), BRICK_Y_OFFSET);
				add(brick,cx + i * (BRICK_WIDTH +BRICK_SEP),cy + j* (BRICK_HEIGHT + BRICK_SEP));
				numBricks = NBRICK_ROWS *NBRICKS_PER_ROW;
				int a;
				int b;
				for ( a = i; a < NBRICKS_PER_ROW; a ++){
					for ( b = j; b < NBRICK_ROWS; b++){
						brick.setColor(Color.CYAN);
					}
				}
				
				for ( a = i; a < NBRICKS_PER_ROW; a ++){
					for ( b = j; b < NBRICK_ROWS - 2; b++){
						brick.setColor(Color.GREEN);
					}
				}
				
				for ( a = i; a < NBRICKS_PER_ROW; a ++){
					for ( b = j; b < NBRICK_ROWS - 4; b++){
						brick.setColor(Color.YELLOW);
					}
				}
				
				for ( a = i; a < NBRICKS_PER_ROW; a ++){
					for ( b = j; b < NBRICK_ROWS - 6; b++){
						brick.setColor(Color.ORANGE);
					}
				}
				
				for ( a = i; a < NBRICKS_PER_ROW; a ++){
					for ( b = j; b < NBRICK_ROWS - 8; b++){
						brick.setColor(Color.RED);
					}
				}
			}
		}
	}
	
	private void paddleSetup(){
		
		paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle,(WIDTH / 2) - (PADDLE_WIDTH / 2) , HEIGHT - PADDLE_HEIGHT - PADDLE_Y_OFFSET);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		double x = (0 + e.getX());
		double y = HEIGHT - PADDLE_HEIGHT - PADDLE_Y_OFFSET;
		paddle.setLocation(x , y);
		if ( paddle.getX() >= WIDTH - PADDLE_WIDTH){
			paddle.setLocation(WIDTH - PADDLE_WIDTH, y);
		}
			
	}
	
	private void ballSetup(){
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		add(ball, WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS); 
		vy += 3.0;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5)) vx = -vx;
	}
		
	private void ballMove(){
		ball.move(vx, vy);
	}
	
	private void checkForCollison(){
		checkWallCollision();
		checkPaddleBrickCollision();
	}
	
	private void checkWallCollision(){
		if ( ball.getY() > HEIGHT - 4 * BALL_RADIUS){
			removeAll();
			GLabel finalMessage = new GLabel ("GAME OVER");
			Font myfont = new Font ("Serif", Font.BOLD, 50);
			finalMessage.setFont(myfont);
			finalMessage.setColor (Color.RED);
			double w = finalMessage.getWidth();
			double h = finalMessage.getAscent();
			add(finalMessage,( WIDTH - w) /2, (HEIGHT - h) /2 );
		}
		if ( ball.getX() > WIDTH - 2 * BALL_RADIUS){
			vx = - vx;
		}
		if ( ball.getY() <= 0){
			vy = - vy;
		}
		if ( ball.getX() <= 0){
			vx = - vx;
		}
	}
	
	private void checkPaddleBrickCollision(){
		GObject collider = getCollidingObject();
		if (collider == paddle) {
			vy = - vy;
		}
		
		else if ( collider != null){
			vy = -vy;
			remove(collider);
			numBricks--;
		}
	}
		
	private GObject getCollidingObject(){
		
		int x = (int) ball.getX();
		int y = (int) ball.getY();
		
		// Checking all four corners of the ball for an obj
		for(int i = 0; i < 4; i++) {
			switch(i) {
			case 0 : obj = getElementAt(x, y + (2 * BALL_RADIUS)); break;
			case 1 : obj = getElementAt(x + (2 * BALL_RADIUS), y + (2 * BALL_RADIUS)); break;
			case 2 : obj = getElementAt(x, y); break;
			case 3 : obj = getElementAt(x + (2 * BALL_RADIUS), y); break;
			}
			
			if(obj != null) return obj;
		}
		return null;
	}	
		
	
//Instace variables:
	
	private double vx, vy;
	private GRect paddle;
	private GOval ball;
	private GRect brick;
	private GObject obj;
	private int numBricks;
	
//Random Generator:
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

/*				
 
	*/
