package MenuBar;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class myFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	myFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f gives file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e gives edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h gives help
		loadItem.setMnemonic(KeyEvent.VK_L); // l gives load
		saveItem.setMnemonic(KeyEvent.VK_S); // s gives save
		exitItem.setMnemonic(KeyEvent.VK_E); // e gives exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}

}
