import acm.graphics.*;
import acm.program.*;
import java.awt.*;
 
public class Calendar2 extends GraphicsProgram { 
    //31 day month in this example
    private static final int DAYS_IN_MONTH = 31;
     
    //day of week. 0=Sunday. 1=Monday. So on and so forth
    private static final int DAY_MONTH_STARTS =5;
     
    private static final int HEADER = 20;
     
    //the below should be obvious
    private static final int DAYS_IN_WEEK = 7;
    
    private int weeksInMonth;
    private double x;
    private double y;
    
     
    public void run(){
    	calendarDesign(0,HEADER);
    	calendarHeader();
    
    }
    
    private void calendarDesign(double cx, double cy){
    	weeksInMonth = (DAYS_IN_MONTH + DAY_MONTH_STARTS)/ DAYS_IN_WEEK;
		if (DAYS_IN_MONTH%DAYS_IN_WEEK >0){
			weeksInMonth++;
		}
		for ( int i = 0; i <= DAYS_IN_WEEK; i++){
			for ( int j = 0; j <= weeksInMonth; j++){
				
		    	double dx = getWidth() / DAYS_IN_WEEK;
		    	double dy = getHeight() /weeksInMonth;
		    	GRect rect = new GRect (i * dx, j * dy);
		    	GLabel day = new GLabel ("1");
		    	add(rect, cx, cy);
		    	add(day, cx + 10, cy + 10);
			}
		}
    }
    private void calendarHeader(){
    	double dx = (getWidth() / DAYS_IN_WEEK) / 2;
    	double cx = getWidth() / DAYS_IN_WEEK;
    	
    	GLabel sun = new GLabel ("SUN", dx  ,HEADER );
		GLabel mon = new GLabel ("MON", dx + cx ,HEADER );
		GLabel tue = new GLabel ("TUE", dx + 2*cx ,HEADER );
		GLabel wed = new GLabel ("WED", dx + 3*cx ,HEADER );
		GLabel thu = new GLabel ("THU", dx + 4*cx ,HEADER );
		GLabel fri = new GLabel ("FRI", dx + 5*cx ,HEADER );
		GLabel sat = new GLabel ("SAT", dx + 6*cx , HEADER );
		
		add(sun);
		add(mon);
		add(tue);
		add(wed);
		add(thu);
		add(fri);
		add(sat);
    }
    
    private void days(){
    //	for( int k = DAY_MONTH_STARTS; k <= DAY_MONTH_STARTS + DAYS_IN_MONTH; k++{
    	//	for ( int i =1; i<= DAYS_IN_MONTH; i++){
    	//		GLabel day = new GLabel ("" + i);
    	//		add(day)
    	//	}
    	//}
    }
}