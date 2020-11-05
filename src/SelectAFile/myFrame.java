package SelectAFile;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class myFrame extends JFrame implements ActionListener{
	
JButton button;
	
	myFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File(".")); //sets directory
			
			int response = fileChooser.showOpenDialog(null); //select file for opening
			//int response = fileChooser.showSaveDialog(null); //select file for saving
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

}
