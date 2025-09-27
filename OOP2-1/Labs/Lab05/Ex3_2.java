import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Ex3_2 {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  JTextField showRGBColor = new JTextField();
  DrawPanel panelColor = new DrawPanel();

  public Windows() {
    setTitle("Interactive colors");
    setSize(512, 512);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());
    
    add(showRGBColor, BorderLayout.NORTH);
    add(panelColor, BorderLayout.CENTER);

    panelColor.addMouseMotionListener(new MouseMotionListener() {
      @Override
      public void mouseDragged(MouseEvent e) {
      }

      @Override
      public void mouseMoved(MouseEvent e) {
        panelColor.panelColorMouseMove(e, showRGBColor);
      }
    });
  }

}

class DrawPanel extends JPanel {
  private ArrayList<Point> points = new ArrayList<>();
  private Color bgColor = Color.WHITE;

  public void panelColorMouseMove(MouseEvent e, JTextField infoField) {
    int x = e.getX();
    int y = e.getY();

    int panelWidth = getWidth() <= 0 ? 1 : getWidth();
    int panelHeight = getHeight() <= 0 ? 1 : getHeight();

    int r = (x * 255) / panelWidth;
    int g = (y * 255) / panelHeight;
    int b = ((x + y) * 255) / (panelWidth + panelHeight);
    bgColor = new Color(r, g, b);
    infoField.setText("X = " + x + ", Y = " + y + " | (R = " + r + ", G = " + g + ", B = " + b + ")");
    points.add(new Point(x, y));
    repaint();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(bgColor);

    g.setColor(Color.BLACK);
    for (int i = 1; i < points.size(); i++) {
      Point p1 = points.get(i - 1);
      Point p2 = points.get(i);
      g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

    g.setColor(Color.RED);
    for (Point point : points) {
      g.fillOval(point.x - 2, point.y - 2, 4, 4);
    }
  }
}