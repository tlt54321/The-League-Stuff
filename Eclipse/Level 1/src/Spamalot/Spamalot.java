package Spamalot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener, FocusListener
{
	static final String FAKE_USERNAME = "getspammedm9911@gmail.com";
	static final String FAKE_PASSWORD = "Smurf6969";

	JFrame frame;
	JPanel panel;
	JTextField text;
	JButton good;
	JButton bad;

	// JButton txtMessage;

	public static void main(String[] args)
	{
		Spamalot a = new Spamalot();
	}

	public Spamalot()
	{
		frame = new JFrame();
		panel = new JPanel();
		text = new JTextField("Phone Number/Email");
		good = new JButton("Good");
		bad = new JButton("Bad");
		// txtMessage = new JButton("Message");

		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(null);

		panel.add(text);
		panel.add(good);
		panel.add(bad);
		// panel.add(txtMessage);

		text.setBounds(0, 0, 250, 35);
		good.setBounds(270, 0, 65, 35);
		bad.setBounds(350, 0, 65, 35);
		// txtMessage.setBounds(420, 0, 100, 35);

		good.addActionListener(this);
		bad.addActionListener(this);
		// txtMessage.addActionListener(this);
		text.addFocusListener(this);

		frame.setSize(550, 70);
	}

	private boolean sendSpam(String recipient, String subject, String content)
	{

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator()
				{
					protected javax.mail.PasswordAuthentication getPasswordAuthentication()
					{
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;
		} catch (MessagingException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	String sendTextMessage(String phoneNumber, String message)
	{
		if (sendSpam(phoneNumber + "@tmomail.net", "", message))
			return "T-Mobile";
		if (sendSpam(phoneNumber + "@vmobl.com", "", message))
			return "Virgin Mobile";
		if (sendSpam(phoneNumber + "@cingularme.com", "", message))
			return "Cingular";
		if (sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message))
			return "Sprint";
		if (sendSpam(phoneNumber + "@vtext.com", "", message))
			return "Verizon";
		if (sendSpam(phoneNumber + "@messaging.nextel.com", "", message))
			return "Nextel";
		return "FAIL!";
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == good)
		{
			sendSpamAttack(4, text.getText(), "Subject", "Good Content");
		}

		else if (e.getSource() == bad)
		{
			sendSpamAttack(20, text.getText(), "Subject", "Bad Content");
		}
	}

	String textTemp = "";

	@Override
	public void focusGained(FocusEvent e)
	{
		if (e.getSource() == text)
		{
			if (text.getText().equals("Phone Number/Email"))
			{
				text.setText("");
				text.setBackground(null);
			}

			textTemp = text.getText();
		}
	}

	@Override
	public void focusLost(FocusEvent e)
	{
		if (e.getSource() == text)
		{
			textTemp = text.getText();
		}
	}

	public void sendSpamAttack(int times, String recipient, String subject,
			String content)
	{
		if (!sendSpam(recipient, subject, content))
		{
			text.setBackground(Color.RED);
		} else
		{
			text.setBackground(Color.GREEN);
		}

		for (int i = 0; i < times - 1; i++)
		{
			sendSpam(recipient, subject, content);
		}
	}

}
