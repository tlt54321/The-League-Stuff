package HashMapPractice;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HashMapPractice implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton addButton;
	JButton viewButton;
	HashMap<String, String> NameID;

	public static void main(String[] args) {
		new HashMapPractice();
	}

	HashMapPractice() {
		frame = new JFrame("Name and ID");
		panel = new JPanel();
		addButton = new JButton("Add");
		viewButton = new JButton("View");

		addButton.addActionListener(this);
		viewButton.addActionListener(this);

		panel.add(viewButton);
		panel.add(addButton);

		frame.add(panel);
		frame.setSize(400, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2,
				dim.height / 2 - frame.getSize().height / 2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		NameID = new HashMap<String, String>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name;
		String id;
		if (e.getSource() == viewButton) {
			for (String s : NameID.keySet()) {
				System.out.println("Name: " + NameID.get(s) + " ID: " + s);
			}
		} else if (e.getSource() == addButton) {
			name = JOptionPane.showInputDialog("Enter Name");
			id = JOptionPane.showInputDialog("Enter ID");
			NameID.put(id, name);
		}
	}

}
