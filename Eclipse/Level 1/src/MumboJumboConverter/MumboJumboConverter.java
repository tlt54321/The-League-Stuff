package MumboJumboConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MumboJumboConverter implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JTextField input;
	JTextField output;
	JButton translate;

	public static void main(String[] args)
	{
		MumboJumboConverter a = new MumboJumboConverter();
	}

	public MumboJumboConverter()
	{
		frame = new JFrame();
		panel = new JPanel();
		input = new JTextField();
		output = new JTextField();
		translate = new JButton("Translate");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.setLayout(null);

		panel.add(input);
		panel.add(translate);
		panel.add(output);

		translate.addActionListener(this);

		input.setBounds(25, 25, 160, 40);
		translate.setBounds(250, 50, 100, 100);
		output.setBounds(25, 100, 160, 40);

		frame.setSize(500, 350);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == translate)
		{
			output.setText(Translate(input.getText()));
		}
	}

	public String Translate(String string)
	{
		StringBuilder b = new StringBuilder(string);

		for (int i = 0; i < b.length() - 1; i++)
		{
			b.setCharAt(i, languageIndex(b.charAt(i)));
		}
		return b.toString();
	}

	public char languageIndex(char a)
	{

		switch (a)
		{
		case 'a':
			a = 'a';
			break;
		case 'b':
			a = 'e';
			break;
		case 'c':
			a = 'i';
			break;
		case 'd':
			a = 'o';
			break;
		case 'e':
			a = 'u';
			break;
		case 'f':
			a = 'y';
			break;
		case 'g':
			a = 'a';
			break;
		case 'h':
			a = 'e';
			break;
		case 'i':
			a = 'i';
			break;
		case 'j':
			a = 'o';
			break;
		case 'k':
			a = 'u';
			break;
		case 'l':
			a = 'y';
			break;
		case 'm':
			a = 'a';
			break;
		case 'n':
			a = 'e';
			break;
		case 'o':
			a = 'i';
			break;
		case 'p':
			a = 'o';
			break;
		case 'q':
			a = 'u';
			break;
		case 'r':
			a = 'y';
			break;
		case 's':
			a = 'a';
			break;
		case 't':
			a = 'e';
			break;
		case 'u':
			a = 'i';
			break;
		case 'v':
			a = 'o';
			break;
		case 'w':
			a = 'u';
			break;
		case 'x':
			a = 'y';
			break;
		case 'y':
			a = 'a';
			break;
		case 'z':
			a = 'e';
			break;

		}
		return a;
	}
}
