package OpticalIllusion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OpticalIllusion {
	JFrame frame;
	JPanel panel;
	JButton[] buttons;

	public static void main(String[] args) {
		new OpticalIllusion();
	}

	OpticalIllusion() {
		frame = new JFrame("Optical Illusion");
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		buttons = new JButton[16];
		for (int i = 0; i < 16; i++) {
			buttons[i] = new JButton();
			buttons[i].setSize(100, 100);
			buttons[i].setBackground(Color.BLACK);
			buttons[i].setOpaque(true);
			panel.add(buttons[i]);
		}

		frame.add(panel);
		frame.setSize(400, 400);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2,
				dim.height / 2 - frame.getSize().height / 2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
