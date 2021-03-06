package NastySurprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton trick;
	JButton treat;

	public static void main(String[] args)
	{
		new NastySurprise();
	}

	NastySurprise()
	{
		frame = new JFrame("Nasty Surprise");
		panel = new JPanel();
		trick = new JButton("Trick");
		treat = new JButton("Treat");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		panel.add(trick);
		panel.add(treat);

		trick.addActionListener(this);
		treat.addActionListener(this);

		frame.setSize(200, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == trick)
		{
			showPictureFromInternet(4,
					"https://secure.static.tumblr.com/fe49ca9e515b677c00aa6d2d928d2d28/biutqn7/jCjneb4n9/tumblr_static_filename_640_v2.jpg");
		}

		else if (e.getSource() == treat)
		{
			showPictureFromInternet(1,
					"http://www.pamperedpetz.net/wp-content/uploads/2015/09/Puppy1.jpg");
		}
	}

	private void showPictureFromInternet(int resize, String imageUrl)
	{
		try
		{
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			imageLabel.resize(imageLabel.getWidth() * resize,
					imageLabel.getHeight() * resize);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
