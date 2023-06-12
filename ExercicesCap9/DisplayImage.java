import acm.graphics.*;
import acm.program.*;

public class DisplayImage extends GraphicsProgram {
	
	public void run(){
		
		GImage img = new GImage ("sahami.jpg");
		double x = (getWidth() - img.getWidth()) /2;
		double y = (getHeight() - img.getHeight()) /2;
		img.setSize( getWidth(), getHeight() - CITATION_MARGIN);
		add(img);
		addCitation("Stanford course");
	}
	
	private void addCitation (String text){
		GLabel label = new GLabel(text);
		label.setFont(CITATION_FONT);
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label.getAscent();
		add(label, x, y);
	}

	public static final String CITATION_FONT = "SansSerif-20";
	public static final int CITATION_MARGIN = 36;
	
	public static final int APPLICATION_WIDTH = 640;
	public static final int APPLICATION_HEIGHT = 640 + CITATION_MARGIN;
	
}
