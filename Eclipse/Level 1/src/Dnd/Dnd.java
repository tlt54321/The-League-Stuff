package Dnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dnd implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton[] diceButtons;
	JButton clear;
	JLabel current;
	JLabel total;
	JLabel modifierLabel;
	JTextField modifier;
	int rollNumber = 0;
	int totalNumber = 0;

	public static void main(String[] args)
	{
		new Dnd();
	}

	Dnd()
	{
		frame = new JFrame("Dungeons and Dragons");
		panel = new JPanel();
		diceButtons = new JButton[6];
		clear = new JButton("Clear");
		current = new JLabel("Current: 0");
		total = new JLabel("Total: 0");
		modifierLabel = new JLabel("Modifier");
		modifier = new JTextField();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.add(clear);
		panel.add(current);
		panel.add(total);
		panel.add(modifierLabel);
		panel.add(modifier);

		panel.setLayout(null);

		clear.setBounds(10, 320, 100, 40);
		current.setBounds(120, 20, 100, 50);
		total.setBounds(220, 20, 100, 50);
		modifierLabel.setBounds(170, 100, 100, 50);
		modifier.setBounds(148, 135, 100, 30);

		modifier.setHorizontalAlignment(JTextField.CENTER);

		for (int i = 0; i < diceButtons.length; i++)
		{
			int diceNumber = (2 * (i + 2));
			if (diceNumber == 14)
				diceNumber = 20;
			diceButtons[i] = new JButton("Dice: " + diceNumber);
			panel.add(diceButtons[i]);
			diceButtons[i].setBounds(10, 20 + (50 * i), 100, 40);
			diceButtons[i].addActionListener(this);
		}

		clear.addActionListener(this);

		frame.setSize(300, 420);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		for (int i = 0; i < diceButtons.length; i++)
		{
			if (e.getSource() == diceButtons[i])
			{
				int mod;

				try
				{
					mod = Integer.parseInt(modifier.getText());
				} catch (Exception ex)
				{
					mod = 0;
				}

				Random rand = new Random();

				int diceNumber = (2 * (i + 2));

				if (diceNumber == 14)
				{
					rollNumber = rand.nextInt(20) + 1;
					totalNumber = totalNumber + rollNumber;
					current.setText("Current: " + rollNumber);
					total.setText("Total: " + (totalNumber + mod));
				}

				else
				{
					rollNumber = rand.nextInt(diceNumber) + 1;
					totalNumber = totalNumber + rollNumber;
					current.setText("Current: " + rollNumber);
					total.setText("Total: " + (totalNumber + mod));
				}

			}
		}

		if (e.getSource() == clear)
		{
			current.setText("Current: 0");
			total.setText("Total: 0");
			rollNumber = 0;
			totalNumber = 0;
		}
	}

}
