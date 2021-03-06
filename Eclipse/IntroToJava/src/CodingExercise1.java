import java.awt.Color;
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Tortoise;

public class CodingExercise1
{
	public static void main(String[] args)
	{
		Tortoise.setSpeed(8);
		
		String userInput = JOptionPane.showInputDialog(null, "What color do you want? (red or blue)");
		
		if(userInput.equalsIgnoreCase("red"))
			Tortoise.setPenColor(Color.RED);
		
		else
			Tortoise.setPenColor(Color.BLUE);
		
		Tortoise.setPenWidth(10);
		
		for(int i = 0; i < 4; i++)
		{
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}
}
