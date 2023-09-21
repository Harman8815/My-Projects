

import javax.swing.JFrame;

public class Main extends JFrame {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=700,y=300; 
      JFrame obj=new JFrame();
        clocker clock=new clocker(x,y);
        
        obj.setBounds(0, 0, x,y);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setResizable(false);
        obj.setFocusable(false);
        obj.setVisible(true);
        obj.setTitle("CLOCK");
        obj.add(clock);
	}

}
