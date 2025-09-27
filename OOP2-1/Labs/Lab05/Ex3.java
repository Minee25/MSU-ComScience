import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Ex3 {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  // JTextField showRGBColor = new JTextField();
  JLabel showRGBColor = new JLabel();
  JPanel panelColor = new JPanel();

  public Windows() {
    setTitle("Interactive colors");
    setSize(512, 512);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());

    showRGBColor.setBorder(new EmptyBorder(10, 0, 10, 0));
    showRGBColor.setHorizontalAlignment(SwingConstants.CENTER);
    add(showRGBColor, BorderLayout.NORTH);
    add(panelColor, BorderLayout.CENTER);

    panelColor.addMouseMotionListener(new MouseMotionListener() {

      @Override
      public void mouseDragged(MouseEvent e) {
      }

      @Override
      public void mouseMoved(MouseEvent e) {
        panelColorMouseMove(e);
      }

    });
  }

  private void panelColorMouseMove(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();

    int panelWidth = panelColor.getWidth();
    int panelHeight = panelColor.getHeight();

    panelWidth = (panelWidth <= 0) ? 1 : panelWidth;
    panelHeight = (panelHeight <= 0) ? 1 : panelHeight;

    int r = (x * 255) / panelWidth;
    int g = (y * 255) / panelHeight;
    int b = ((x + y) * 255) / (panelWidth + panelHeight);
    Color color = new Color(r, g, b);
    // showRGBColor.setText("X = " + x + ", Y = " + y + " | (R = " + r + ", G = " +
    // g + ", B = " + b + ")");
    showRGBColor.setText(
      "<html>" +
      "<font color='red'>X = " + x + "</font>, " +
      "<font color='green'>Y = " + y + "</font> | " +
      "<font color='red'>R = " + r + "</font>, " +
      "<font color='green'>G = " + g + "</font>, " +
      "<font color='blue'>B = " + b + "</font>" +
      "</html>"
    );
    showRGBColor.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panelColor.setBackground(color);
  }
}
