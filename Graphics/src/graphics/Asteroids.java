package graphics;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

public class Asteroids extends Rectangle{
	Color colour;
	int size;	//diameter of the asteroid
	int speed;	//the speed of the asteroid
	private static final int MAXSPEED = 10;	//max speed of an asteroid
	Random r = new Random();
	
	Asteroids() {
		size = width = height = 40;
		x = r.nextInt(Avoid.winW);
		y = 0;
		colour = Color.gray;
		speed = r.nextInt(MAXSPEED) + 1;
	}
}
