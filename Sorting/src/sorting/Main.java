package sorting;

import javax.swing.JFrame;


public class Main {
	public static void ini(JFrame obj) {
		
		Logic gp=new Logic(obj);
		obj.setBounds(200, 50, 1000, 700);
		obj.setTitle("Sorting algo visualizer");
		obj.setResizable(false);
		obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        obj.add(gp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj=new JFrame();
		ini(obj);
        
	}
}
