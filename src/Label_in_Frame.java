import java.awt.Color;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label_in_Frame {
	
	public static void main(String[] args) {
		
		ImageIcon img1 = new ImageIcon("Label.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3); //creates broder
		
		JLabel label = new JLabel(); //creates label
		label.setText("This is my label"); //sets texts of label
		label.setIcon(img1);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(255, 185, 0)); //set color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
		label.setIconTextGap(10); //sets gap of text to image
		label.setBackground(Color.black); //change color of label
		label.setOpaque(true); //displays background color
		label.setBorder(border); //borders our label
		label.setVerticalAlignment(JLabel.CENTER); //sets vertical position of icon and text within label
		label.setHorizontalAlignment(JLabel.CENTER); //sets horizontal position of icon and text within label
		//label.setBounds(0,0,300,300); //set x,y position within frame and dimensions 
		
		
		myFrame frame = new myFrame(); //creates frame
		frame.add(label); //adds label
		//frame.setLayout(null);
		frame.pack(); //packs the frame with label and text
		
		
	}
	
}