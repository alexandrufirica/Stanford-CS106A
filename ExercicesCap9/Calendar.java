import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class Calendar extends GraphicsProgram {

	public void run(){
		calendarHeader();
		calendarDesign(0,20);
		numbers();
	}
	
	private void calendarHeader(){
		
		double dx = (getWidth() / DAYS_IN_WEEK);
		
		GLabel sun = new GLabel ("SUN", dx ,HEADER );
		GLabel mon = new GLabel ("MON", 2*dx ,HEADER );
		GLabel tue = new GLabel ("TUE", 3*dx ,HEADER );
		GLabel wed = new GLabel ("WED", 4*dx ,HEADER );
		GLabel thu = new GLabel ("THU", 5*dx ,HEADER );
		GLabel fri = new GLabel ("FRI", 6*dx ,HEADER );
		GLabel sat = new GLabel ("SAT", 7*dx , HEADER );
		
		add(sun);
		add(mon);
		add(tue);
		add(wed);
		add(thu);
		add(fri);
		add(sat);
		
	}
	
	private void calendarDesign(double cx, double cy) {
		weeksInMonth = (DAYS_IN_MONTH + DAY_MONTH_STARTS)/ DAYS_IN_WEEK;
		if (DAYS_IN_MONTH%DAYS_IN_WEEK >0){
			weeksInMonth++;
		}
		
		double sqWidth = getWidth() / DAYS_IN_WEEK;
		double sqHeight = (getHeight() - HEADER)/ weeksInMonth;
		for ( int i = 0; i < weeksInMonth; i++){
			for ( int j =0; j < DAYS_IN_WEEK; j++){
				double x =  j * sqWidth ;
				double y =  i * sqHeight;
				GRect sq = new GRect ( x , y, sqWidth, sqHeight);
				add(sq);
				}
			}
		}
		
	private void numbers (){
		double dx = getWidth() / DAYS_IN_WEEK; 
		double dy = (getHeight() - HEADER)/ weeksInMonth;
		for ( int i = 0; i < weeksInMonth; i++){
			for ( int j = 0; j < DAYS_IN_WEEK; j++){
				
				GLabel label = new GLabel (k + "", i * dx, j* dy);
				for (k = 1; k <=DAYS_IN_MONTH; k++){
					add(label);
				
				}
				
			}
		}
	}
/**		double noWidth = sqWidth;
		double noHeight = sqHeight;
		for (int i = 1; i <=DAYS_IN_MONTH; i++){
			
			GLabel label = new GLabel ( "" + i , noWidth, noHeight);
			add(label);
			noWidth = sqWidth + noWidth;
			noHeight = sqHeight + noHeight;
		}
		int k = 1;
				GLabel label = new GLabel ( k + "" , x, y);
				for (k = 1; k <=DAYS_IN_MONTH; k++){
					add(label);
					k++;
				}
**/
		
	private int k = 1;
	private int weeksInMonth;
	
	private static final int HEADER = 20;
	private static final int DAYS_IN_WEEK = 7;

	
	private static final int DAYS_IN_MONTH = 31;
	private static final int DAY_MONTH_STARTS = 5;
}
