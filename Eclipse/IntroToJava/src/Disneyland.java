import javax.swing.JOptionPane;


public class Disneyland
{
	public static void main(String[] args)
	{
		String strHeight = JOptionPane.showInputDialog(null, "What is your height(inches)?");
		int height = Integer.parseInt(strHeight);
		
		if(height >= 50)
			JOptionPane.showMessageDialog(null, "You may enter the ride");
		
		else
			JOptionPane.showMessageDialog(null, "You are not a big kid. Go away!");
	}
}
