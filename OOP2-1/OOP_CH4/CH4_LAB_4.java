import javax.swing.*;
import java.awt.*;

public class CH4_LAB_4 extends JFrame {
    public CH4_LAB_4() {
        setTitle("Multiple Buttons");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a text area and add it to a scroll pane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Center the buttons

        // Create buttons
        JButton openButton = new JButton("Open File");
        JButton saveButton = new JButton("Save File");
        JButton clearButton = new JButton("Clear Screen");

        // Add buttons to the panel
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);

        // Add the button panel to the bottom of the frame
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CH4_LAB_4().setVisible(true);
        });
    }
}
