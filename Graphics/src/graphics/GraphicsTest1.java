package graphics;
/*
 * BouncyBall.java
 * Julie Pham
 * 11/01/22
 * Bouncing ball
 */
import java.awt.Color;
import hsa2.GraphicsConsole;
public class GraphicsTest1 {

	static final int WINW = 800;
	static final int WINH = 600;
	
	GraphicsConsole gc = new GraphicsConsole(300,300);
	int ballx = 145;
	int bally = 145; //location of ball
	int size = 10; //diameter of ball
	int speed = 1;
	boolean play = true;
	
	
	
	public static void main(String[] args) {
		new GraphicsTest1();

	}
	GraphicsTest1() { //constructor
		setup();
		gc.enableMouse();
		
		while(true) { //main animation loop
			sizeBall();
			drawBall();
			gc.sleep(5);
		}
	}
		void setup() {
			gc.setTitle("Click mouse to change motion, press q to quit.");
			gc.setAntiAlias(true);
			gc.setBackgroundColor(Color.BLACK);
			gc.clear();
			gc.setLocationRelativeTo(null);
			gc.setColor(Color.GREEN.darker());
		}
			
		void sizeBall() {
				size+=2*speed;
				ballx-=speed;
				bally-=speed;
				if (ballx<0) {
					size-=290;
					ballx+=145;
					bally+=145;
				}
				if (gc.getMouseClick() > 0) {
					speed*=-1;
				}
				if (ballx>150) {
					size+=300;
					ballx-=150;
					bally-=150;
				}
				if (gc.getKeyChar() == 'q') {
					System.exit(0);
				}
		}
		void drawBall() {
			synchronized(gc) {
				gc.clear();
				gc.setStroke(5);
				gc.drawOval(ballx, bally, size, size);
			}
		}
}