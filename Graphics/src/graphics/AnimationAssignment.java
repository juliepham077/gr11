package graphics;
/*
 * AnimationAssignment.java
 * Julie Pham
 * 11/01/22
 * Basic graphics drawing
 */
import java.awt.Color;
import java.awt.Polygon;
import hsa2.GraphicsConsole;
import java.awt.Font;
public class AnimationAssignment {
	GraphicsConsole gc = new GraphicsConsole(800,600, "Rawwwwr!");
	int irisSize = 30;
	int iris1y = 130;
	int iris2y = 160;
	int speed1y = 1;
	int speed2y = 1;
	
	
	public static void main(String[] args) {
		new AnimationAssignment();
	}
	AnimationAssignment() {
		setup();
		while(true) { //main animation loop
			dizzyEyes();
			drawEyes();
			gc.sleep(10); //program sleeps in milliseconds
		}
	}
		//Background of animation
		void setup() {
		gc.setAntiAlias(true); //smooth diagonal or curved lines
		gc.setLocationRelativeTo(null); //center window on screen
		
		//background
		Color background = new Color (158, 229, 255);
		gc.setBackgroundColor(background);
		gc.clear();
		
		//ground
		Color ground = new Color (88, 219, 102);
		gc.setColor(ground);
		gc.fillRect(0, 400, 800, 200);
		
		//feet
		Color feet = new Color (250, 229, 135);
		gc.setColor(feet);
		gc.fillOval(200, 400, 195, 100);
		gc.fillOval(405, 400, 195, 100);
		
		//ears
		Color ears = new Color (247, 190, 109);//outside of ear
		gc.setColor(ears);
		gc.setStroke(70);
		gc.drawLine(300, 50, 320, 100);
		gc.drawLine(500, 50, 480, 100);
		Color insideEars = new Color (181, 117, 5, 128);//inside of ear
		gc.setColor(insideEars);
		gc.setStroke(30);
		gc.drawLine(300, 50, 320, 100);
		gc.drawLine(500, 50, 480, 100);
		
		//body
		Color body = new Color (222, 82, 82);
		gc.setColor(body);
		gc.fillOval(200, 50, 400, 400);
		
		//nose
		Polygon nose = new Polygon();
		nose.addPoint(365, 215);
		nose.addPoint(435, 215);
		nose.addPoint(400, 260);
		gc.setColor(Color.BLACK);
		gc.fillPolygon(nose);
		
		//eyes
		gc.setColor(Color.WHITE);//sclera
		gc.fillOval(290, 130, 60, 60);
		gc.fillOval(450, 130, 60, 60);
		
		//mouth
		Color mouth = new Color (252, 157, 190);
		gc.setColor(mouth);
		gc.fillOval(250, 290, 300, 100);
		
		//creator
		gc.setStroke(2);
		Color box = new Color (255, 255, 255, 50);
		gc.setColor(box);
		gc.fillRect(525, 550, 300, 100);
		gc.setColor(Color.WHITE);
		gc.drawRect(525, 550, 300, 100);
		gc.setFont( new Font("Monospaced", Font.BOLD, 18) );
		gc.drawString( "Created by: Julie Pham", 540, 580);
		}
		
		//Make eyes appear dizzy
		void dizzyEyes() {
			iris1y += speed1y;
			iris2y += speed2y;
			//Iris detect edge of eye and bounce back up/down
			if ((iris1y + irisSize) > 190 || iris1y < 130) {
			speed1y *= -1;
			}
			if ((iris2y + irisSize) > 190 || iris2y < 130) {
			speed2y *= -1;
			}
		}
		
		void drawEyes() {
			synchronized(gc) {//stops flickering
				gc.clear();
				setup();
				//draw irises
				gc.setColor(Color.BLACK);
				gc.fillOval(305, iris1y, irisSize, irisSize);
				gc.fillOval(465, iris2y, irisSize, irisSize);
			}
		}
}
