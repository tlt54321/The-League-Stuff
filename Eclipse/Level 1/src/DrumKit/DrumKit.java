package DrumKit;

//Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel superKai;
	JLabel superKaiGif;
	JFrame window;
	JPanel panel;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"

		window = new JFrame();

		// 2. Make the frame visible

		window.setVisible(true);

		// 3. Set the size of the frame

		// 4. Set the title of the frame

		window.setTitle("Drum Kit");

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 5. Make a JPanel and initialize it.

		panel = new JPanel();

		// 6. Add the panel to the frame. (The panel is invisible.)

		window.add(panel);

		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".
		// 8. Put the name of your image in a String variable.

		// 9. Use the "createLabelImage()" method to initialize the
		// drumLabelWithImage variable.

		drumLabelWithImage = createLabelImage("drum.jpg");
		superKaiGif = createLabelImage("superKaiGif.gif");
		superKai = createLabelImage("superKai.png");

		// 10. Add the image to the panel

		panel.add(drumLabelWithImage);
		panel.add(superKaiGif);
		panel.add(superKai);

		// 11. Set the layout of the panel to "new GridLayout()"

		panel.setLayout(new GridLayout());

		// 12. call the pack() method on the frame

		window.pack();

		// 13. add a mouse listener to drumLabelWithImage.

		this.drumLabelWithImage.addMouseListener(this);
		this.superKai.addMouseListener(this);
		this.superKaiGif.addMouseListener(this);

		window.setSize(1920, 1080);

	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		if (e.getSource() == this.drumLabelWithImage) {
			playSound("drum.wav");
		}

		else if (e.getSource() == this.superKaiGif) {
			playSound("wam.wav");
		}

		else if (e.getSource() == this.superKai) {
			playSound("wamDubstep.wav");
		}

		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package".
		// There are some sounds here: http://bit.ly/drum-sounds or you can also
		// get them from freesound.org
		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.r
	}

	private JLabel createLabelImage(String fileName)
			throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
