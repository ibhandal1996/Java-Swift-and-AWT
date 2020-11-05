package twoDgraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class myPanel extends JPanel{

	myPanel(){
		  
		  //image = new ImageIcon("sky.png").getImage();
		  this.setPreferredSize(new Dimension(500,500));
		 }
	
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.pink);
		g2d.setStroke(new BasicStroke(10));
		//g2d.drawLine(0, 0, 500, 500);
		
		g2d.drawRect(0,0,100,100);
		g2d.fillRect(200, 200, 500, 400);
		
		g2d.setPaint(Color.orange);
		g2d.drawOval(0, 0, 100, 300);
		
		g2d.fillOval(100, 200, 100, 300);
		
		int[] x = {150, 250, 350};
		int[] y = {350, 100, 300};
		g2d.setPaint(Color.cyan);
		g2d.drawPolygon(x, y, 3);
		
		g2d.setPaint(Color.red);
		g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
		g2d.drawString("Hi, I'm Paul!", 50, 50);
		
	}
}
