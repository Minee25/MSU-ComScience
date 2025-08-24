import java.awt.*;
import javax.swing.*;

public class Lab4 {
  public static void main(String[] args) {
    // Frame
    Frame frame = new Frame("Multiple Buttons");
    frame.setSize(500, 400);
    frame.setLocation(300, 150);
    frame.setLayout(new BorderLayout());

    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);

    // Button
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton openButton = new JButton("Open File");
    JButton saveButton = new JButton("Save File");
    JButton clearButton = new JButton("Clear Screen");

    buttonPanel.add(openButton);
    buttonPanel.add(saveButton);
    buttonPanel.add(clearButton);

    frame.add(scrollPane, BorderLayout.CENTER);
    frame.add(buttonPanel, BorderLayout.SOUTH);
    frame.setVisible(true);
  }
}
