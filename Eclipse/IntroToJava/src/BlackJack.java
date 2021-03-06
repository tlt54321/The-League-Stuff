import java.util.Random;
import javax.swing.JOptionPane;

public class BlackJack
{
	public static void main(String[] args)
	{
		boolean isRunning = true;
		boolean youLoose = false;
		
		int otherCards = 0;
		int finalScore = 0;
		
		int Card = randCard();
		System.out.println("Your first card is: " + Card);
		
		while(isRunning)
		{	
			int userResponse = JOptionPane.showConfirmDialog(null, "Do you want to hit?", "", JOptionPane.YES_NO_OPTION);
			
			
			if(userResponse == JOptionPane.YES_OPTION)
			{
				int newCard = randCard();
				otherCards += newCard;
				finalScore = Card + otherCards;
				System.out.println("The new card is: " + newCard + ". Your score so far is: " + finalScore);
				
				if(finalScore > 21)
				{
					isRunning = false;
					youLoose = true;
				}
			}
			
			else
			{
				isRunning = false;
				finalScore = Card + otherCards;
			}
		}
		
		if(youLoose)
		{
			System.out.println("You lose. You got: " + finalScore);
		}
		
		else if(!youLoose)
		{
			System.out.println("You got: " + finalScore + ". Your final score is: " + (21 - finalScore));
		}
		
	}
	
	public static int randCard()
	{
		int randCard = new Random().nextInt(9) + 1;
		return randCard;
	}
	
}
