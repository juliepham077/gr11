package graphics;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Rectangle;

import hsa2.GraphicsConsole;

public class Avoid {

	public static void main(String[] args) {
		new Avoid();
	}
	
	static int winW = 1200;  //static for easy access by Asteroids constructor
	static int winH = 1000;
	
	final static int PADDLEMOVE = 5; //number of pixels that the paddle will move with each key press
	
	GraphicsConsole gc = new GraphicsConsole(winW, winH);
	ArrayList<Asteroids> asteroids = new ArrayList<Asteroids>();
	Rectangle paddle;
	
	Avoid() {
		setup();
		
		while(gc.getKeyCode() != 'Q') {
		
			//randomly add a new Asteroid
			if (Math.random()*100 > 95) asteroids.add( new Asteroids() );
			
			// Move the paddle using keys			 
			if (gc.isKeyDown(37)) {	//isKeyDown uses keyCodes. Left arrow
				if (paddle.x > 0) paddle.x -= PADDLEMOVE;
			}
			if (gc.isKeyDown(39)) { //right
				if (paddle.x < (winW - paddle.width)) paddle.x += PADDLEMOVE;
			}

			
			//move the Asteroids
			for (Asteroids a : asteroids)	moveAsteroid(a);
			
			//Check for collisions
			if (checkCollision()) break;	//game over if collision occurs
			
			drawGraphics();
			gc.sleep(10);
			
		}
		//This is optional: wait a second and then close the window.
		gc.sleep(500);
		gc.dispose();
	}
	
	/**
	 * Move each asteroid down the screen. If the asteroid reaches the bottom of the screen, move it off screen
	 * @param a	the Asteroid to move
	 */
	void moveAsteroid(Asteroids a) {
		if (a.y > winH) {
			a.x = 2000;
			a.y = 2000; 
		}
		else a.y += a.speed;
		
	}
	
	/**
	 * Check to see if an asteroid has collided with the paddle
	 * @return	Returns true if a collision has occurred, false otherwise
	 */
	boolean checkCollision() {
		for (Asteroids a : asteroids) {
			if (paddle.intersects(a)) {
				gc.showDialog("You have collided with an asteroid - Game Over.", "GAME OVER");
				return true;
			}
		}
		return false;
	}
	
	void setup() {
		gc.setResizable(false);
		gc.setTitle("Avoid the Asteroids!");
		gc.setLocationRelativeTo(null);
		gc.setAntiAlias(true);
		gc.setBackgroundColor(Color.BLACK);
		
		asteroids.add( new Asteroids() );
		paddle = new Rectangle(550, 960, 100, 30);
		
	}
	
	void drawGraphics() {
		synchronized(gc) {
			gc.clear();
			
			//this is a for-each loop. The for-loop version is in moveCircles()
			for (Asteroids a : asteroids) {
				gc.setColor(a.colour);
				gc.fillOval(a.x, a.y, a.width, a.height);
				
			}
			gc.setColor(Color.GREEN);
			gc.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
		}
	}

}
