package graphics;
/*
 * BouncyBall.java
 * Julie Pham
 * 11/01/22
 * Bouncing ball
 */
import java.awt.Color;
import hsa2.GraphicsConsole;
public class BouncyBall {

	static final int WINW = 800;
	static final int WINH = 600;
	
	GraphicsConsole gc = new GraphicsConsole(800,600);
	int ballx = 20;
	int bally = 20; //location of ball
	int size = 20; //diameter of ball
	int speedx = 5; // normally this is set to 2 or 3 pixels. Later, try 35
	int speedy = speedx;
	
	public static void main(String[] args) {
		new BouncyBall();

	}
	BouncyBall() { //constructor
		setup();
		
		while(true) { //main animation loop
			moveBall();
			drawBall();
			gc.sleep(5);
		}
	}
		void setup() {
			gc.setTitle("Color Bouncing Ball");
			gc.setAntiAlias(true);
			gc.setBackgroundColor(Color.WHITE);
			gc.clear();
			gc.setLocationRelativeTo(null);
			gc.setColor(Color.RED.darker());
		}
			
		void moveBall() {
			ballx += speedx;
			bally += speedy;
			
			if ((bally + size) > gc.getDrawHeight() || bally < 0) {
				speedy *= -1;
				gc.setColor(new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)));
			}
			if ((ballx + size) > gc.getDrawWidth() || ballx < 0) {
				speedx *= -1;
				gc.setColor(new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)));
			}
		}
		void drawBall() {
			synchronized(gc) {
				gc.clear();
				gc.fillOval(ballx, bally, size, size);
			}
		}
}