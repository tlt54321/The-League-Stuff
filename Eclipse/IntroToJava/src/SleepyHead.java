// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		int result = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
				JOptionPane.YES_NO_OPTION);
		
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
	
		if(result == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Time to sleep");
		}
		
		else if(result == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Still time to sleep");
		}
		
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}

