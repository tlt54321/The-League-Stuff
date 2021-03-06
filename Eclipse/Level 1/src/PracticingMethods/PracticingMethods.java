package PracticingMethods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PracticingMethods implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton[] button;

	public static void main(String[] args)
	{
		new PracticingMethods();
	}

	public PracticingMethods()
	{
		frame = new JFrame("Methods");
		panel = new JPanel();
		button = new JButton[8];

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(null);

		frame.add(panel);

		for (int i = 0; i < 8; i++)
		{
			button[i] = new JButton();
			panel.add(button[i]);
			button[i].setBounds(20, 15 + (55 * i), 100, 50);
			button[i].addActionListener(this);
			button[i].setText("Method " + (i + 1));
		}

		frame.setSize(150, 500);
	}

	public int addTen(int x)
	{
		return x + 10;
	}

	public String exclam(String x)
	{
		x = x + "!";
		return x;
	}

	public String favColor()
	{
		return JOptionPane.showInputDialog("What is your favorite color?");
	}

	public float subTwo(float x, int y)
	{
		return x - y;
	}

	public int addTogether(int x, int y, int z)
	{
		return x + y + z;
	}

	public void printName25(String name)
	{
		for (int i = 0; i < 25; i++)
		{
			System.out.println(name);
		}
	}

	public void checkIf(int x, String y)
	{
		if (x > y.length())
		{
			System.out.println("Too low");
		}

		else
		{
			System.out.println(y);
		}
	}

	public float divByFloat(float x, float y)
	{
		if (y == 0f)
		{
			System.out.println("You can not divide by zero!");
			return 0f;
		}

		return x / y;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int callNumber = 0;

		for (int i = 0; i < 8; i++)
		{
			if (e.getSource() == button[i])
			{
				callNumber = i;
			}
		}

		if (callNumber == 0)
		{
			int number = Integer.parseInt(JOptionPane
					.showInputDialog("Enter a number to add 10 to:"));
			JOptionPane.showMessageDialog(null, addTen(number));
		}

		else if (callNumber == 1)
		{
			String message = JOptionPane.showInputDialog(null,
					"Enter a string to add an exclamation point to:");
			JOptionPane.showMessageDialog(null, exclam(message));
		}

		else if (callNumber == 2)
		{
			JOptionPane.showMessageDialog(null, favColor());
		}

		else if (callNumber == 3)
		{
			float x = Float.parseFloat(JOptionPane
					.showInputDialog("Enter a float to subtract from:"));
			int y = Integer.parseInt(JOptionPane
					.showInputDialog("Enter an integer to subtract with:"));
			JOptionPane.showMessageDialog(null, x - y);
		}

		else if (callNumber == 4)
		{

		}

		else if (callNumber == 5)
		{

		}

		else if (callNumber == 6)
		{

		}

		else if (callNumber == 7)
		{

		}
	}

}
