package NotePad;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;


public class NotePadApp extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar menubar=new JMenuBar();
	JMenu File=new JMenu("File");
	JMenu Edit=new JMenu("Edit");
	JMenu Help=new JMenu("Help");
	
	JMenuItem NewFile=new JMenuItem("New");
	JMenuItem OpenFile=new JMenuItem("Open");
	JMenuItem SaveFile=new JMenuItem("Save");
	JMenuItem PrintFile=new JMenuItem("Print");
	JMenuItem ExitFile=new JMenuItem("Exit");
	
	JMenuItem copy=new JMenuItem("copy");
	JMenuItem paste=new JMenuItem("paste");
	JMenuItem selectall=new JMenuItem("select All");
	JMenuItem cut=new JMenuItem("cut");
	
	JMenuItem about=new JMenuItem("about");
	JTextArea textArea=new JTextArea();
	
	NotePadApp(){
    
		setBounds(100,100,800,600);
		setTitle("NotePad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ImageIcon icon=new ImageIcon(getClass().getResource(shfuehe.png));
		
		//setIconImage(icon.getImage());
		setJMenuBar(menubar);
        menubar.add(File);   
        menubar.add(Edit);   
        menubar.add(Help);   
    	
        File.add(NewFile);	
        File.add(OpenFile);	
        File.add(SaveFile);	
        File.add(PrintFile);	
        File.add(ExitFile);	
        
        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        Edit.add(selectall);
        
        Help.add(about);

        JScrollPane scrollPane=new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        textArea.setFont(new Font("serif",Font.BOLD,20));
        add(scrollPane);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);        
        
        
        NewFile.addActionListener(this);
        OpenFile.addActionListener(this);
        SaveFile.addActionListener(this);
        PrintFile.addActionListener(this);
        ExitFile.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        cut.addActionListener(this);
        selectall.addActionListener(this);
        about.addActionListener(this);
        /*
        File.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.ALT_DOWN_MASK));
        Edit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.ALT_DOWN_MASK));
        Help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.ALT_DOWN_MASK));
        */
        
        NewFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        OpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        SaveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        PrintFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        ExitFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.ALT_DOWN_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
        selectall.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
        about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_DOWN_MASK));
    	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new NotePadApp().setVisible(true);
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("new"))
		{
			textArea.setText(null);
		}
		else if(e.getActionCommand().equalsIgnoreCase("open")){
			JFileChooser filechooser=new JFileChooser();
			FileNameExtensionFilter textFilter=new FileNameExtensionFilter("Only Text File (.txt)","txt");
		    filechooser.setAcceptAllFileFilterUsed(false);
		    filechooser.addChoosableFileFilter(textFilter);
		    int action =filechooser.showOpenDialog(null);
		
		    if(action!=JFileChooser.APPROVE_OPTION) {
		    	return;
		    }
		    else {
		    	try {
					BufferedReader reader=new BufferedReader(new FileReader(filechooser.getSelectedFile()));
				    textArea.read(reader,null);
		    	} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		}
		else if(e.getActionCommand().equalsIgnoreCase("save")) {
			JFileChooser filechooser=new JFileChooser();
			FileNameExtensionFilter textFilter=new FileNameExtensionFilter("Only Text File (.txt)","txt");
		    filechooser.setAcceptAllFileFilterUsed(false);
		    filechooser.addChoosableFileFilter(textFilter);
		    int action =filechooser.showSaveDialog(null);
		
		    if(action!=JFileChooser.APPROVE_OPTION) {
		    	return;
		    }
		    else {
		    	String fileName=filechooser.getSelectedFile().getAbsolutePath().toString();
		    	if(!fileName.contains(".txt"))
		    		fileName+=".txt";
		    	
		    	try {
					BufferedWriter bf=new BufferedWriter(new FileWriter(fileName));
				    textArea.write(bf);
		    	} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		    }
		}

		else if(e.getActionCommand().equalsIgnoreCase("print")) {
			try {
				textArea.print();
			} catch (PrinterException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if(e.getActionCommand().equalsIgnoreCase("exit")) {
			System.exit(0);
		}

		else if(e.getActionCommand().equalsIgnoreCase("copy")) {textArea.copy();}

		else if(e.getActionCommand().equalsIgnoreCase("paste")) {textArea.paste();}

		else if(e.getActionCommand().equalsIgnoreCase("cut")) {textArea.cut();}

		else if(e.getActionCommand().equalsIgnoreCase("selectall")) {textArea.selectAll();}

		else if(e.getActionCommand().equalsIgnoreCase("about")) {new About().setVisible(true);}
		else {}
	
	
	}

}
