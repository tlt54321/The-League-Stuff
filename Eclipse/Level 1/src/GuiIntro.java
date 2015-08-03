import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiIntro implements ActionListener
{
	JFrame window;
	JPanel panel;
	JButton button;
	JTextField text;
	
	
	public static void main(String[] args)
	{
		GuiIntro g = new GuiIntro();
		
	}
	
	public GuiIntro()
	{
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Deditated Wam");
		
		panel = new JPanel();
		button = new JButton("Button");
		text = new JTextField(20);
		
		
		panel.add(button);
		panel.add(text);
		window.add(panel);
		
		button.addActionListener(this);
		
		window.pack();
		
		window.setSize(500, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			text.setText("Dedotated Wam");
		}
		
	}
	
}
