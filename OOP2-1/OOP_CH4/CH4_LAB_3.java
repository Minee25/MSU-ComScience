import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CH4_LAB_3 extends JFrame {
    public CH4_LAB_3() {
        setTitle("Exercise 3: 50 Random Buttons");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use absolute positioning

        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            JButton btn = new JButton("" + i);
            
            // Generate random position within the frame bounds
            int x = rand.nextInt(getWidth() - 100); // Subtract button width
            int y = rand.nextInt(getHeight() - 50); // Subtract button height
            
            // Generate a random color
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
            
            btn.setBounds(x, y, 80, 30); // Set position and size
            btn.setBackground(randomColor);
            // To make the background color visible on some look and feels
            btn.setOpaque(true);
            btn.setBorderPainted(false);

            add(btn);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CH4_LAB_3().setVisible(true);
        });
    }
}
