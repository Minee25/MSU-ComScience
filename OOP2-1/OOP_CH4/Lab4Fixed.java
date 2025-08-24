import java.awt.*;
import javax.swing.*;

public class Lab4Fixed {
  public static void main(String[] args) {
    // Run the GUI code on the Event Dispatch Thread (EDT)
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Multiple Buttons");
      frame.setSize(500, 400);
      frame.setLocation(300, 150);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());

      JTextArea textArea = new JTextArea();
      JScrollPane scrollPane = new JScrollPane(textArea); // Good practice to wrap text area in a scroll pane

      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

      JButton openButton = new JButton("Open File");
      JButton saveButton = new JButton("Save File");
      JButton clearButton = new JButton("Clear Screen");

      buttonPanel.add(openButton);
      buttonPanel.add(saveButton);
      buttonPanel.add(clearButton);

      // Specify the layout position for each component
      frame.add(scrollPane, BorderLayout.CENTER);
      frame.add(buttonPanel, BorderLayout.SOUTH);
      
      frame.setVisible(true);
    });
  }
}
