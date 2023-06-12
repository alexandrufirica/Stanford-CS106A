import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class flipHorizontal extends GraphicsProgram {

	
	public void run(){
		GImage image = new GImage ("GATES.JPG");
		double x = (getWidth() - image.getWidth()) / 2;
		double y = (getHeight() - image.getHeight()) / 2;
		image.setSize(getWidth(), getHeight());	
		add(flipImage(image));
		
	}
	
	private GImage flipImage(GImage img){
		int[][] array = img.getPixelArray();
		int width = array[0].length;
		int height = array.length;
		for (int row = 0; row < height; row++){
			for ( int p1 = 0; p1 < width / 2; p1++){
				int p2 = width -p1 -1;
				int temp = array[row][p1];
				array[row][p1] = array[row][p2];
				array[row][p2] = temp;
			}
		}
		return new GImage(array);
	}
}
