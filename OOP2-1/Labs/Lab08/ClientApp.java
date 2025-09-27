import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.*;

import javax.swing.*;


public class ClientApp extends JFrame{

	JTextField address = new JTextField("");
	JTextField message = new JTextField("");
	JButton sendButton = new JButton("Send");

	public ClientApp() {
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(5, 1));
		add(new JLabel("Address:"));
		add(address);
		add(new JLabel("Message:"));
		add(message);
		add(sendButton);
	}
	public static void main(String[] args) {
		ClientApp frame = new ClientApp();
		frame.setVisible(true);
		frame.sendButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// Connect to Server
					Socket socket = new Socket(frame.address.getText(), 50101);
					PrintStream dataOut = new PrintStream(socket.getOutputStream());
					// Prepare data format
					InetAddress address = InetAddress.getLocalHost();
					String msg = address.getHostName() + "#" + frame.message.getText();
					// Send data out
					dataOut.println(msg);
					dataOut.close();
				} catch (Exception e1) {
				}
				frame.message.setText("");
			}
		});
	}
}

