package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener
{
	JFrame window;
	JPanel panel;
	JButton calc;
	JTextField leftTxt;
	JTextField rightTxt;
	JTextField answer;
	
	
	public static void main(String[] args)
	{
		SimpleCalculator g = new SimpleCalculator();
		
	}
	
	public SimpleCalculator()
	{
		window = new JFrame();
		panel = new JPanel();
		calc = new JButton("Calculate");
		leftTxt = new JTextField(10);
		rightTxt = new JTextField(10);
		answer = new JTextField(15);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		panel.add(calc);
		panel.add(rightTxt);
		panel.add(leftTxt);
		panel.add(answer);
		calc.addActionListener(this);
		
		window.setTitle("Simple Calculator");
		
		
		window.pack();
		
		window.setSize(450, 100);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == calc)
		{
			int numAnswer = (Integer.parseInt(leftTxt.getText()) + (Integer.parseInt(rightTxt.getText())));
			
			answer.setText(Integer.toString(numAnswer));
		}
		
	}
	
}
