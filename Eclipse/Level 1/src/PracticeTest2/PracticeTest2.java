package PracticeTest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeTest2 implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton up;
	JButton down;
	JButton left;
	JButton right;
	String previous = "";

	public static void main(String[] args)
	{
		new PracticeTest2();
	}

	PracticeTest2()
	{
		frame = new JFrame("Practice Test 2");
		panel = new JPanel();
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.add(up);
		panel.add(down);
		panel.add(left);
		panel.add(right);

		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);

		frame.setSize(200, 150);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == up)
		{
			if (!previous.equals(up.getText()))
			{
				System.out.println("Up");
				previous = up.getText();
			}
		}

		else if (e.getSource() == down)
		{
			if (!previous.equals(down.getText()))
			{
				System.out.println("Down");
				previous = down.getText();
			}
		}

		else if (e.getSource() == left)
		{
			if (!previous.equals(left.getText()))
			{
				System.out.println("Left");
				previous = left.getText();
			}
		}

		else if (e.getSource() == right)
		{
			if (!previous.equals(right.getText()))
			{
				System.out.println("Right");
				previous = right.getText();
			}
		}

	}

}
