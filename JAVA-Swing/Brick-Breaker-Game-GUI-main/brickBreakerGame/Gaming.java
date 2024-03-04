package brickBreakerGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Gaming extends JPanel implements KeyListener,ActionListener {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean play =true;
	 private int score=0;
	 private int totalbricks=35;
	 private Timer timer;
	 private int delay=500;
	 private int playerx=100;
	 private int playery=700;
	 private int ballposx=250;
	 private int ballposy=590;
	 private int balldirx=-1;
	 private mapBuilder map;
	 private int balldiry=-1;
	 public Gaming() {
		 map=new mapBuilder(7,5);
		 addKeyListener(this);
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
		 timer =new Timer(delay,this);
		 timer.start();
	 }
	 public void paint(Graphics g) {
		 g.setColor(Color.black);
		 g.fillRect(0, 0, 500, 800);
		 
		
		   g.setColor(Color.YELLOW);
		   g.fillRect(0, 0, 500, 10);
	       g.fillRect(0, 0, 10, 800);
		   g.fillRect(475, 0, 11, 780);
			 //rect
			 g.setColor(Color.BLUE);
			 g.fillRect(playerx,playery,100,15);
			 //ball
			 g.setColor(Color.green);
			 g.fillOval(ballposx, ballposy, 20, 20);
			  map.draw((Graphics2D)g);
			 g.setColor(Color.white);
			 g.setFont(new Font("serif",Font.BOLD,18));
			 g.drawString("SCORE :-  "+score,350,30);
			 if(totalbricks==0){

				 play=false;
				 balldirx=0;balldiry=0;

				 g.setColor(Color.green);
				 g.setFont(new Font("serif",Font.BOLD,35));
				 g.drawString("WELL PLAYED ",150,450);
				 g.setColor(Color.WHITE);
				 g.setFont(new Font("serif",Font.BOLD,25));
				 g.drawString("SCORE :-  "+score,180,500);
			 }
			 if(ballposy>820)
			 {
				 play=false;
				 balldirx=0;balldiry=0;

				 g.setColor(Color.red);
				 g.setFont(new Font("serif",Font.BOLD,35));
				 g.drawString("GAMEOVER ",150,450);
				 g.setColor(Color.RED);
				 g.setFont(new Font("serif",Font.BOLD,25));
				 g.drawString("SCORE :-  "+score,180,500);
			 }
			 g.dispose();
		 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(play) {
			if(new Rectangle(ballposx,ballposy,20,20).intersects(new Rectangle(playerx,playery,100,15))) {
				balldiry=-balldiry;
			}
			for( int i = 0; i<map.map.length; i++) {
				for(int j = 0; j<map.map[0].length; j++) {
					if(map.map[i][j] > 0) {
						int brickX = j*map.brickWidth + 80;
						int brickY = i*map.brickHeight + 50;
						int brickWidth= map.brickWidth;
						int brickHeight = map.brickHeight;
						
						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(ballposx, ballposy, 20,20);
						Rectangle brickRect = rect;
						
						if(ballRect.intersects(brickRect) ) {
							map.setBrickValue(0, i, j);
							totalbricks--;
							score+=5;
							
							if(ballposx + 19 <= brickRect.x || ballposx +1 >= brickRect.x + brickRect.width) 
								balldirx = -balldirx;
							 else {
								balldiry = -balldiry;
							}
						}
						
					}
					
				}
			}
			if(ballposx>450||ballposx<10){
				balldirx=-balldirx;
			}
			if(ballposy<10) {
				balldiry=-balldiry;
			}
			
		   ballposx+=balldirx;
		   ballposy+=balldiry;
		}
		
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
			 if(arg0.getKeyCode()==KeyEvent.VK_RIGHT){
				 if(playerx>=350)
				 {
					 playerx=350;}
					 else {
						 movesRight();
				 }
			 }
			 if(arg0.getKeyCode()==KeyEvent.VK_LEFT){
				 if(playerx<50)
				 {
					 playerx=50;}
					 else {
						 movesLeft();
				 }
			 }
			 if(arg0.getKeyCode()==KeyEvent.VK_UP) {
				 if(playery<500||playery>800) {
					 playery=500;
				 }
				 else {
					 moveup();
				 }
			 }
			 if(arg0.getKeyCode()==KeyEvent.VK_DOWN) {
				 if(playery>750) {
					 playery=750;
				 }
				 else {
					 movedown();
				 }
			 }
			 if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
				 if(!play) {
					 score=0;
					 totalbricks=35;
					 ballposx=250;ballposy=600;
					 balldirx=-1;balldiry=-1;
					 map=new mapBuilder(7,5);
				 }
				
			 }
		 }
		public void movesRight()
		{
			play=true;
			playerx+=10;
		}
		public void movesLeft()
		{
			play=true;
			playerx-=10;
		}
		public void moveup() {
			play=true;
					playery-=10;
		}
		public void movedown() {
			play=true;
			playery+=10;
		}
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
