
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle{

	Random random;
	int xVelocity;
	int yVelocity;
	int intspeed=3;
	Ball(int x,int y,int width,int height){
		super(x,y,width,height);
	     random = new Random();
		int randomxdirection=random.nextInt(2);
		if(randomxdirection==0) 
			randomxdirection--;
			setXDirection(randomxdirection*intspeed);
		
		int randomydirection=random.nextInt(2);
		if(randomydirection==0) {
			randomydirection--;
			setYDirection(randomydirection*intspeed);
		}
	}
	public void setXDirection(int randomXDirection) {
		xVelocity=randomXDirection;
		
	}
	public void setYDirection(int randomYDirection) {
		yVelocity=randomYDirection;
	}
	public void move() {
		x+=xVelocity;
		
		y+=yVelocity;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, width, height);
	}
	
}
