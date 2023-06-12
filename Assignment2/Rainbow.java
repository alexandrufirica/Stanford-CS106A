import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {
	
	public void run(){
		addSky();
		addRainbow();
	}
	
	private void addSky(){
		GRect sky = new GRect(1000, 1000);
		sky.setFilled(true);
		sky.setColor(Color.CYAN);
		add(sky);
	}
	
	private void addRainbow(){
		red();
		orange();
		yellow();
		green();
		blue();
		magenta();
	}
	
	private void red(){
		GOval red = new GOval(-120, 20, 1000, 1000);
		GOval red1 = new GOval(-119, 21, 998, 998);
		GOval red2 = new GOval(-118, 22, 996, 996);
		GOval red3 = new GOval(-117, 23, 994, 994);
		GOval red4 = new GOval(-116, 24, 992, 992);
		red.setColor(Color.RED);
		red1.setColor(Color.RED);
		red2.setColor(Color.RED);
		red3.setColor(Color.RED);
		red4.setColor(Color.RED);
		add(red);
		add(red1);
		add(red2);
		add(red3);
		add(red4);
	}
	
	private void orange(){
		GOval orange = new GOval(-115, 25, 990, 990);
		GOval orange1 = new GOval(-114, 26, 988, 988);
		GOval orange2 = new GOval(-113, 27, 986, 986);
		GOval orange3 = new GOval(-112, 28, 984, 984);
		GOval orange4 = new GOval(-111, 29, 982, 982);
		orange.setColor(Color.ORANGE);
		orange1.setColor(Color.ORANGE);
		orange2.setColor(Color.ORANGE);
		orange3.setColor(Color.ORANGE);
		orange4.setColor(Color.ORANGE);
		add(orange);
		add(orange1);
		add(orange2);
		add(orange3);
		add(orange4);
	}
	
	private void yellow(){
		GOval yellow = new GOval(-110, 30, 980, 980);
		GOval yellow1 = new GOval(-109, 31, 978, 978);
		GOval yellow2 = new GOval(-108, 32, 976, 976);
		GOval yellow3 = new GOval(-107, 33, 974, 974);
		GOval yellow4 = new GOval(-106, 34, 972, 972);
		yellow.setColor(Color.YELLOW);
		yellow1.setColor(Color.YELLOW);
		yellow2.setColor(Color.YELLOW);
		yellow3.setColor(Color.YELLOW);
		yellow4.setColor(Color.YELLOW);
		add(yellow);
		add(yellow1);
		add(yellow2);
		add(yellow3);
		add(yellow4);
	}
	
	private void green(){
		GOval green = new GOval(-105, 35, 970, 970);
		GOval green1 = new GOval(-104, 36, 968, 968);
		GOval green2 = new GOval(-103, 37, 966, 966);
		GOval green3 = new GOval(-102, 38, 964, 964);
		GOval green4 = new GOval(-101, 39, 962, 962);
		green.setColor(Color.GREEN);
		green1.setColor(Color.GREEN);
		green2.setColor(Color.GREEN);
		green3.setColor(Color.GREEN);
		green4.setColor(Color.GREEN);
		add(green);
		add(green1);
		add(green2);
		add(green3);
		add(green4);
	}
	
	private void blue(){
		GOval blue = new GOval(-100, 40, 960, 960);
		GOval blue1 = new GOval(-99, 41, 958, 958);
		GOval blue2 = new GOval(-98, 42, 956, 956);
		GOval blue3 = new GOval(-97, 43, 954, 954);
		GOval blue4 = new GOval(-96, 44, 952, 952);
		blue.setColor(Color.BLUE);
		blue1.setColor(Color.BLUE);
		blue2.setColor(Color.BLUE);
		blue3.setColor(Color.BLUE);
		blue4.setColor(Color.BLUE);
		add(blue);
		add(blue1);
		add(blue2);
		add(blue3);
		add(blue4);
	}
	
	private void magenta(){
		GOval magenta = new GOval(-95, 45, 950, 950);
		GOval magenta1 = new GOval(-94, 46, 948, 948);
		GOval magenta2 = new GOval(-93, 47, 946, 946);
		GOval magenta3 = new GOval(-92, 48, 944, 944);
		GOval magenta4 = new GOval(-91, 49, 942, 942);
		magenta.setColor(Color.MAGENTA);
		magenta1.setColor(Color.MAGENTA);
		magenta2.setColor(Color.MAGENTA);
		magenta3.setColor(Color.MAGENTA);
		magenta4.setColor(Color.MAGENTA);
		add(magenta);
		add(magenta1);
		add(magenta2);
		add(magenta3);
		add(magenta4);
	}
}
