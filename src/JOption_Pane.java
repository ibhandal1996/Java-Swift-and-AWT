import javax.swing.JOptionPane;


public class JOption_Pane {
	
	//JOptionPane: pop up a standard dialog boc that prompts users for a value or infroms them of something
	
	public static void main(String[] args) {
		//while(true)	{
			//JOptionPane.showMessageDialog(null, "Pop up", "Title", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Pop up", "Title", JOptionPane.INFORMATION_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Pop up", "Title", JOptionPane.QUESTION_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Pop up", "Title", JOptionPane.WARNING_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Pop up", "Title", JOptionPane.ERROR_MESSAGE);
		//}
		
		int answer = JOptionPane.showConfirmDialog(null, "Yes, No, Cancel", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name? ");
		System.out.println("Hi " + name);
		
		JOptionPane.showOptionDialog(null, "Tutles", "Cirlce", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null /* this can be an icon*/, null, 0);
	}

}
