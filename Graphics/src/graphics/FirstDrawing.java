package graphics;
import java.awt.Color;
import hsa2.GraphicsConsole;
/* 
 * FirstDrawing.java
 * by Mr. Campbell
 * October 31, 2022
 * Program to demonstrate how to use HSA2 for drawing.
 */
public class FirstDrawing {
	
	GraphicsConsole gc = new GraphicsConsole(800,300);

	public static void main(String[] args) {
		new FirstDrawing();
	}
	
	FirstDrawing() {
		gc.setBackgroundColor(Color.BLUE);
		gc.clear();
		
		gc.setColor(Color.RED);
		gc.fillOval(400, 150, 100, 50);
	}
}
