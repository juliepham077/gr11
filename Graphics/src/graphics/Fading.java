package graphics;
/*
 * Fading.java
 * Julie Pham
 * 11/01/22
 * Fading balls
 */
import java.awt.Color;
import hsa2.GraphicsConsole;
public class Fading {

	public static void main(String[] args) {
		new Fading(); //creates a new Fading object

	} //end main()
	
	GraphicsConsole gc = new GraphicsConsole(800,600, "Spots");
	
	//This is called a constructor. It makes a Fading object
	Fading() {
		//Setup section:
		gc.setAntiAlias(true);
		gc.setLocationRelativeTo(null); //centre window
		gc.setBackgroundColor(Color.GRAY);
		gc.setBackgroundColor(new Color(120,120,120,10));
		gc.clear();
		gc.setColor(Color.RED);
		
		//Animation variables
		int size = 40;
		int sleepTime = 5; //in milliseconds
		
		//animation loop
		while (true) {
			gc.clear();
			int rx = (int)(Math.random()*700 + 50);
			int ry = (int)(Math.random()*500 + 50);
			
			gc.fillOval(rx, ry, size, size);
			/*The final thing in the loop must be sleep()
			 *If it does not sleep the graphics won't get updated*/
			
			gc.sleep(sleepTime);
			
			//Get it ready for the next loop with random colors
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			gc.setColor(new Color(r, g, b));
					
		} //end animation
	} //end constructor
}
