import javax.swing.JOptionPane;

public class CodingExercise2
{
	public static void main(String[] args)
	{
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your age?"));
		
		int year = 2015 - age;
		
		JOptionPane.showMessageDialog(null, "You were born in " + year);
		
		if(age >= 30)
			JOptionPane.showMessageDialog(null, "You are too old to play this game!");
		
	}
}
