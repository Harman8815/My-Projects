
import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GamePanel panel;
	GameFrame(){
		panel=new GamePanel();
		this.add(panel);
		this.setResizable(true);
		this.setTitle("PingPong");
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
