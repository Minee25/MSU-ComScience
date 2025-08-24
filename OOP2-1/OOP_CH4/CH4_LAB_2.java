import javax.swing.*;
import java.awt.*;

public class CH4_LAB_2 extends JFrame {
    public CH4_LAB_2() {
        setTitle("Exercise 2: Buttons and TextAreas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the layout to a grid with 8 rows and 5 columns.
        // The hgap and vgap parameters add some spacing between components.
        setLayout(new GridLayout(8, 5, 5, 5)); 

        // Create and add 20 buttons and 20 text areas alternately.
        for (int i = 1; i <= 20; i++) {
            add(new JButton("Button " + i));
            add(new JTextArea("TextArea " + i));
        }
    }

    public static void main(String[] args) {
        // Create and show the GUI on the Event Dispatch Thread.
        SwingUtilities.invokeLater(() -> {
            new CH4_LAB_2().setVisible(true);
        });
    }
}
