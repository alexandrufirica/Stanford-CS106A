/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		turnLeft();
		while (frontIsClear() ) {
			roundR();
		}
		
	}
	
	public void roundR() {
		if (noBeepersPresent() ) {
			putBeeper();
		}
		for ( int i=0;i<2;i++) {
				move();
			if (frontIsBlocked() ) {
				if (facingNorth()){
				turnR();
				}else{
				turnL();
				}
				for ( int a=0;a<1;a++){
						move();
				}
			}
	}
	}
	
	public void turnR() {
		turnRight();
		move();
		if (noBeepersPresent()){
			putBeeper();
		}
		turnRight();
	}
	
	public void turnL() {
		turnLeft();
		move();
		if (noBeepersPresent()){
			putBeeper();
		}
		turnLeft();
	}
	
	
}
