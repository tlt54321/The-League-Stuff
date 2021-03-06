package TypingTutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener
{
	JFrame frame;
	JPanel panel;
	JLabel label;

	public static void main(String[] args)
	{
		TypingTutor a = new TypingTutor();
	}

	public TypingTutor()
	{
		frame = new JFrame("Type or Die");
		panel = new JPanel();
		label = new JLabel();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		panel.add(label);

		label.setText(createTypeText(30));

		frame.setSize(500, 350);
	}

	char generateRandomLetter()
	{
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	String createTypeText(int length)
	{
		String string = "";
		for (int i = 0; i < length; i++)
		{
			string = string + generateRandomLetter();
		}
		return string;
	}

	@Override
	public void keyPressed(KeyEvent e)
	{

	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

}
