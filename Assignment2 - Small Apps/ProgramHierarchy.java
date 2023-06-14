/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final double BOX_WIDTH = 120 ;
	private static final double BOX_HEIGHT = 30 ;
	
	public void run() {
		addDiagram (getWidth() / 2 , getHeight() / 2);
	}
	
	private void addDiagram(double cx, double cy){
		addProgram(cx, cy);
		addGProgram(cx, cy);
		addCProgram(cx - BOX_HEIGHT * 2, cy);
		addDProgram(cx, cy);
		addGPLine(cx, cy);
		addCPLine(cx, cy);
		addDPLine(cx, cy);
	}
	
	private void addDProgram(double cx, double cy){
		double x = cx + BOX_WIDTH * 2 ;
		double y = cy + BOX_HEIGHT * 2;
		GRect dProgram = new GRect (x , y, BOX_WIDTH, BOX_HEIGHT);
		GLabel contDProgram = new GLabel ("Dialog Program", x, y);
		add(contDProgram);
		add(dProgram);
	}
	
	private void addGProgram(double cx, double cy){
		double x = cx - BOX_WIDTH * 2;
		double y = cy + BOX_HEIGHT * 2;
		GRect gProgram = new GRect (x , y, BOX_WIDTH, BOX_HEIGHT);
		GLabel contGProgram = new GLabel ("Graphics Program", x, y );
		add(contGProgram);
		add(gProgram);
	}
	
	private void addCProgram(double cx, double cy){
		double x = cx + BOX_HEIGHT * 2 ;
		double y = cy + BOX_HEIGHT * 2;
		GRect cProgram = new GRect (x , y, BOX_WIDTH, BOX_HEIGHT);
		GLabel contCProgram = new GLabel ("Console Program", x, y);
		add(contCProgram);
		add(cProgram);
	}
	
	private void addProgram(double cx, double cy){
		double x = cx;
		double y = cy;
		GRect program = new GRect (x , y, BOX_WIDTH, BOX_HEIGHT);
		GLabel contProgram = new GLabel ("Program", x, y);
		add(contProgram);
		add(program);
	}
	
	private void addGPLine(double cx, double cy){
		
	}
	
	private void addCPLine(double cx, double cy){
		
	}
	
	private void addDPLine(double cx, double cy){
		
	}
	
	
}

