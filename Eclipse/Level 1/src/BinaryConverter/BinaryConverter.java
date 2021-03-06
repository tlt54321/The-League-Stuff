package BinaryConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener, FocusListener
{
	JFrame frame;
	JPanel panel;
	JButton convert;
	JLabel decimalToBinaryTxt;
	JLabel binaryToDecimalTxt;
	JTextField binary1;
	JTextField decimal1;
	JTextField binary2;
	JTextField decimal2;

	public static void main(String[] args)
	{
		BinaryConverter b = new BinaryConverter();
	}

	public BinaryConverter()
	{
		frame = new JFrame();
		panel = new JPanel();
		convert = new JButton("Convert");
		decimalToBinaryTxt = new JLabel("Decimal to Binary");
		binaryToDecimalTxt = new JLabel("Binary to Decimal");
		binary1 = new JTextField();
		decimal1 = new JTextField("Enter a decimal number:");
		decimal2 = new JTextField();
		binary2 = new JTextField("Enter a binary number:");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.add(panel);

		panel.setLayout(null);

		panel.add(convert);
		panel.add(binaryToDecimalTxt);
		panel.add(decimalToBinaryTxt);
		panel.add(binary1);
		panel.add(decimal1);
		panel.add(binary2);
		panel.add(decimal2);

		convert.setBounds(50, 50, 100, 100);
		decimalToBinaryTxt.setBounds(50, 200, 200, 100);
		binaryToDecimalTxt.setBounds(50, 350, 200, 100);
		binary1.setBounds(400, 235, 170, 40);
		decimal1.setBounds(200, 235, 170, 40);
		binary2.setBounds(200, 380, 170, 40);
		decimal2.setBounds(400, 380, 170, 40);

		decimal1.addFocusListener(this);
		binary2.addFocusListener(this);

		convert.addActionListener(this);

		frame.setSize(800, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == convert)
		{
			if (decimal1.getText().contains(
					"[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+"))
				decimal1.setText("0");
			if (binary2.getText().contains(
					"[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+"))
				binary2.setText("0");

			binary1.setText(decimalToBinary(decimal1.getText()));
			decimal2.setText(binaryToDecimal(binary2.getText()));
		}

	}

	public String decimalToBinary(String input)
	{
		if (input
				.contains("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+"))
		{

			return "Please Enter a Decimal Number:";
		}

		else
		{
			int toBinary = Integer.parseInt(input);
			String result = "";

			if (toBinary == 0)
				result = "0";

			while (toBinary > 0)
			{
				int rem = toBinary % 2;
				result = rem + result;
				toBinary /= 2;
			}

			return result;
		}
	}

	public String binaryToDecimal(String input)
	{
		double result = 0;

		if (input
				.contains("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ23456789]+"))
		{
			return "0";
		}

		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == '1')
				result = result + Math.pow(2, input.length() - 1 - i);
		}

		int intResult = (int) result;

		return Integer.toString(intResult);
	}

	String decimalTemp;
	String binaryTemp;

	@Override
	public void focusGained(FocusEvent a)
	{
		if (a.getSource() == decimal1)
		{
			decimalTemp = decimal1.getText();
			decimal1.setText("");
		}

		else if (a.getSource() == binary2)
		{
			binaryTemp = binary2.getText();
			binary2.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent a)
	{
		if (a.getSource() == decimal1)
		{
			decimalTemp = decimal1.getText();
			if (decimalTemp.equals(""))
			{
				decimalTemp = "Enter a decimal number:";
			}
			decimal1.setText(decimalTemp);
		}

		else if (a.getSource() == binary2)
		{
			binaryTemp = binary2.getText();
			if (binaryTemp.equals(""))
			{
				binaryTemp = "Enter a binary number:";
			}
			binary2.setText(binaryTemp);
		}

	}
}
