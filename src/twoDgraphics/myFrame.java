package twoDgraphics;
import java.awt.*;
import javax.swing.*;

public class myFrame extends JFrame{
	
	myPanel panel;
	
	myFrame(){
		
		panel = new myPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
	
	
}
