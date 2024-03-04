package NotePad;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class About extends JFrame  {
   About(){
	   setBounds(100,100,500,400);
	   setTitle("About notepad application");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setLayout(null);
   }
   public static void main(String args[]) {
	   new About().setVisible(true);
   }
	
}
