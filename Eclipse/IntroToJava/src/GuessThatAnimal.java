// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class GuessThatAnimal {

	public static void main(String[] args) {
		
		int FourLegs = JOptionPane.showConfirmDialog(null, "Does the animal have 4 leg",  "", 
				JOptionPane.YES_NO_OPTION);
		
		if(FourLegs == JOptionPane.YES_OPTION)
		{
			int stripes = JOptionPane.showConfirmDialog(null, "Does the animal have stripes?",  "", 
					JOptionPane.YES_NO_OPTION);
			
			if(stripes == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "The animal is probably a zebra");
			}
			
			if(stripes == JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(null, "The animal is probably a pig");
			}
		}
		
		if(FourLegs == JOptionPane.NO_OPTION)
		{
			int TwoLegs = JOptionPane.showConfirmDialog(null, "Does the animal have two legs?",  "", 
					JOptionPane.YES_NO_OPTION);
			
			if(TwoLegs == JOptionPane.YES_OPTION)
			{
				int HasFur = JOptionPane.showConfirmDialog(null, "Does the animal have fur?",  "", 
						JOptionPane.YES_NO_OPTION);
				
				if(HasFur == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null, "The animal is probably a monkey");
				}
				
				if(HasFur == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(null, "The animal is probably a bird");
				}
			}
			
			if(TwoLegs == JOptionPane.NO_OPTION)
			{
				int InWater = JOptionPane.showConfirmDialog(null, "Does the animal live in water?",  "", 
						JOptionPane.YES_NO_OPTION);
				
				if(InWater == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null, "The animal is probably a fish");
				}
				
				if(InWater == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(null, "The animal is probably a spider");
				}
				
			}
			
		}
		
	}
	
}

