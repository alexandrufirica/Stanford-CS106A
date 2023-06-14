/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	private static final int OUTER_RADIUS = 72;
	private static final double MIDDLE_RADIUS = 72 / 0.65;
	private static final double INNER_RADIUS = 72 / 0.3;
	
	public void run() {
		addTarget (getWidth() / 2, getHeight() / 2);
	}
	private void addTarget(double cx, double cy){
		addInner(cx, cy);
		addMiddle(cx, cy);
		addOuter(cx, cy);
	}
	
	private void addOuter(double cx, double cy){
		double x = cx - OUTER_RADIUS; 
		double y = cy - OUTER_RADIUS;
		GOval outer = new GOval (x, y, 2 * OUTER_RADIUS , 2 * OUTER_RADIUS);
		outer.setFilled(true);
		outer.setFillColor(Color.RED);
		add(outer);
	}
	
	private void addMiddle(double cx, double cy){
		double x = cx - MIDDLE_RADIUS; 
		double y = cy - MIDDLE_RADIUS;
		GOval middle = new GOval (x, y, 2 * MIDDLE_RADIUS , 2 * MIDDLE_RADIUS);
		middle.setFilled(true);
		middle.setFillColor(Color.WHITE);
		add(middle);
	}
	
	private void addInner(double cx, double cy){
		double x = cx - INNER_RADIUS; 
		double y = cy - INNER_RADIUS;
		GOval inner = new GOval (x, y, 2 * INNER_RADIUS , 2 * INNER_RADIUS);
		inner.setFilled(true);
		inner.setFillColor(Color.RED);
		add(inner);
	}
}
