import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DemoServer extends JFrame {
	JLabel address = new JLabel();
	JTextArea content = new JTextArea();
	JScrollPane scroll = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	public DemoServer() {
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		Font font = new Font("Tahoma", Font.BOLD, 30);
		address.setFont(font);
		address.setForeground(Color.red);
		address.setHorizontalAlignment(SwingConstants.CENTER);
		font = new Font("Tahoma", Font.BOLD, 20);
		address.setFont(font);
		content.setFont(font);
		content.setForeground(Color.blue);
		add(address, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		DemoServer frame = new DemoServer();
		try {
			InetAddress a = InetAddress.getLocalHost();
			frame.address.setText(a.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Thread serverThread = new ServerThread(frame);
		serverThread.start();
		frame.setVisible(true);
	}
}

class ServerThread extends Thread {
	// Frame
	DemoServer server;
	public ServerThread(DemoServer server) {
		this.server = server;
	}

	@Override
	public void run() {
		try {
			// Open port 50101 for receiving data
			ServerSocket servSocket = new ServerSocket(50101);
			// Loop for waiting data
			while (true) {
				try {
					String line = "";
					// Waiting for data
					Socket socket = servSocket.accept();
					// Data in then convert to String
					InputStream input = socket.getInputStream();
					InputStreamReader inputStream = new InputStreamReader(input);
					BufferedReader bufferIn = new BufferedReader(inputStream);
					// Read all lines to TextArea
					while ((line = bufferIn.readLine()) != null) {
						server.content.insert(line + "\n",0);
						server.content.setCaretPosition(0);
					}
					bufferIn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}