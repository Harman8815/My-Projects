package PackMan_Game;

import java.awt.EventQueue;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class PackMan extends JFrame {
	
	public PackMan() {
		initUI();
		
	}
    private void initUI() {
		// TODO Auto-generated method stub
		add(new Board());
		setTitle("packman");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,420);
        setLocationRelativeTo(null);
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(()->{
	
			PackMan obj=new PackMan();
			obj.setVisible(true);
			
		});
	}

}
