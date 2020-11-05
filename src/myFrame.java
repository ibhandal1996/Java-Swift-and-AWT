import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame {

	myFrame()
	{
		
		this.setTitle("JFrame Title"); //title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X closes the frame
		//this.setResizable(false); //makes it so the frame cannot be resized
		this.setSize(500,500); //sets dimensions of frame
		this.setVisible(true); //makes frame visible 
		
		ImageIcon img = new ImageIcon("Iqbal_Bhandal.jpg"); //creates imageIcon
		this.setIconImage(img.getImage()); //changes icon of frame
		this.getContentPane().setBackground(new Color(145,68,89)); 
	}
}
