package openNewWindow;

import java.awt.*;
import javax.swing.*;

public class NewWindow {

	 JFrame frame = new JFrame();
	 JLabel label = new JLabel("That's all folks!");
	 
	 NewWindow()
	 {
		  label.setBounds(0,0,250,250);
		  label.setFont(new Font(null,Font.PLAIN,25));
		  
		  frame.add(label);
		  
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(420,420);
		  frame.setLayout(null);
		  frame.setVisible(true);
	 }
}