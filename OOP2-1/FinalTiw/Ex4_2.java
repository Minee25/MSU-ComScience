import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex4_2 extends JFrame {
  public Ex4_2() {
    setTitle("Ball Control");
    setSize(720, 405);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    add(new BallPanel());
  }

  public static void main(String[] args) {
    Ex4_2 windows = new Ex4_2();
    windows.setVisible(true);
  }
}

class BallPanel extends JPanel {
  int x = 10;
  int y = 10;

  int mouseX = 10;
  int mouseY = 10;

  public BallPanel() {
    addMouseMotionListener(new MouseAdapter() {
      public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
      }
    });

    new Timer(16, e -> {
      x += (mouseX - x) * 0.05;
      y += (mouseY - y) * 0.05;

      repaint();
    }).start();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.YELLOW);
    g.fillOval(x - 25, y - 25, 50, 50);
    g.setColor(Color.BLACK);
    g.drawOval(x - 25, y - 25, 50, 50);
  };
}