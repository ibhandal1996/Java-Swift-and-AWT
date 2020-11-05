package mouseListener;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class myFrame extends JFrame implements MouseListener{
	
JLabel label;
	
	myFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);
		this.setLayout(null);	
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.orange);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("You pressed the mouse");
		label.setBackground(Color.pink);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("You released the mouse");
		label.setBackground(Color.MAGENTA);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("You entered the component");
		label.setBackground(Color.cyan);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("You exited the component");
		label.setBackground(Color.orange);
	}

}
