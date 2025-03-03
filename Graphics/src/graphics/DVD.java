package graphics;
/*
 * BouncyBall.java
 * Julie Pham
 * 11/01/22
 * Bouncing ball
 */
import java.awt.Color;
import java.awt.Font;
import hsa2.GraphicsConsole;
public class DVD {

	static final int WINW = 800;
	static final int WINH = 600;
	
	GraphicsConsole gc = new GraphicsConsole(WINW, WINH);
	int ballx = 20;
	int bally = 20; //location of ball
	int size = 20; //diameter of ball
	int speedx = 1;
	int speedy = speedx;
	
	public static void main(String[] args) {
		new DVD();     

	}
	DVD() { //constructor
		setup();
		
		while(true) { //main animation loop
			moveBall();
			drawBall();
			gc.sleep(5);
			if (gc.getKeyChar() == '+') {
				size += 2;
			}
			if (gc.getKeyChar() == '-') {
				size -= 2;
			}
		}
	}
		void setup() {
			gc.setTitle("Color Bouncing Ball");
			gc.setAntiAlias(true);
			gc.setBackgroundColor(Color.WHITE);
			gc.clear(); gc.setLocationRelativeTo(null);
			gc.setColor(Color.RED.darker());
			gc.enableMouseMotion();
			gc.enableMouse();
			gc.getMouseClick();
		}
			
		void moveBall() {
			ballx += speedx;
			bally += speedy;
			
			if ((bally > gc.getDrawHeight() || (bally - size) < 0)) {
				speedy *= -1;
				gc.setColor(new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)));
			}
			if ((ballx + (size*2)) > gc.getDrawWidth() || ballx < 0) {
				speedx *= -1;
				gc.setColor(new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)));
			}
		}
		void drawBall() {
			synchronized(gc) {
				gc.clear();
				gc.setFont(new Font("Sans Serif", Font.BOLD, size) );
				gc.drawString("DVD", ballx, bally);
			}
		}
}