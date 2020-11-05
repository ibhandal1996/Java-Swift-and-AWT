import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class button{
	

	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		
		ImageIcon icon = new ImageIcon("Iqbal_Bhandal.jpg");
		ImageIcon icon1 = new ImageIcon("thumb.jpeg");
		label.setIcon(icon1);
		label.setBounds(150,250,150,250);
		label.setVisible(false);
		
		JButton button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(e -> System.out.println("poo"));
		button.addActionListener(e -> label.setVisible(true));
		button.setText("Button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.TOP);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		myFrame frame = new myFrame();
		frame.setLayout(null);
		frame.add(button);
		frame.add(label);
		
	}
	
}
