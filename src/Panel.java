import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	
	public static void main(String[] args) {
		
		ImageIcon img = new ImageIcon("Thumb.jpeg");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(img);
		label.setBounds(0,0,75,75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(new BorderLayout());
		
		myFrame frame = new myFrame();
		frame.setLayout(null);
		frame.setSize(750,750);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}
