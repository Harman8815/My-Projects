

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.Timer;

public class clocker extends JPanel implements Runnable{

	private int sec=0,min=0,hour=0;
	private Timer timer;
	private int delay=1000;
	Thread t = null;
	boolean on=true;
	int x,y;
	String time="";
	clocker(int x,int y){
	 t = new Thread(this);
	 t.start();
	 this.x=x;
	 this.y=y;
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, x, y);
		g.setColor(Color.blue);
		/*g.setFont(new Font("radioland",Font.BOLD,80));
        
		g.drawString(String.valueOf(hour), 150, 100);
		g.drawString(String.valueOf(min), 230, 100);
		g.drawString(String.valueOf(sec), 350, 100);
		g.drawString(":", 200, 100);
		g.drawString(":", 320, 100);
		String st="";
		*/
        g.setFont(new Font("radioland",Font.BOLD,80));
        g.drawString(time, 170, 150);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    while(on) {
	    	 Calendar cal = Calendar.getInstance();  
	            hour = cal.get( Calendar.HOUR_OF_DAY );  
	            if ( hour > 12 ) hour -= 12;  
	            min = cal.get( Calendar.MINUTE );  
	            sec = cal.get( Calendar.SECOND );  	
	            SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
	       	     Date date=new Date();
	           time = formatTime.format(date);
	            repaint();
	    }
	}



}
