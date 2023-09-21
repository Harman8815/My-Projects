

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		JFrame obj=new JFrame();
		Gaming gp=new Gaming();
		obj.setBounds(0, 0, 500, 800);
		obj.setTitle("Game");
		obj.setResizable(false);
		obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gp);
	}

}
