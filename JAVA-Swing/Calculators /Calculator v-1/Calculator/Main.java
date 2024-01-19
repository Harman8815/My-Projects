package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class Main implements ActionListener {

	
	JFrame frame;
	JTextField textField;
	JButton[] numberButton=new JButton[10];

	JButton[] functionButton=new JButton[10];
	JButton addb,subb,multb,divb,decb,delb,clearb,equb,negb;
	JPanel panel;
	Font myFont=new Font("Ink Freae",Font.BOLD,35);
	double num1=0,num2=0,result=0;
	char operator;
	
	Main(){
	frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Calculator");frame.setSize(450, 550);
    frame.setLayout(null);
    
     textField=new JTextField();
     textField.setBounds(50, 25, 300, 50);
     textField.setFont(myFont);
     textField.setEditable(false);
     frame.add(textField);
    
     addb=new JButton("+");
     subb=new JButton("-");
     multb=new JButton("*");
     divb=new JButton("/");
     decb=new JButton(".");
     delb=new JButton("delete");
     clearb=new JButton("clear");
     equb=new JButton("=");
     negb = new JButton("(-)");
     
     
     functionButton[0]=addb;
     functionButton[1]=subb;
     functionButton[2]=multb;
     functionButton[3]=divb;
     functionButton[4]=delb;
     functionButton[6]=clearb;
     functionButton[7]=equb;
     functionButton[5]=decb;
     
     for(int i=0;i<8;i++) {
    	 functionButton[i].addActionListener(this);
    	 functionButton[i].setFont(myFont);
    	 functionButton[i].setFocusable(false);
     }
     for(int i=0;i<10;i++) {
         numberButton[i]=new JButton(String.valueOf(i));
    	 numberButton[i].addActionListener(this);
    	 numberButton[i].setFont(myFont);
    	 numberButton[i].setFocusable(false);
     }
      

		negb.setBounds(50,430,100,50);
		delb.setBounds(150,430,100,50);
		clearb.setBounds(250,430,100,50);
     
     panel=new JPanel();
     panel.setBounds(50, 100,300,300);
     panel.setLayout(new GridLayout(4,4,10,10));
     panel.setBackground(Color.GRAY);
     
 	panel.add(numberButton[1]);
	panel.add(numberButton[2]);
	panel.add(numberButton[3]);
	panel.add(addb);
	panel.add(numberButton[4]);
	panel.add(numberButton[5]);
	panel.add(numberButton[6]);
	panel.add(subb);
	panel.add(numberButton[7]);
	panel.add(numberButton[8]);
	panel.add(numberButton[9]);
	panel.add(multb);
	panel.add(decb);
	panel.add(numberButton[0]);
	panel.add(equb);
	panel.add(divb);
	
	frame.add(panel);
	frame.add(negb);
	frame.add(delb);
	frame.add(clearb);
     
     frame.setVisible(true);
    frame.setFocusable(true);		
		
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      Main obj=new Main();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource() == numberButton[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decb) {
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource()==addb) {
			num1 = Double.parseDouble(textField.getText());
			operator ='+';
			textField.setText("");
		}
		if(e.getSource()==subb) {
			num1 = Double.parseDouble(textField.getText());
			operator ='-';
			textField.setText("");
		}
		if(e.getSource()==multb) {
			num1 = Double.parseDouble(textField.getText());
			operator ='*';
			textField.setText("");
		}
		if(e.getSource()==divb) {
			num1 = Double.parseDouble(textField.getText());
			operator ='/';
			textField.setText("");
		}
		if(e.getSource()==equb) {
			num2=Double.parseDouble(textField.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clearb) {
			textField.setText("");
		}
		if(e.getSource()==delb) {
			String string = textField.getText();
			textField.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negb) {
			double temp = Double.parseDouble(textField.getText());
			temp*=-1;
			textField.setText(String.valueOf(temp));
		}
	}

}
